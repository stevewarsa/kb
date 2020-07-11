package com.stevewarsa.knowledgebase.dbmodel;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Steve Warsa
 * @since 7/10/2020 6:06 AM
 */
@Entity
@Table(name = "KB_ENTRY")
public class DBKbEntry {
    private Long id;
    private String title;
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DBKbEntry dbKbEntry = (DBKbEntry) o;
        return id.equals(dbKbEntry.id) &&
                title.equals(dbKbEntry.title) &&
                description.equals(dbKbEntry.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }
}
