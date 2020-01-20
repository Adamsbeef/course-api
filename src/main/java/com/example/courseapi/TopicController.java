package com.example.courseapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring Description", "spring", "Spring Framework"),
                new Topic("Java Description", "Java", "Core Java"),
                new Topic("Javascript Description", "Javascript", "Javascript Framework")
        );
    }
}
