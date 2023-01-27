package core;

import inf.*;

public class window extends DirectionAbstract {
	private String name;
	private final DirectionType TYPE = DirectionType.EAST;
	private final Places at = Places.IN_WINDOW;
	private final Places near = Places.NEAR_WINDOW;
	
	public window() {
		super(true);
		name = "окно";
	}

	public window(String name) {
		super(true);
		this.name = name;
	}

	public window(String name, boolean miscellaneous) {
		super(miscellaneous);
		this.name = name;
	}

	public void near(Object listen) {
		System.out.println(listen + "" + near);
	}

	public void place(bun Bun) {
		System.out.println("Только маленькая пухлая ручка вд"
				+ "руг мелькнула и схватила " + Bun + at );
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof window) {
			return name.equals(((window) obj).getName()) && isMiscellaneous() == ((window) obj).isMiscellaneous();
		}
		return false;
	}

	@Override
	public int hashCode() {
		if (isMiscellaneous())
			return name.hashCode() + name.length();
		return name.hashCode();
	}

	@Override
	public DirectionType getType() {
		return TYPE;
	}
}
