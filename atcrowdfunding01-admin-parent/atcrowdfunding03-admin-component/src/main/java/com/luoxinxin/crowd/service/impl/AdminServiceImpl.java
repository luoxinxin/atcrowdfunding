package com.luoxinxin.crowd.service.impl;

import com.luoxinxin.crowd.entity.Admin;
import com.luoxinxin.crowd.entity.AdminExample;

import com.luoxinxin.crowd.mapper.AdminMapper;
import com.luoxinxin.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Comments:
 * Author：  luoxinxin
 * Create Date：  2020-10-22
 * Modified By： luoxinxin
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    public void saveAdmin(Admin admin) {
        adminMapper.insert(admin);
    }

    public List<Admin> getAll() {

        return adminMapper.selectByExample(new AdminExample());
    }


}
