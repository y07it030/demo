package CoreJavaProgramsPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.ui.ModelMap;

import com.sun.tools.javac.util.List;

public class Tuples {

	public static void main(String[] args) {
		List ai = List.of(1, 2, 3, 4, 5, 6, 3, 6, 7); // (2,7)(3,6)(4,5)
		ModelMap finalResult = new ModelMap();
	/*	for (int i = 0; i < ai.length(); i++) {
			for (int j = i + 1; j < ai.length(); j++) {
				int sum = (int) ai.get(i) + (int) ai.get(j);
				if (sum == 9)
					if (!finalResult.containsKey(ai.get(j)))
						finalResult.put((int) ai.get(i), (int) ai.get(j));
			}
		}*/
		for (int i = 0; i < ai.length(); i++) {
			for (int j = i + 1; j < ai.length(); j++) {
				for (int k = j + 1; k < ai.length(); k++) {
				int sum = (int) ai.get(i) + (int) ai.get(j)+(int)ai.get(k);
				if (sum == 9)
				{
					finalResult.addAttribute("1", (int) ai.get(i));
					finalResult.addAttribute("2", (int) ai.get(j));
					finalResult.addAttribute("3", (int) ai.get(k));
					callCombination((int) ai.get(i),(int) ai.get(j),(int) ai.get(k));
				}
		/*			if (!finalResult.containsKey(ai.get(i))&&!finalResult.containsValue(ai.get(j))) {
						if(!finalResult.containsKey(ai.get(j))&&!finalResult.containsValue(ai.get(k))) {
							if(!finalResult.containsKey(ai.get(i))&&!finalResult.containsValue(ai.get(j))) {
							System.out.println((int) ai.get(i) +""+ (int) ai.get(j)+""+(int)ai.get(k));
{
					
}
						}*/
				}
			}
		}
		System.out.println(finalResult);

	}

	private static void callCombination(int i, int j, int k) {
	String str=i+""+j+""+k;

	
	//126 216 612 162 
	
		
	}
	}


