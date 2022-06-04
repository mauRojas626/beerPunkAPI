package com.cervezaapi.cerveza.controllers;

import com.cervezaapi.cerveza.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/beer")
public class LogController {
    @Autowired
    LogService logService;

    @GetMapping()
    public List<Object> getBeer() {
        return logService.getBeer();
    }

    @GetMapping( path = "/random" )
    public List<Object> getRandomBeer() {
        return logService.getRandomBeer();
    }

    @GetMapping( path = "/{name}" )
    public List<Object> findBeerByName(@PathVariable("name") String name) {
        return logService.findByName(name);
    }
}
