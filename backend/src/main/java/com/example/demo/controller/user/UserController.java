package com.example.demo.controller.user;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.demo.model.user.User;
import com.example.demo.repository.user.UserRepository;

@RestController 
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserRepository userRepository;
    
    @RequestMapping(method=RequestMethod.GET)
    public List<User> list(Model model) throws Exception {
        return userRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST)
    public User create(@RequestBody User user) throws Exception {
        return userRepository.insert(user);
    }    
}