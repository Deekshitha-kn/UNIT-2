import java.util.HashSet;
import java.util.Set;

public class Task1 {

	public static void main(String[] args)
	{

		Set<Integer> hSetNumbers = new HashSet<Integer>();

		hSetNumbers.add(1);
		hSetNumbers.add(10);
		hSetNumbers.add(6);
		hSetNumbers.add(2);

		for (Integer number : hSetNumbers) {
			System.out.println(number);
		}
	}
}
