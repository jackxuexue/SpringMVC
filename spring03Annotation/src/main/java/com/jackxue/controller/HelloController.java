package com.jackxue.controller;

import com.jackxue.pojo.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloController {
    //实际访问路径：localhost:8080/[项目名]/test/hello
    @RequestMapping(value = "/hello/{p1}/{p2}", method = {RequestMethod.GET, RequestMethod.POST})
//    @GetMapping("/hello1")
//    @PostMapping("/hello2")
    public String SayHello(@PathVariable  String p1, @PathVariable  String p2, Model model){
        model.addAttribute("msg", "hello, SpringMVCAnotation!" + p1 + p2); //封装域对象的值
        return "hello";  //返回视图名称，通过视图解析器拼接前缀和后缀
    }

    @GetMapping("/t1")
    public String test01(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("msg", "hello dispatcher");
        return "redirect:/index.jsp";
    }
    @GetMapping("/t2")
    public String test02(Model model){
        model.addAttribute("msg", "hello1");
        return "forward:/index.jsp";
    }
    @GetMapping("/t3")
    public String test03(@RequestParam("name") String name1, Model model){
        model.addAttribute("msg", name1);
        return "hello";
    }
    @GetMapping("/t4")
    public String test04(User user){
        System.out.println(user);
        return "hello";
    }

    @PostMapping("/t5")
    public String test05(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg", name);
        return "hello";
    }
}
