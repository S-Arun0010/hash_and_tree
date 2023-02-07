package hashset;

import java.util.*;
import java.util.logging.Logger;

public class Treeset {
  
	public static void main(String[] args)
	{
		Logger l= Logger.getLogger("com.api.jar");
		TreeSet<String> tre = new <String>TreeSet();
	    tre.add("10");
	    tre.add("Arun");
	    tre.add("prabu");
	    tre.add("30");
	    tre.add("25");
	    tre.add("5");
	    tre.add("4");
	    tre.remove("20");
	    logger.log(tre);
	    Iterator<String> i = tre.iterator();
        while(i.hasNext())
        {
        	l.info(i.next());
        }
	    
	}
}
