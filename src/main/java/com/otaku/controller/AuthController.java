package com.otaku.controller;

import com.otaku.dto.SignupDTO;
import com.otaku.model.User;
import com.otaku.response.ApiResponse;
import com.otaku.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    UserService userService;

    @PostMapping("/api/user/signup")
    public ResponseEntity<ApiResponse<User>> userSignup(@RequestBody SignupDTO signupDTO) throws Exception {
        try{
            User user =   userService.signUp (signupDTO);
            return new ResponseEntity<> (new ApiResponse<> (HttpStatus.OK,"user saved",user),HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<> (new ApiResponse<> (HttpStatus.INTERNAL_SERVER_ERROR,e.getMessage (),null),HttpStatus.OK);
        }
    }
}
