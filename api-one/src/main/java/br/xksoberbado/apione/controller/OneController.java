package br.xksoberbado.apione.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/hello")
public class OneController {

    @GetMapping
    public String get() {
        return "Olaaa!";
    }
}
