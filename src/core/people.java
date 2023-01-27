package core;

import CheckException.*;

import inf.*;

public class people implements ThingInterface {
	private String name;
	private Action actions = new Action();
	private String What;
	private String drink;
	private String food;
	private String behavior;
	private miscellaneous Ml = new miscellaneous();

	public people(String name) {
		super();
		this.name = name;
	}

	public void what(String s) {
		this.What = s;
	}
	public void Behavior(String b) {
		this.behavior = b;
	}
	public void DrinkWhat(String d) {
		this.drink = d;
	}
	
	public void EatWhat(String f) {
		this.food = f;
	}
	public void pleases(boolean lever) {
		if (lever == true) {
			System.out.println(Ml.this_time() + name + " еще больше" + actions.pleases() + What);
		} else {
			System.out.println(Ml.this_time() + name + " еще меньше" + actions.pleases() + What);
		}
	}

	public void loooks(Object obj) {
		System.out.println(name + actions.looks() + " на " + obj);
	}

	public void eats() {
		System.out.println(name + actions.eats() + food);
	}

	public void drinks() {
		System.out.println(name + behavior + actions.drinks()+ drink);
	}

	public void makes() throws PushException{
		if(What == null ) throw new PushException();
		System.out.println(name + actions.makes() + What);
	}

	public void notice(boolean isNotice) {
		try {
			iNotice(isNotice);
		}catch(SeeException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void iNotice(boolean isNotice) throws SeeException {
		if(!isNotice) {
			throw new SeeException(name + " ничего не" + actions.noticed());
		}
		System.out.println(name + actions.noticed());
	}
	public void see(bun Bun) throws PushException{
		if(What == null ) throw new PushException();
		System.out.println(name + actions.see() + What + " " + Bun);
	}

	public void tries(boolean tries) {
		if (tries == false) {
			System.out.println(name + actions.tries() + actions.restrain() + ", но ничего не" + Ml.Worked());
		} else {
			System.out.println(name + actions.tries() + actions.restrain() + Ml.Worked());
		}
	}

	public void thinks() throws PushException{
		if(What == null ) throw new PushException();
		System.out.println(name + behavior + actions.thinks() + " что" + What);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof people) {
			return name.equals(((people) obj).getName());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
