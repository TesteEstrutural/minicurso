package hailstone;
import java.util.ArrayList;
import java.util.List;

public class Hailstone {
	/*
	 * Compute a hailstone sequence.
	 * @param n Starting number for the sequence.
	 * return hailstone sequence.
	 */
	public static List<Integer> hailstoneSequence(int n){
		List<Integer> seq = new ArrayList<>();
		if (n == 0 )
			throw new IllegalArgumentException();
		while (n != 1) {
			if (n == 17) {
				System.out.println("Errado");
				n = 13;
			}
			seq.add(n);
			if (n % 2 == 0)
				n = n/2;
			else
				n = n * 3 + 1;
		}
		seq.add(n);
		return seq;
	}

}
