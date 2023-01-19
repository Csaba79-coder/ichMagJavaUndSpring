package com.csaba79coder.ichmagjavaundspring.controller;

import com.csaba79coder.ichmagjavaundspring.service.LoveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin("http://localhost:8080")
@RequiredArgsConstructor
public class LoveController {

    private final LoveService service;

    @GetMapping({"", "/", "/index", "/home"})
    public String renderResult(Model model) {
        var res = service.checkResult();
        model.addAttribute("love", res);
        return "index";
    }
}
