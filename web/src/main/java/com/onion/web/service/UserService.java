package com.onion.web.service;

import com.onion.api.userapi.UserServiceApi;
import com.onion.pojo.user.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by OnionMac on 2018/2/6.
 */
@FeignClient("user-service")
public interface UserService extends UserServiceApi {

}