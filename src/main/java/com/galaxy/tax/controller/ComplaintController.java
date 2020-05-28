package com.galaxy.tax.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.galaxy.tax.entity.Account;
import com.galaxy.tax.entity.Complaint;
import com.galaxy.tax.entity.Info;
import com.galaxy.tax.service.ComplaintService;
import com.galaxy.tax.service.DeptService;
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
import java.text.ParseException;
import java.util.Date;

@Controller
@RequestMapping("/complaint")
public class ComplaintController {
    @Resource
    DeptService deptService;

    @Resource
    ComplaintService complaintService;

    @RequestMapping("/insertPage")
    public String insertPage(Model model){
        model.addAttribute("deptList",deptService.list());
        return "complaint/insert";
    }
    @RequestMapping("/insert")
    public String insert(Complaint complaint, Model model,HttpServletRequest request){
        complaint.setAccountId(((Account) request.getSession().getAttribute("loginAccount")).getId());
        complaint.setCreateTime(new Date());
        complaintService.save(complaint);
        return "redirect:/account/home";
    }

    @GetMapping
    public String list(Model model,Integer pages,String title,String state,String startTime,String endTime) throws ParseException {

        title = title==null?"":title;
        state = state==null?"":state;
        startTime = startTime==null?"":startTime;
        endTime = endTime==null?"":endTime;
        pages = pages==null?1:pages;
        model.addAttribute("page",complaintService.queryByPage(pages,title,state,startTime,endTime));
        model.addAttribute("title",title);
        model.addAttribute("state",state);
        model.addAttribute("startTime",startTime);
        model.addAttribute("endTime",endTime);
        return "complaint/list";
    }
    @RequestMapping("/dealInfo")
    public String dealInfo(Integer id, Model model){
        model.addAttribute("complaint",complaintService.getById(id));
        return "complaint/dealInfo";
    }
    @RequestMapping("/deal")
    public String deal(Complaint complaint, Model model,HttpServletRequest request){
        System.out.println(complaint);
        Account loginAccount = (Account) request.getSession().getAttribute("loginAccount");
        complaint.setDealInfo(new Date()+"\r\n\t"+loginAccount.getDept().getName()+"-->"+loginAccount.getName()+":\r\n\t\t"+complaint.getDealInfo());
        complaint.setState("1");
        complaintService.updateById(complaint);
        return "redirect:/complaint";
    }
}
