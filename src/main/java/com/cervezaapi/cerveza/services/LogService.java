package com.cervezaapi.cerveza.services;

import com.cervezaapi.cerveza.models.LogModel;
import com.cervezaapi.cerveza.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class LogService {
    @Autowired
    LogRepository LogRepository;

    public List<Object> getBeer() {
        String url = "https://api.punkapi.com/v2/beers";
        RestTemplate restTemplate = new RestTemplate();
        long startTime = System.nanoTime();
        Object[] beers = restTemplate.getForObject(url, Object[].class);
        long endTime = System.nanoTime();
        LogModel log = new LogModel(url, LocalDateTime.now(), endTime-startTime);
        LogRepository.save(log);
        return Arrays.asList(beers);
    }

    public List<Object> findByName(String name) {
        String url = "https://api.punkapi.com/v2/beers?beer_name=" + name;
        RestTemplate restTemplate = new RestTemplate();
        long startTime = System.nanoTime();
        Object[] beers = restTemplate.getForObject(url, Object[].class);
        long endTime = System.nanoTime();
        LogModel log = new LogModel(url, LocalDateTime.now(), endTime-startTime);
        LogRepository.save(log);
        return Arrays.asList(beers);
    }

    public List<Object> getRandomBeer() {
        String url = "https://api.punkapi.com/v2/beers/random";
        RestTemplate restTemplate = new RestTemplate();
        long startTime = System.nanoTime();
        Object[] beers = restTemplate.getForObject(url, Object[].class);
        long endTime = System.nanoTime();
        LogModel log = new LogModel(url, LocalDateTime.now(), endTime-startTime);
        LogRepository.save(log);
        return Arrays.asList(beers);
    }
}
