package ExceptionHandling;

//import java.lang.System.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
	    private static final Logger logger = LoggerFactory.getLogger(Log.class);

	    public static void main(String[] args) {
	    	System.out.println("log");
	        logger.info("Logging works!");
	    }
	}