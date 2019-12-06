package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * @author yqq
 * @date 2019/12/1 23:11
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);

    ServerResponse<Object> register(User user);

    ServerResponse<String> checkValid(String str,String type);
}
