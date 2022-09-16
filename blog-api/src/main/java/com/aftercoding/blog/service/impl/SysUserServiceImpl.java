package com.aftercoding.blog.service.impl;

import com.aftercoding.blog.dao.mapper.SysUserMapper;
import com.aftercoding.blog.dao.pojo.SysUser;
import com.aftercoding.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-09-16 22:58
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    public SysUser findUserById(Long id){
        SysUser sysUser = sysUserMapper.selectById(id);
        if(sysUser == null){
            sysUser = new SysUser();
            sysUser.setNickname("比尔令狐");
        }
        return sysUser;
    }
}
