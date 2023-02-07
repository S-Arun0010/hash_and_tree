package hashset;
import java.util.*;
public class Hashmap {
	
	public static void main(String[] args)
	{  
		HashMap<Integer,String> hs = new HashMap<>();
		hs.put(1,"Akash");
		hs.put(2,"Arun");
		hs.put(3,"balu");
		hs.put(4,"krish");
		logger.log(hs);
		//to print values alone
		for(String  i : hs.values())
		{
			logger.log(i);
		}
		hs.replace(2,"krishna");
		hs.replace(1,"Akshi");
		logger.log(hs);
		hs.remove(2);
		hs.remove(4);
		logger.log(hs);
		
	}

}
