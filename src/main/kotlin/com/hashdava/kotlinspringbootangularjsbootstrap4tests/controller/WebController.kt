package com.hashdava.kotlinspringbootangularjsbootstrap4tests.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {

    @GetMapping(value = ["/"])
    fun homepage() : String {
        return "index";
    }
}