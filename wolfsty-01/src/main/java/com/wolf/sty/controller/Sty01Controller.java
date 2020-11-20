package com.wolf.sty.controller;

import com.wolf.sty.common.vo.JSONResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2020/9/17.
 */
@RestController
@RequestMapping("/sty/")
public class Sty01Controller {

    @RequestMapping(value = "sty01", method = {RequestMethod.GET,RequestMethod.POST})
    public String test(
            @RequestParam(value = "name")String name
    ) {
        System.out.println("/sty/sty01");
        return name;
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public JSONResult test(
    ) {
        System.out.println("/sty/hello");
        Map<String, String> result = new HashMap<>();
        result.put("domain","domain地址");
        result.put("token","tokenValue");
        return new JSONResult(result);
    }
}
