package com.ead.course.services.implementation;

import com.ead.course.repositories.CourseUserRepository;
import com.ead.course.services.CourseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseUserServiceImplementation implements CourseUserService {

    @Autowired
    CourseUserRepository courseUserRepository;
}
