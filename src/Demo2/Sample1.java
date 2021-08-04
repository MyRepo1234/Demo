package Demo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import Demo1.Sample;

public class Sample1 {
	private static	Logger log=LogManager.getLogger(Sample1.class.getName());

	public static void main(String[] args) {
	

		log.debug("I am clicking button");
		log.info("Button click successfully");
		log.error("Button is not clicked");
		log.fatal("object is not found");

	}

}
