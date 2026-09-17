package com.kaviya.project1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
public class HomeController {
    @GetMapping("hello")
    public String get() {
        return "Hello World";
    }
    @PostMapping("create")
    public String create(@RequestBody String payload) {
        return payload + " created successfully!";
    }
    @PutMapping("update")
    public String update(@RequestBody String payload) {
        return payload + " updated successfully!";
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable String id){
        return "Deleted" + " " + id;
    }
    @GetMapping("get/{id}")
    public String get(@PathVariable String id){
        return "Fetche"+ " " + id;
    }
}
