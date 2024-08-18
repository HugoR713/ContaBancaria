package Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/login")
public class LoginController {


    @GetMapping
    public String home(){
        return "Ben vindo a sua conta";
    }
}
