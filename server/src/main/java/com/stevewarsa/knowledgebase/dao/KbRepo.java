package com.stevewarsa.knowledgebase.dao;

import com.stevewarsa.knowledgebase.dbmodel.DBKbEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KbRepo extends JpaRepository<DBKbEntry, Long> {
}
