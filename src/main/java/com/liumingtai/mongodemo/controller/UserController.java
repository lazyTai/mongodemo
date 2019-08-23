package com.liumingtai.mongodemo.controller;

import com.liumingtai.mongodemo.modal.User;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("user controller")
@RequestMapping("/user")
public class UserController {
    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    User addUser(@RequestBody User user) {
        return mongoTemplate.save(user);
    }
}
