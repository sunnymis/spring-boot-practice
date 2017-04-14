package com.example.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import com.topic.CourseRepository;

// @Service indicates that this class is a service
// Spring makes services singletons for you.  
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository
            .findByTopicId(topicId)
            .forEach(courses::add);
            return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

     public void updateCourse(Course course) {
        courseRepository.save(course);
     }

    public void deleteCourse(String id) {
         courseRepository.delete(id);
     }
}