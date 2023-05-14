package com.otaku.service;

import com.otaku.dto.SignupDTO;
import com.otaku.model.Gender;
import com.otaku.model.User;
import com.otaku.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User signUp(SignupDTO signupDTO) throws Exception{

        if(!userRepository.findByEmail (signupDTO.getEmail ()).isEmpty ()){
            throw new Exception ("Email already exists");
        }

        if(!userRepository.findByUserName (signupDTO.getUserName()).isEmpty ()){
            throw new Exception ("UserName already exists");
        }

        User user = new User();
        user.setFirstName (signupDTO.getFirstName ());
        user.setLastName (signupDTO.getLastName ());
        user.setEmail(signupDTO.getEmail ());
        user.setGender (Gender.MALE);
        user.setUserName (signupDTO.getUserName ());
        user.setMobileNumber ("3324832042");
        user.setPassword (signupDTO.getPassword ());

        try {
             user = userRepository.save (user);
            return user;
        } catch (Exception e){
            throw new Exception ("Error while saving the user");
        }

    }
}
