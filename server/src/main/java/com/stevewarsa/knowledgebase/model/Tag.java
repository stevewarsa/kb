package com.stevewarsa.knowledgebase.model;

public class Tag {
    private Long tagId;
    private String tagNm;
    private String tagCd;

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getTagNm() {
        return tagNm;
    }

    public void setTagNm(String tagNm) {
        this.tagNm = tagNm;
    }

    public String getTagCd() {
        return tagCd;
    }

    public void setTagCd(String tagCd) {
        this.tagCd = tagCd;
    }
}
