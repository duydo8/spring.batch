package com.example.spring.batch.config;

import com.example.spring.batch.model.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class StudentProcessor implements ItemProcessor<Student,Student > {
    @Override
    public Student process(Student item) throws Exception {

        return item;
    }
}
