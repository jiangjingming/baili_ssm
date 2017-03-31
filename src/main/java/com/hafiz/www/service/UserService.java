package com.hafiz.www.service;

import com.hafiz.www.po.UserEntity;

import java.util.List;

/**
 * Created by Thinkpad on 2016/9/14.
 */
public interface UserService {
    /**
     * 获取所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();
}
