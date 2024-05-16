package com.example.CRUDoperation.controller;

import com.example.CRUDoperation.entity.UserEntity;
import com.example.CRUDoperation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/hello")
    public String sayHelloWorld() {
        return "Hello World!";
    }


    @GetMapping("/get")
    public ResponseEntity getUser(){
        try {
      userService.fatchUserData();
        return ResponseEntity.status(HttpStatus.OK).body("Get All Users Successfully ");
    }catch (Exception e){
            return ResponseEntity.internalServerError().body("User Not Found");
        }

    }

    @PostMapping("/post")
    public ResponseEntity createUser(@RequestBody UserEntity entity) {
        try {
            userService.postUserData(entity);
            return ResponseEntity.status(HttpStatus.OK).body("User Save Successfully ");
        }catch (Exception e){
            return ResponseEntity.internalServerError().body("User Data Not save");
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity deleteUserById(@PathVariable Long id){
        try {
            userService.deleteUser(id);
            return ResponseEntity.status(HttpStatus.OK).body("User delete By ID Successfully ");
        }catch (Exception e){
            return ResponseEntity.internalServerError().body("Could not Found User");
        }
    }

    @PutMapping("/put/{id}")
    public ResponseEntity updateUser(@PathVariable Long id, @RequestBody UserEntity user){
        try {
            userService.userDataUpdate(id, user);
            return ResponseEntity.status(HttpStatus.OK).body("User Updated Successfully ");
        }catch (Exception e){
            return ResponseEntity.internalServerError().body("Could not Update User");
        }

    }


}
