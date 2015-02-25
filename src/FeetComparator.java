import java.util.Comparator;


public class FeetComparator implements Comparator<Zoombini>{
	@Override
	public int compare(Zoombini z1, Zoombini z2) {
		         
		 String feet1 = z1.getFeet();
		 String feet2 = z2.getFeet();
		 // ascending order (descending order would be: name2.compareTo(name1))
		 return feet1.compareTo(feet2);
	}
}
