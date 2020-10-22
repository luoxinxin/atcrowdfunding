package com.luoxinxin.crowd.test;

import com.luoxinxin.crowd.entity.Admin;
import com.luoxinxin.crowd.mapper.AdminMapper;
import com.luoxinxin.crowd.service.api.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
public class testAdminMapperAutowired {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminService adminService;

    @Test
    public void testTx(){
        Admin admin = new Admin(null,"jerry","123456","杰瑞","jerry@qq.com",null);
        adminService.saveAdmin(admin);
    }

    @Test
    public void testLog(){

        Logger logger = LoggerFactory.getLogger(testAdminMapperAutowired.class);

        logger.debug("debug!!");

        logger.info("Info!!");

        logger.warn("warn!!");

        logger.error("error!!");

        System.out.println(logger);
        System.out.println(logger.toString());
    }

    @Test
    public void test1(){

        Admin adminInsert = new Admin(null,"tom","123123","汤姆","tom@qq.com",null);
        int count = adminMapper.insert(adminInsert);
        System.out.println(count);
//        Admin admin = adminMapper.selectByPrimaryKey(1);
//        System.out.println(admin);
    }

}
