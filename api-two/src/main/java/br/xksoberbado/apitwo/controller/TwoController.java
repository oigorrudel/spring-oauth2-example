package br.xksoberbado.apitwo.controller;

import br.xksoberbado.apitwo.client.OneClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/hello")
@RequiredArgsConstructor
public class TwoController {

    private final OneClient client;

    @GetMapping
    public String get(final String name) {
        return client.get() + " Bem vindo " + name + "!";
    }
}
