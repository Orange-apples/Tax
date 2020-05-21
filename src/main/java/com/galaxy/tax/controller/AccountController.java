package com.galaxy.tax.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.galaxy.tax.component.ConstantNum;
import com.galaxy.tax.entity.Account;
import com.galaxy.tax.entity.Role;
import com.galaxy.tax.service.AccountService;
import com.galaxy.tax.service.DeptService;
import com.galaxy.tax.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2020-05-15 16:35:55
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    /**
     * 服务对象
     */
    @Resource
    private AccountService accountService;

    @RequestMapping("/login")
    public String login(Account account, Model model, HttpServletRequest request) {
        if (true) {
            return "/home/home";
        } else {
            model.addAttribute("loginMsg", "用户名密码错误！");
            return "/login";
        }

    }

    /**
     * 获取account列表
     *
     * @param account
     * @param model
     * @return
     */
    @GetMapping
    public String List(Account account, Model model, Integer pages) {
        account.setName(account.getName() == null ? "" : account.getName());
        pages = pages == null ? 1 : pages;
        Page<Account> page = accountService.queryAll(pages, account);
        model.addAttribute("page", page);
        model.addAttribute("name", account.getName());
        return "/account/list";
    }

    @RequestMapping("delete")
    public String deleteById(Integer id, HttpServletRequest request) {
        String imgPath = accountService.getImg(id);
        new File(request.getServletContext().getRealPath("") + imgPath).delete();
        accountService.removeById(id);
        return "redirect:/account";

    }

    @RequestMapping("deleteAll")
    public String deleteAll(Integer[] ids, HttpServletRequest request) {
        if (ids != null) {
            for (Integer id : ids) {
                this.deleteById(id, request);
            }
        }
        return "redirect:/account";
    }

    @Resource
    DeptService deptService;
    @Resource
    RoleService roleService;

    @RequestMapping("updatePage")
    public String updatePage(Integer id, Model model) {
        model.addAttribute("account", accountService.getById(id));
        model.addAttribute("deptList", deptService.list());
        model.addAttribute("roleList", roleService.list());
        return "/account/update";
    }

    @RequestMapping("/update")
    public String update(@Valid Account account, MultipartFile file, HttpServletRequest request) throws FileNotFoundException {
        //删除旧照片
        String realPath = request.getServletContext().getRealPath(ConstantNum.uploadPath + "/accountImg/");
//        String realPath = ResourceUtils.getURL("classpath:").getPath() + ConstantNum.uploadPath+"/accountImg/";

        File path = new File(realPath);
        if (!path.exists()) path.mkdirs();
        String oldImg = request.getServletContext().getRealPath("") + account.getHeadImg();
//
        System.out.println("oldImage:" + oldImg);
        //
        if (!file.isEmpty()) {
            new File(oldImg).delete();
            String fileName = new Date().getTime() + file.getOriginalFilename();
            account.setHeadImg(ConstantNum.uploadPath + "/accountImg/" + fileName);
            try {
                file.transferTo(new File(realPath + fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        accountService.updateById(account);
        return "redirect:/account";
    }

    @RequestMapping("insertPage")
    public String insertPage(Model model) {
        model.addAttribute("deptList", deptService.list());
        model.addAttribute("roleList", roleService.list());
        return "/account/insert";
    }

    @RequestMapping("/insert")
    public String insert(@Valid Account account, MultipartFile file, HttpServletRequest request) throws FileNotFoundException {
//        System.out.println(ResourceUtils.getURL("classpath:").getPath() + ConstantNum.uploadPath);
        String realPath = request.getServletContext().getRealPath(ConstantNum.uploadPath) + "/accountImg/";
//        String realPath = ResourceUtils.getURL("classpath:").getPath() + ConstantNum.uploadPath+"/accountImg/";
        System.out.println(realPath);
        File pathFile = new File(realPath);
        if (!pathFile.exists()) pathFile.mkdirs();
        String fileName = new Date().getTime() + file.getOriginalFilename();
        account.setHeadImg(ConstantNum.uploadPath + "/accountImg/" + fileName);
        try {
            file.transferTo(new File(realPath + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        accountService.save(account);
        return "redirect:/account";
    }

}