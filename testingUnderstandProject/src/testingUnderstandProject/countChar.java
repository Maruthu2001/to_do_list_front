package testingUnderstandProject;

import java.util.HashMap;
import java.util.Map;

public class countChar {
	public static void main(String[] args) {
		String name = "ramya";
		int count = 0;
		Map<String, Integer> resultMap = new HashMap<>();
		for (int i = 0; i < name.length(); i++) {
			count = 0;
			for (int j = 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					count++;
				} else {
					count = 1;
				}
				resultMap.put("" + name.charAt(i), count);
			}
		}
		resultMap.entrySet().stream().forEach(data ->{
			System.out.println(data.getKey()+" "+data.getValue());
		});
	}
}
