package com.stevewarsa.knowledgebase.dbmodel;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * @author Steve Warsa
 * @since 7/10/2020 6:06 AM
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "KB_ENTRY")
public class DBKbEntry {
    private Long id;
    private String title;
    private String description;
    private Set<DBTag> tags;

    @Id
    @GeneratedValue(generator = "kb_entry_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "kb_entry_generator", sequenceName = "kb_entry_id_seq", allocationSize = 1)
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

    @ManyToMany
    @JoinTable(
            name = "kb_tag_kb_entry",
            joinColumns = @JoinColumn(name = "kb_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    public Set<DBTag> getTags() {
        return tags;
    }

    public void setTags(Set<DBTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DBKbEntry dbKbEntry = (DBKbEntry) o;
        return id.equals(dbKbEntry.id) &&
                title.equals(dbKbEntry.title) &&
                description.equals(dbKbEntry.description) &&
                Objects.equals(tags, dbKbEntry.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, tags);
    }
}
