package com.luoxinxin.crowd.service.api;

import com.luoxinxin.crowd.entity.Admin;

import java.util.List;

/**
 * Comments:
 * Author：  luoxinxin
 * Create Date：  2020-10-22
 * Modified By： luoxinxin
 */
public interface AdminService {
    void saveAdmin(Admin admin);

    List<Admin> getAll();
}
