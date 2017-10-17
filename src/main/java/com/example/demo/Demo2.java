package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author changwenhu
 * @date 2017/8/26
 * @Description ${todo}
 */
@Controller
@CrossOrigin//解决跨域问题
public class Demo2 {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        System.out.println(System.currentTimeMillis());
        return "Hello World ! ! !";
    }
}
