package hashset;

import java.util.*;
import java.util.logging.Logger;

public class Treeset {
  
	public static void main(String[] args)
	{
		
	    TreeSet<String> tre = new TreeSet<String>();
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
        	logger.log(i.next());
        }
	    
	}
}
