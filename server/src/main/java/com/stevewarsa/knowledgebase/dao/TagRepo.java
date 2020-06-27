package com.stevewarsa.knowledgebase.dao;

import com.stevewarsa.knowledgebase.dbmodel.DBTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepo extends JpaRepository<DBTag, Long> {
}
