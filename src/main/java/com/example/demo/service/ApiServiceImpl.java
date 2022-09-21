package com.example.demo.service;

import com.example.demo.dto.RequestDTO;
import com.example.demo.model.UserDetails;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiServiceImpl implements ApiService{


    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails userDetails(RequestDTO request) {
        UserDetails userDetails = new UserDetails();
        userDetails.setName(request.getName());
        userDetails.setAge(request.getAge());
        return userRepo.save(userDetails);
    }
}
