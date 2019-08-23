package com.liumingtai.mongodemo.controller;

import com.liumingtai.mongodemo.modal.User;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.core.query.Criteria;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Collection;
import java.util.List;

@Api(tags = "mongo初始试一试")
@RestController
public class MongoHello {

    @Autowired
    MongoTemplate mongoTemplate;


    @ApiOperation(value = "获取所有的用户", httpMethod = "GET")
    @RequestMapping("hello-mongo")
    List<User> helloWorld(String name, @RequestBody User user) {
//        连接mongodb
        Criteria criteria = where("name").in(name);
        List<User> users = mongoTemplate.findAll(User.class);
        return users;
    }


}
