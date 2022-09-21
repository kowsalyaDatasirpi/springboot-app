package com.example.demo.service;

import com.example.demo.dto.RequestDTO;
import com.example.demo.model.UserDetails;

public interface ApiService {

    default UserDetails userDetails(RequestDTO request) {
        return null;
    }
}
