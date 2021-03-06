package com.onion.api.userapi;

import com.onion.pojo.user.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by OnionMac on 2018/2/6.
 */
@RequestMapping("user")
public interface UserServiceApi {

    @GetMapping("/getName")
    String getName();

    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    User findUserById(@PathVariable("id") int id);

}
