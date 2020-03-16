package CoreJavaProgramsPractice;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class OccuranceInString {
	public static void main(String[] args) {
		String str = "Harika Harsha Vardhan";
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);

	}
}
