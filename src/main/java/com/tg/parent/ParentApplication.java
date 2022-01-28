package com.tg.parent;


import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class ParentApplication {
    public static void main(String args[]){
        SpringApplication.run(ParentApplication.class);
        log.info("Log Info start");
        log.debug("Application startedsssssssssssssss");

        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        log.fatal("This is a fatal message");

    }

}
