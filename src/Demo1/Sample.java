package Demo1;

import org.apache.logging.log4j.*;

public class Sample {
	
	private static	Logger log=LogManager.getLogger(Sample.class.getName());

	public static void main(String[] args) {
	//this is new

		log.debug("I am clicking button");
		log.info("Button click successfully");
		log.error("Button is not clicked");
		log.fatal("object is not found");

	}

}
