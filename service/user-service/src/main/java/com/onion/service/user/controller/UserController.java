package com.onion.service.user.controller;

import com.onion.api.userapi.UserServiceApi;
import com.onion.pojo.user.User;
import com.onion.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by OnionMac on 2018/2/6.
 */
@RestController
public class UserController implements UserServiceApi {

    @Autowired
    UserService userService;

    @Override
    public String getName(){
        return userService.getName();
    }

    @Override
    public User findUserById(@PathVariable("id") int id) {
        return userService.findUserById(id);
    }

}
