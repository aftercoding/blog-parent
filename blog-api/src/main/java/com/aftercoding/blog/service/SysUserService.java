package com.aftercoding.blog.service;

import com.aftercoding.blog.dao.pojo.SysUser;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-09-16 22:56
 */
public interface SysUserService {
    SysUser findUserById(Long id);
}
