package com.galaxy.tax.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.galaxy.tax.entity.Privilege;
import com.galaxy.tax.entity.Role;
import com.galaxy.tax.entity.RolePrivilege;
import com.galaxy.tax.service.PrivilegeService;
import com.galaxy.tax.service.RolePrivilegeService;
import com.galaxy.tax.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Resource
    RoleService roleService;
    @Resource
    PrivilegeService privilegeService;
    @GetMapping
    public String List(Role role, Model model,Integer pages){
        pages = pages ==null?1:pages;
        role.setName(role.getName()==null?"":role.getName());
        model.addAttribute("rolePage",roleService.queryAllByPage(role,pages));
        model.addAttribute("name",role.getName());
        return "role/list";
    }

    @RequestMapping("/insertPage")
    public String insertPage(Model model){
        model.addAttribute("privileges",privilegeService.list());
        return "role/insert";
    }
    @Resource
    RolePrivilegeService rolePrivilegeService;
    @RequestMapping("/insert")
    public String insert(Role role,Integer[] privilegeIds){
        roleService.save(role);
        for (Integer id:privilegeIds ) {
            rolePrivilegeService.save(new RolePrivilege(role.getId(),id));
        }
        return "redirect:/role";
    }


    @RequestMapping("/updatePage")
    public String updatePage(Integer id,Model model){
        Role role = roleService.getById(id);
        String pids = "";
        int i = 0;
        for(Privilege p:role.getPrivileges()){
           pids = pids + p.getId()+",";
        }
        model.addAttribute("role",role);
        model.addAttribute("pids",pids);
        model.addAttribute("privileges",privilegeService.list());
       return "role/update";
    }

    @RequestMapping("/update")
    public String update(Role role,Integer[] privilegeIds){
        roleService.updateById(role);
        rolePrivilegeService.remove(new QueryWrapper<RolePrivilege>().eq("r_id",role.getId()));
        for(Integer id:privilegeIds){
            rolePrivilegeService.save(new RolePrivilege(role.getId(),id));
        }
        return "redirect:/role";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        roleService.removeById(id);
        rolePrivilegeService.remove(new QueryWrapper<RolePrivilege>()
                .eq("r_id",id));
        return "redirect:/role";
    }
}
