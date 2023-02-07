package hashset;
import java.util.*;
import java.util.logging.Logger;
public class Hashmap {
	
	public static void main(String[] args)
	{  
		HashMap<Integer,String> hs = new HashMap<>();
		hs.put(1,"Akash");
		hs.put(2,"Arun");
		hs.put(3,"balu");
		hs.put(4,"krish");
		System.out.println(hs);
		//to print values alone
		for(String  i : hs.values())
		{
			System.out.println(i);
		}
		hs.replace(2,"krishna");
		hs.replace(1,"Akshi");
		System.out.println(hs);
		hs.remove(2);
		hs.remove(4);
		System.out.println(hs);
		
	}

}
