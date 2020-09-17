package com.wolf.sty;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 2020/9/17.
 */
@RestController
@RequestMapping("/sty/")
public class Sty01Controller {

    @RequestMapping(value = "sty01", method = RequestMethod.GET)
    public String test(
            @RequestParam(value = "name")String name
    ) {
        System.out.println("/sty/sty01");
        return name;
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String test(
    ) {
        System.out.println("/sty/hello");
        return "xxxx";
    }
}
