package com.ead.course.services.implementation;

import com.ead.course.models.LessonModel;
import com.ead.course.repositories.LessonRepository;
import com.ead.course.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImplementation implements LessonService {

    @Autowired
    LessonRepository lessonRepository;

    @Override
    public LessonModel save(LessonModel lessonModel) {
        return lessonRepository.save(lessonModel);
    }
}
