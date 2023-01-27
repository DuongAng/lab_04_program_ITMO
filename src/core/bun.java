package core;

import inf.*;

public class bun implements ThingInterface {
	private String name;
	private String place ;
	
	public bun() {
		name = "Плюшкa";
	}

	public bun(String name) {
		this.name = name;
	}
	
	public void put(String newPlace) {
		this.place=newPlace;
		
	}

	public void where() {
		System.out.println( name + " " + place );
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "плюшку "+ place;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof bun) {
			return name.equals(((bun) obj).getName());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
