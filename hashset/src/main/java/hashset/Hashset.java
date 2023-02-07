package hashset;
import java.util.*;
import java.util.logging.Logger;

public class Hashset {
	   
	  String name;
	  int roll;
	  int marks;
	  public Hashset(String n,int r,int m)
	  {
		  name = n;
		  roll = r;
		  marks = m;
	  }

    @Override
	public int hashCode() {
		return Objects.hash(name,roll);
	}

	@Override
	public boolean equals(Object obj) {
		Hashset other = (Hashset) obj;
		  return  (Objects.equals(name, other.name) && roll == other.roll);
	}
   
	@Override
	public String toString() {
		return "name=" + name + "| roll=" + roll + "| marks=" + marks ;
	}

	public static void main(String[] args) {
		Logger l= Logger.getLogger("com.api.jar");
		
        Hashset a = new Hashset("Arun    ",01,88);
        Hashset b = new Hashset("Akshi   ",02,99);
        Hashset c = new Hashset("Aravinth",03,89);
        Hashset d = new Hashset("Ashok   ",04,79);
        Hashset f = new Hashset("Arun    ",05,99);
        HashSet<Hashset> hs = new HashSet<>();
        hs.add(a);
        hs.add(b);
        hs.add(c);
        hs.add(d);
        Iterator i = hs.iterator();
        while(i.hasNext())
        {
        	 l.info(i.next());
        }
    }
}
