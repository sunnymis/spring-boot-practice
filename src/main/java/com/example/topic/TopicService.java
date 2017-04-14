package com.example.topic;

import org.springframework.stereotype.Service; 
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
// import com.topic.TopicRepository;

// @Service indicates that this class is a service
// Spring makes services singletons for you.  
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository; 

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
        ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>(); 
        topicRepository
            .findAll()
            .forEach(topics::add);
            return topics; 
    }

    public Topic getTopic(String id) {
        return topicRepository.findOne(id);
//        return topics.stream()
//            .filter(t -> t.getId().equals(id))
//            .findFirst()
//            .get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

     public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
     }

    public void deleteTopic(String id) {
         topicRepository.delete(id);
     }
}
