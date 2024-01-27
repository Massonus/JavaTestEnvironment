package org.test.pLesson39;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.net.URISyntaxException;
import java.util.Objects;

public class UserUtils {

    private static final Logger logger = LogManager.getLogger(UserUtils.class);

    public UserUtils() {
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        try {
            context.setConfigLocation(LogExample.class.getResource("/log4j.xml").toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public void getUer(final User user) {
        String m = "This user is empty";
        if (Objects.isNull(user)) {
            logger.error("My log {}", m);
        } else {
            logger.info("My user is {}", user);
        }
    }
}
