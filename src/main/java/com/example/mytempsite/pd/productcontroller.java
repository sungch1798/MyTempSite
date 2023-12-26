package com.example.mytempsite.pd;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static jakarta.servlet.http.HttpSession.*;

@Controller
public class productcontroller {
    @GetMapping("/product")
    public String showpd(){
        return "product-page";
    }

    @GetMapping("/product1")  //代表網誌上的連結
    public String showD(Model m01, HttpSession session, HttpServletRequest request) {
        session.setAttribute("msg1","透過session 傳遞的資料，需要session.msg1");
        request.setAttribute("msg1","透過request 傳遞資料，不需要request.msg1");
        m01.addAttribute("msg2","系統預設抓取Model和Request值");

        return "product-page";  //導向的網站名稱
    }
}
