package com.example.spring.batch.config;

import com.example.spring.batch.model.Student;
import com.example.spring.batch.repository.StudentRepository;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Student> {
    @Autowired
    private StudentRepository repository;


    @Override
    public void write(List<? extends Student> list) throws Exception {
        System.out.println("Data Saved for Students: " + list);
        repository.saveAll(list);
    }
}
