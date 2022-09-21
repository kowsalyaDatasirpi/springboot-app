package com.example.demo.controller;

import com.example.demo.dto.RequestDTO;
import com.example.demo.model.UserDetails;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class Controller {

    @Autowired
    private ApiService apiService;

    @PostMapping("/user-details")
    public UserDetails userDetails(@RequestBody RequestDTO request) {
        return apiService.userDetails(request);
    }

}
