package Log4j22;


import org.apache.logging.log4j.*;




public class Demo {
    private static Logger log = LogManager.getLogger(Demo.class.getName());

    public static void main(String[] args) {

        log.debug("i am dibbuging");
        if(5>4)
            log.info("no value conditions");

            log.error("it is failed");

            log.fatal("this is fatal");

    }
}
