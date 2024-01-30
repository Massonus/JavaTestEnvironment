package com.test.pLesson39;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.net.URISyntaxException;

public class LogExample {
    private static final Logger logger = LogManager.getLogger(LogExample.class);

    public static void main(String[] args) throws URISyntaxException {

        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        context.setConfigLocation(LogExample.class.getResource("/log4j.xml").toURI());

        logger.trace("Це повідомлення трасування");
        logger.debug("Це налагоджувальне повідомлення");
        logger.info("Це інформаційне повідомлення");
        logger.warn("Це попереджувальне повідомлення");
        logger.error("Це повідомлення про помилку");
        logger.fatal("Сталася помилка");

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logger.error("Сталася помилка", e);
        }
    }

}
