package com.wolf.sty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.Map;

/**
 * Created by user on 2020/9/17.
 */
@Controller
@RequestMapping("/jsp/")
public class IndexController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("sayContent","走吃家常面去");
        /**
         *  ModelAndView mav = new ModelAndView("page1");
         *  mav.addObject("content", hello);
         */

        /**
         * Model model
         * // 页面位置 /WEB-INF/views/page1.jsp
         * model.addAttribute("content", hello + "（第二种）");
         */
        return "index";
    }
}
