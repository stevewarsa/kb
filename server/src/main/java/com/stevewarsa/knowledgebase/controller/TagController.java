package com.stevewarsa.knowledgebase.controller;

import com.stevewarsa.knowledgebase.model.Tag;
import com.stevewarsa.knowledgebase.worker.TagWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/tag")
public class TagController {
    @Autowired
    private TagWorker tagWorker;

    @RequestMapping("/getTags")
    public List<Tag> getTags() {
        return tagWorker.getTags();
    }
}
