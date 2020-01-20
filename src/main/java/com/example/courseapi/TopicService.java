package com.example.courseapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring Description", "spring", "Spring Framework"),
            new Topic("Java Description", "java", "Core Java"),
            new Topic("Javascript Description", "javascript", "Javascript Framework")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);   //get the topics at their index
            if (t.getId().equals(id)) {  // check the id of the gotten topic
                topics.set(i, topic);    //use set method to change  the value of the object at the position
                return;
            }
        }
    }

    public String deleteTopic(String id, Topic topic) {
        topics.removeIf(topic1 -> topic1.getId().equals(id));
        return "Deleted Successfully";
    }
}
