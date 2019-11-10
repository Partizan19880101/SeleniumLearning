package Log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loggin {

    private static final Logger log = LogManager.getLogger(Loggin.class.getName());


    public static void main(String[] args) {
        log.debug("Debug Message Logged");
        log.error("Error Message Logged");
        log.fatal("Fatal Message Logged");
    }
}
