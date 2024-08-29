package br.xksoberbado.apithree.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "one-client", url = "http://localhost:9001")
public interface OneClient {

    @GetMapping("v1/hello")
    String get();
}
