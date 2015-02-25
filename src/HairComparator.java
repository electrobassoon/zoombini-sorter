import java.util.Comparator;


public class HairComparator implements Comparator<Zoombini>{
	 
	@Override
	public int compare(Zoombini z1, Zoombini z2) {
		         
		 String hair1 = z1.getHair();
		 String hair2 = z2.getHair();
		 // ascending order (descending order would be: name2.compareTo(name1))
		 return hair1.compareTo(hair2);
	}

}
