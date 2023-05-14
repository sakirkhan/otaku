package com.otaku.controller;

import com.otaku.model.User;
import com.otaku.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/v1/user")
    public ResponseEntity<User> getUserDetail(){
        User user = new User ();
//        user.setUserId (1);
//        user.setUserName ("abc");

        if(user == null){
//            return new ResponseEntity<> (new ApiResponse<> (HttpStatus.NOT_FOUND,"user not found",user),HttpStatus.NOT_FOUND);
        }
//        return new ApiResponse<> (HttpStatus.OK,"user found",user);
         return new ResponseEntity<>  (user,HttpStatus.OK);
    }


}
