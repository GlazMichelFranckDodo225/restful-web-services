package com.dgmf.controller;

import com.dgmf.entity.HelloWorldBean;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {
    private final MessageSource messageSource;

    // @RequestMapping(path = "/hello-world", method = RequestMethod.GET)
    // @GetMapping(path = "/hello-world")
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World !";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World Bean !");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s !", name));
    }

    @GetMapping("/hello-world-i18n")
    public String helloWorldI18N() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(
                "good.morning.message",
                null,
                "Default Message",
                locale
        );

        // return "Hello World ! - V2";
    }
}
