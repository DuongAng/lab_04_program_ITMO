package core;

import inf.*;

public class buzzing implements ThingInterface {
	private String name;
	private boolean familiarAndweakly;
	private String FW;

	public buzzing() {
		name = "жужжание";
		familiarAndweakly = true;
		FW=" знакомое слабое";
	}

	public buzzing(String name) {
		this.name = name;
		familiarAndweakly = true;
	}

	public void FamiliarandWeakly() {
		if (familiarAndweakly) {
			familiarAndweakly = false;
			System.out.println( name + FW);
		} else {
			System.out.println( name + " не" +FW);
		}
	}

	public boolean isfamiliar() {
		return familiarAndweakly;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		String ending;
		if (!familiarAndweakly) {
			ending = FW;
		} else {
			ending = " не " +FW;
		}
		return name + ending;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof buzzing) {
			return name.equals(((buzzing) obj).getName()) && familiarAndweakly == ((buzzing) obj).isfamiliar();
		}
		return false;
	}

	@Override
	public int hashCode() {
		if (familiarAndweakly)
			return name.hashCode() + name.length();
		return name.hashCode();
	}
}
