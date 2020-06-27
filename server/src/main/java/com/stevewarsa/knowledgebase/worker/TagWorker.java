package com.stevewarsa.knowledgebase.worker;

import com.stevewarsa.knowledgebase.dao.TagRepo;
import com.stevewarsa.knowledgebase.dbmodel.DBTag;
import com.stevewarsa.knowledgebase.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TagWorker {
    @Autowired
    private TagRepo tagRepo;

    public List<Tag> getTags() {
        try (Stream<DBTag> tags = tagRepo.findAll().stream()) {
            return tags.map(tag -> {
                Tag tagObj = new Tag();
                tagObj.setTagId(tag.getId());
                tagObj.setTagCd(tag.getTagCd());
                tagObj.setTagNm(tag.getTagNm());
                return tagObj;
            }).collect(Collectors.toList());
        }
    }
}
