package com.len.blog.workspaces.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyong
 * @version 1.0
 * @className LoginController
 * @description LoginController
 * @date 2020/9/19 10:59
 */
@RestController
@RequestMapping("system")
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return null;
    }

    @RequestMapping(value = "loginout", method = RequestMethod.GET)
    public String out() {
        return null;
    }
}
