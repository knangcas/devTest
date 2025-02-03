package com.example.demo1spring.controller;


import com.example.demo1spring.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {


    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {

        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn DevOps", "in28minutes")
        );

    }


}
