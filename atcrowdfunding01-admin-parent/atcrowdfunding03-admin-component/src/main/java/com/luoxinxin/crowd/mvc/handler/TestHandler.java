package com.luoxinxin.crowd.mvc.handler;


import com.luoxinxin.crowd.entity.Admin;
import com.luoxinxin.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

@Controller
public class TestHandler {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/send/array.html")
    public String testReceiveArrayOne(@RequestParam("array[]") List<Integer> array){
        for(Integer number : array){
            System.out.println("number=" + number);
        }
        return null;

    }

    @RequestMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap){
        List<Admin> adminList = adminService.getAll();
        modelMap.addAttribute("adminList", adminList);
        return "target";
    }


}
