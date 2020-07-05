package com.stevewarsa.knowledgebase.controller;

import com.stevewarsa.knowledgebase.model.KbEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Steve Warsa
 * @since 7/5/2020 5:37 AM
 */
@Slf4j
@RestController
public class KbController {
    @RequestMapping("/addNewKbEntry")
    public KbEntry addNewKbEntry(@RequestBody KbEntry kbEntry) {
        log.info("Creating new kbEntry: ");
        log.info(kbEntry.toString());
        return kbEntry;
    }
}
