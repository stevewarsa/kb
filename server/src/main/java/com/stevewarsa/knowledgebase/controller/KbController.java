package com.stevewarsa.knowledgebase.controller;

import com.stevewarsa.knowledgebase.model.KbEntry;
import com.stevewarsa.knowledgebase.worker.KbWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Steve Warsa
 * @since 7/5/2020 5:37 AM
 */
@Slf4j
@RestController
public class KbController {
    @Autowired
    private KbWorker kbWorker;

    @RequestMapping("/addNewKbEntry")
    public KbEntry addNewKbEntry(@RequestBody KbEntry kbEntry) {
        log.info("Creating new kbEntry: ");
        log.info(kbEntry.toString());
        kbWorker.saveKbEntry(kbEntry);
        return kbEntry;
    }

    @RequestMapping("/getKbEntries")
    public List<KbEntry> getKbEntries() {
        return kbWorker.getKbEntries();
    }
}
