package co.simplo.smileys;

import java.util.ArrayList;
import java.util.List;

public class CountSmileys {

	public static int countSmileys(List<String> arr) {
		int result = 0;
		
		List<String> listSmileys = new ArrayList<String>();
		listSmileys.add(";)");
		// return 0;
		
		if (arr != null) {
			for (String e : arr) {
				if (listSmileys.contains(e)) {
					result++;
					
				}
				
			}
	
		}
		
		return result;
		
	}

}
