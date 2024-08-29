package br.xksoberbado.apithree.controller;

import br.xksoberbado.apithree.client.OneClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/hello")
@RequiredArgsConstructor
public class ThreeController {

    private final OneClient client;

    @GetMapping
    public String get(final String name) {
        return client.get() + " Eaew, bem vindo " + name + "!";
    }
}
