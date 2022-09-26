package com.yuricjardim.sbmongdb.services;

import com.yuricjardim.sbmongdb.domain.User;
import com.yuricjardim.sbmongdb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
