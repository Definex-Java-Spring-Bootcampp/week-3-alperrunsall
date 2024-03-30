package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ApplicationRepository {

    private final List<Application> applicationList = new ArrayList<>();
    public List<Application> getApplicationListByEmail(String email){
        return applicationList.stream()
                .filter(byEmail -> byEmail.getUser().getEmail().equals(email))
                .collect(Collectors.toList());
    }

    public Application save(Application application) {
        applicationList.add(application);
        return application;
    }
}
