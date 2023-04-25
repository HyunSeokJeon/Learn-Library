package com.example.learnlibraries.shedlock.common;

import com.example.learnlibraries.shedlock.component.DBInsertComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ShedlockScheduler {

    private final DBInsertComponent dbInsertComponent;

    public ShedlockScheduler(DBInsertComponent dbInsertComponent) {
        this.dbInsertComponent = dbInsertComponent;
    }

    @Scheduled(cron = "*/10 * * * * ?")
    public void shedlockTester() {
        log.info("call scheduler");
        dbInsertComponent.insert();
    }
}
