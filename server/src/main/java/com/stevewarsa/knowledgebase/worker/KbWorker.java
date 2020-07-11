package com.stevewarsa.knowledgebase.worker;

import com.stevewarsa.knowledgebase.dao.KbRepo;
import com.stevewarsa.knowledgebase.dbmodel.DBKbEntry;
import com.stevewarsa.knowledgebase.model.KbEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Steve Warsa
 * @since 7/10/2020 6:15 AM
 */
@Service
public class KbWorker {
    @Autowired
    private KbRepo kbRepo;

    public void saveKbEntry(KbEntry kbEntry) {
        DBKbEntry dbKbEntry = new DBKbEntry();
        dbKbEntry.setDescription(kbEntry.getDesc());
        dbKbEntry.setTitle(kbEntry.getTitle());
        dbKbEntry = this.kbRepo.save(dbKbEntry);
        // SW[07/10/20 06:22:20] The returned object should have the ID populated
        kbEntry.setId(dbKbEntry.getId());
    }
}
