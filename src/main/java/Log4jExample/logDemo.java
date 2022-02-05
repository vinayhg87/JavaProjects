package Log4jExample;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logDemo {
	
	public static void main(String[] args) {
		
		String currentDir = System.getProperty("user.dir");
		String log4jProperties = currentDir + File.separator + "src" + File.separator + "Log4jExample" + File.separator + "log4j.properties";  
		System.out.println(log4jProperties);
		Logger log = Logger.getLogger(logDemo.class);
		PropertyConfigurator.configure(log4jProperties);
		
		log.info("Test message of INFO");
		log.error("Test meessage of error");
		log.warn("Test message of warning");			
	}

}
