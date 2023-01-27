package core;

import java.util.ArrayList;
import java.util.List;

public class Allname {
	static List<String> Name = new ArrayList<String>();

	public void join(String name) {
		if (!Name.contains(name)) {
			Name.add(name);
//			System.out.println(name + " присоединились к истории.");
		} else {
			System.out.println(name + " уже в истории.");
		}

	}

}
