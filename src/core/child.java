package core;

import CheckException.*;

import inf.*;

public class child implements ThingInterface {
	private String name;
	private Action actions = new Action();
	private String What;
	private miscellaneous Ml = new miscellaneous();
	private String food;
	
	public child() {
		name = "Малыш";
	}
	public child(String name) {
		super();
		this.name = name;
	}
	
	public void Food(String f) {
		this.food = f;
	}
	public void What(String s) {
		this.What=s;
	}
	//unchecked
	public void eats() throws PushException{
		if(What == null ) throw new PushException();
		System.out.println(Ml.It_must_be() + name + actions.eats()+ food + What);
	}
	public void think() throws PushException{
		if(What == null ) throw new PushException();
		System.out.println( name + actions.thinks() + " что" + What);
	}

	public void knowns() throws PushException{
		if(What == null ) throw new PushException();
		System.out.println( name + actions.knowns() + " что" + What);
	}
	
	public void listen(buzzing Buzzing) {
		System.out.println(name + actions.listens() +" "+ Buzzing);
	}

	public void laugh() {
		System.out.println(name + actions.laughs());
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + What ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof child) {
			return name.equals(((child) obj).getName());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
