import java.util.Comparator;

public class EyeComparator implements Comparator<Zoombini> {
	@Override
	public int compare(Zoombini z1, Zoombini z2) {
		         
		 String eye1 = z1.getEye();
		 String eye2 = z2.getEye();
		 // ascending order (descending order would be: name2.compareTo(name1))
		 return eye1.compareTo(eye2);
	}
}
