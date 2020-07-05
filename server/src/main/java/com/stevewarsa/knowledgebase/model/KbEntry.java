package com.stevewarsa.knowledgebase.model;

import lombok.Data;

import java.util.List;

/**
 * @author Steve Warsa
 * @since 7/5/2020 5:39 AM
 */
@Data
public class KbEntry {
    private Long id;
    private String title;
    private String desc;
    private List<Tag> tags;
}
