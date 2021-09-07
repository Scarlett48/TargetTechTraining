package com.aique.springbootdemo.controller;

import com.aique.springbootdemo.model.User;
import com.aique.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;


    //    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @GetMapping("/users")
    public ResponseEntity<List<User>> listAllUsers(){

        return new ResponseEntity<List<User>>(userService.getUsers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable("id") Long id){
        return new ResponseEntity<User>(userService.getUser(id),HttpStatus.OK);
    }

//    @RequestMapping(value = "/user/create",method = RequestMethod.POST)
    @PostMapping("/user/create")
    public ResponseEntity<?> createUser(@RequestBody User user){
        userService.saveUser(user);
        return new ResponseEntity<String>(user.getName(),HttpStatus.CREATED);
    }

//    @RequestMapping(value = "/user/update",method = RequestMethod.PUT)
    @PutMapping("/user/update")
    public ResponseEntity<?> updateUser(@RequestBody User user){
        userService.updateUser(user);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }
}
