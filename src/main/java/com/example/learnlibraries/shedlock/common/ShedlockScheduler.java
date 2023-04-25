package com.example.learnlibraries.shedlock.common;

import com.example.learnlibraries.shedlock.component.DBInsertComponent;
import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@EnableSchedulerLock(defaultLockAtMostFor = "PT9S")
public class ShedlockScheduler {

    private final DBInsertComponent dbInsertComponent;

    public ShedlockScheduler(DBInsertComponent dbInsertComponent) {
        this.dbInsertComponent = dbInsertComponent;
    }

    @Scheduled(cron = "*/10 * * * * ?")
    @SchedulerLock(name="TestLock", lockAtLeastFor = "PT5S", lockAtMostFor = "PT9S")
    public void shedlockTester() {
        log.info("call scheduler");
        dbInsertComponent.insert();
    }
}
