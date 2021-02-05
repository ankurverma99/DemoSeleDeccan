

import java.util.*;

public class Brackets {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.nextLine();
		String[] arr = s.split("");
		List a = Arrays.asList(arr);
		if ((Collections.frequency(a, "(") == Collections.frequency(a, ")"))
				&& (Collections.frequency(a, "{") == Collections.frequency(a, "}"))
				&& (Collections.frequency(a, "[") == Collections.frequency(a, "]")))
			System.out.println("Balanced ");

		else
			System.out.println("Not Balanced ");
	}

}
