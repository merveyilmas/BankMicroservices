package com.meryilbank.gatewayserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/contactSupport")
    public Mono<String> contactSupport() {
        // you can send the email which inside an error to support team
        return Mono.just("An error occurred. Please try after some time or contact support team!!!");
    }
}
