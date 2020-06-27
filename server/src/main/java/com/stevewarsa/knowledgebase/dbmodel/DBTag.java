package com.stevewarsa.knowledgebase.dbmodel;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "KB_TAG")
public class DBTag {
    private Long id;
    private String tagCd;
    private String tagNm;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DBTag)) return false;
        DBTag dbTag = (DBTag) o;
        return Objects.equals(id, dbTag.id) &&
                Objects.equals(tagCd, dbTag.tagCd) &&
                Objects.equals(tagNm, dbTag.tagNm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tagCd, tagNm);
    }
}
