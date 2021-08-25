package huaxin.controller;

import huaxin.entity.User;
import huaxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Descrition
 * @Author xiagf
 * @Date 2021/8/24 19:24
 * @Version 1.0
 */
@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public List<User> getall(){
        return userService.selectAll();
    }
}
