import java.math.BigInteger;
import java.util.*;

public class OrganizingContainersOfBalls {

	public static void main(String[] args) {
		String result;
		Scanner reader = new Scanner(System.in);
		int q = reader.nextInt();
		String[] allResults = new String[q];

		for (int a0 = 0; a0 < q; a0++) {
			int n = reader.nextInt();
			int[] numberPerBasket = new int[n];
			int[] numberPerType = new int[n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int input = reader.nextInt();
					numberPerBasket[i] += input;
					numberPerType[j] += input;
				}
			}

			Arrays.sort(numberPerBasket);
			Arrays.sort(numberPerType);

			if (Arrays.equals(numberPerBasket, numberPerType)) {
				result = "Possible";
			} else {
				result = "Impossible";
			}
			allResults[a0] = result;
		}

		for (int i = 0; i < allResults.length; i++) {
			System.out.println(allResults[i]);
		}
	}
}
