package local.test.lamdaExp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LamdaForEach {

	public static void main(String[] args) {
		String[] str = { "a", "b", "c" };
		List<String> strList = Arrays.asList(str);
		strList.forEach(n -> System.out.println(n));

		Map<Integer, String> empMap = new HashMap<>();
		empMap.put(1, "a");
		empMap.put(2, "b");
		empMap.put(3, "c");

		empMap.forEach((k, v) -> {
			System.out.println("id : " + k);
			System.out.println("name : " + v);
		});

	}
}
