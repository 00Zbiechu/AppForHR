package pl.hrmanagement.appforhr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.hrmanagement.appforhr.service.PracownikService;


@RestController
@RequestMapping("/app")
@RequiredArgsConstructor
public class AppController {

    private final PracownikService pracownikService;

    @GetMapping
    public String getIndexPage() {
        return "app";

    }


}
