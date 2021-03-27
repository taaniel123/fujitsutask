package com.fujitsutask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository repo;

    public List<Feedback> listAll() {
        return repo.findAll();
    }

    public void save(Feedback feedback) {
        repo.save(feedback);
    }

    public Feedback get(Long id) {
        return repo.findById(id).get();
    }

}
