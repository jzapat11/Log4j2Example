package co.com.log4j.sample.Log4jSample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	public static final Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args ) {
        
    	if(logger.isDebugEnabled()){
    		logger.debug("New message from log4j");
    	}
    }
}
