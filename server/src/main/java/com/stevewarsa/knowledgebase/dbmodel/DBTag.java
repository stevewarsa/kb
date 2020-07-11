package com.stevewarsa.knowledgebase.dbmodel;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "KB_TAG")
public class DBTag {
    private Long id;
    private String tagCd;
    private String tagNm;
    private Set<DBKbEntry> entries;

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
    @Column(name = "TAG_CD")
    public String getTagCd() {
        return tagCd;
    }

    public void setTagCd(String tagCd) {
        this.tagCd = tagCd;
    }

    @Basic
    @Column(name = "TAG_NM")
    public String getTagNm() {
        return tagNm;
    }

    public void setTagNm(String tagNm) {
        this.tagNm = tagNm;
    }

    @ManyToMany(mappedBy = "tags")
    public Set<DBKbEntry> getEntries() {
        return entries;
    }

    public void setEntries(Set<DBKbEntry> entries) {
        this.entries = entries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DBTag dbTag = (DBTag) o;

        if (!id.equals(dbTag.id)) return false;
        if (!tagCd.equals(dbTag.tagCd)) return false;
        return tagNm.equals(dbTag.tagNm);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + tagCd.hashCode();
        result = 31 * result + tagNm.hashCode();
        return result;
    }
}
