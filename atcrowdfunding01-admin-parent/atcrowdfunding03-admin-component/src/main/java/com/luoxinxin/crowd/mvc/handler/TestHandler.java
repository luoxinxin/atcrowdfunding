package com.luoxinxin.crowd.mvc.handler;


import com.luoxinxin.crowd.entity.Admin;
import com.luoxinxin.crowd.entity.ParamData;
import com.luoxinxin.crowd.entity.Student;
import com.luoxinxin.crowd.service.api.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

@Controller
public class TestHandler {

    Logger logger = LoggerFactory.getLogger(TestHandler.class);

    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping("/send/array/one.html")
    public String testReceiveArrayOne(@RequestParam("array[]") List<Integer> array){

        for(Integer number : array){
            System.out.println("number=" + number);
        }
        return "success";

    }

    @ResponseBody
    @RequestMapping("/send/array/two.html")
    public String testReceiveArrayTwo(ParamData paramData){

        List<Integer> array = paramData.getArray();
        for(Integer number : array){
            System.out.println("number=" + number);
        }
        return "success";

    }

    @ResponseBody
    @RequestMapping("/send/array/three.html")
    public String testReceiveArrayThree(@RequestBody List<Integer> array){
        for(Integer number : array){
            System.out.println("number=" + number);
            logger.info("number"+number);
        }
        return "success";

    }

    @RequestMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap){
        List<Admin> adminList = adminService.getAll();
        modelMap.addAttribute("adminList", adminList);
        return "target";
    }

    @ResponseBody
    @RequestMapping("/send/compose/object.html")
    public String testReceiveComposeObject(@RequestBody Student student){
        logger.info(student.toString());

        return "success";
    }


}
