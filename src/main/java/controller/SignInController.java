package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

@Controller
public class SignInController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toSignIn")
    public String toSignIn() {
        return "signIn";
    }

    @RequestMapping("/signIn")
    public String signIn(User user) {
        userService.saveUser(user);
        return "redirect:login";
    }
}
