package com.zlq.web.controller;


import com.zlq.web.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User {@link RestController}
 *
 * @author zlq
 * @since 2019/7/30
 */
@RestController
public class UserRestController {

    @PostMapping(value = "/echo/user")
    public User user(@RequestBody User user){
        return user;
    }

}
