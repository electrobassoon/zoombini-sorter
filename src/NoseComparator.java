import java.util.Comparator;


public class NoseComparator implements Comparator<Zoombini>{

	@Override
	public int compare(Zoombini z1, Zoombini z2) {
		         
		 String nose1 = z1.getNose();
		 String nose2 = z2.getNose();
		 // ascending order (descending order would be: name2.compareTo(name1))
		 return nose1.compareTo(nose2);
	}
}
