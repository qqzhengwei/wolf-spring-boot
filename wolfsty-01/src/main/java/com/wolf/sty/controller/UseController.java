package com.wolf.sty.controller;

import com.wolf.sty.bean.User;
import com.wolf.sty.common.vo.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2020/9/17.
 */
@RestController
@RequestMapping("user/")
public class UseController {

    @Autowired
    private User user;

    @RequestMapping(value = "getInitUser", method = RequestMethod.GET)
    public JSONResult getInitUser(
    ) {
        System.out.println("/user/getInitUser");
        return new JSONResult(user);
    }
}
