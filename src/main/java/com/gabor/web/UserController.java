package com.gabor.web;

import com.gabor.domain.User;
import com.gabor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Gabor on 2017/6/19.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String forwardRegister(Model model){
        model.addAttribute("user",new User());
        return "register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute User user, BindingResult result, Model model){
        if (result.hasErrors()) {
            System.out.println(result.getAllErrors());
            model.addAttribute("result", "有错误！请检查表单");
        }else {

            if (userService.addUser(user))
                model.addAttribute("result", "注册成功!");
            else
                model.addAttribute("result", "注册失败...可能是服务器太忙，过会儿再来是试试吧");
        }
        return "register";
    }

    @RequestMapping("/validateName")
    @ResponseBody
    public boolean validateName(@RequestParam String name){
        return userService.validateName(name);
    }
}
