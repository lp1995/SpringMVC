package com.spring.controller;

/**
 * Created by lenovo on 2017/6/14.
 */
@Controller
@RequestMapping("/")
public class TestController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        //绑定变量
        model.addAttribute("message", "Hello world!");
        //返回hello，则视图解析器会自动加前后缀，最后解析到/WEB-INF/pages/hello.jsp
        return "hello";

    }
}
