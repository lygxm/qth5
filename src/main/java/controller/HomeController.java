package controller;

import com.google.gson.Gson;
import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "redirect:login";
    }

    @RequestMapping("/toJson")
    public String toJson() {
        return "json";
    }

    @RequestMapping("/json")
    @ResponseBody
    //该注解阻止json跳转
    //return new User实际上是将其转为json表达式进行返回
    public User json() {
        return new User(1, "tom@google.com", "password", 10, new Timestamp(System.currentTimeMillis()));
    }
}
