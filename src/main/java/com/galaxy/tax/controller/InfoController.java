package com.galaxy.tax.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.galaxy.tax.entity.Account;
import com.galaxy.tax.entity.Info;
import com.galaxy.tax.service.InfoCategoryService;
import com.galaxy.tax.service.InfoService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/info")
public class InfoController {
    @Resource
    InfoService infoService;

    @GetMapping
    public String list(Info info, Integer pages, Model model) {
        info.setTitle(info.getTitle() == null ? "" : info.getTitle());
        pages = pages == null ? 1 : pages;
        Page<Info> page = infoService.queryAll(pages, info);
        model.addAttribute("page", page);
        model.addAttribute("title", info.getTitle());
        return "/info/list";
    }

    @Resource
    InfoCategoryService infoCategoryService;


    @RequestMapping("/getPage")
    public String updatePage(Integer id, ModelMap modelMap) {
        System.out.println(id);
        modelMap.addAttribute("categoryList", infoCategoryService.list());
        if (id != 0) {
            modelMap.addAttribute("info", infoService.getById(id));
        }
        return "/info/insert";
    }

    @RequestMapping("/insertOrUpdate")
    public String insert(Info info, HttpServletRequest request) {
        System.out.println(info.getId());
        info.setState("启用");
        info.setAccountId(info.getAccountId() == null ? ((Account) request.getSession().getAttribute("loginAccount")).getId() : info.getAccountId());
        info.setCreateTime(info.getCreateTime() == null ? new Date() : info.getCreateTime());
        infoService.saveOrUpdate(info);
        return "redirect:/info";
    }

    @RequestMapping("/delete")
    public String delete(Integer id) {
        infoService.removeById(id);
        return "redirect:/info";
    }

    @RequestMapping("/deleteAll")
    public String deleteAll(Integer[] ids) {
        for (Integer id : ids) {
            infoService.removeById(id);
        }
        return "redirect:/info";
    }

    @RequestMapping("/stopOrStart")
    public String stopOrStart(Integer id, String state) {
        state = "1".equals(state) ? "0" : "1";
        infoService.update(new UpdateWrapper<Info>()
                .eq("id", id)
                .set(true, "state", state)

        );
        return "redirect:/info";
    }

}
