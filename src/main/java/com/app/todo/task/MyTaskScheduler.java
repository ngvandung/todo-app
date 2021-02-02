package com.app.todo.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.logging.Logger;

@Configuration
@EnableAsync
@EnableScheduling
@Lazy(value = false)
public class MyTaskScheduler {

    private static final Logger _log = Logger.getLogger(MyTaskScheduler.class.getName());

    @Scheduled(fixedRate=5000)
    public void MyTaskScheduler() {
        _log.info("---------------> " + System.currentTimeMillis());
    }

}
