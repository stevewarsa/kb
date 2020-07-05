package com.stevewarsa.knowledgebase.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Steve Warsa
 * @since 7/5/2020 5:39 AM
 */
@Data
@NoArgsConstructor
public class KbEntry {
    private Long id;
    private String title;
    private String desc;
    private List<Tag> tags;

    @Override
    public String toString() {
        return "KbEntry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", tags=" + tags +
                '}';
    }
}
