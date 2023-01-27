import java.util.ArrayList;
import java.util.List;

import CheckException.PushException;
import core.*;

public class Story {
	List<String> Name = new ArrayList<String>();
	Allname a = new Allname();
	
	public Story() {
	}
	//static class
	public static class Fictional{
		public boolean fictional;
		public void print(boolean fictional) {
			this.fictional = fictional;
			if(fictional) {
				System.out.println("Это не реальная история");
			}else {
				System.out.println("Это реальная история");
			}
		}
	}
	
	public void start() {
		this.StartStory();
	}
	
	//local class
	public void End() {
		class EndStory{
			private boolean end;
			public void Stop(boolean end) {
				this.end = end;
				if(end) {
					System.out.println("конец истории");
				}else {
					System.out.println("не конец истории");
				}
			}
		}
		EndStory e = new EndStory();
		e.Stop(true);
	}
	
	
	private void StartStory() {
		people Freken = new people("Фрекен Бок");
		a.join(Freken.getName());
		Freken.what(" его появлению.");
		Freken.pleases(false);
		try {
			Freken.what(" себе кофе");
		}catch(PushException e) {
			System.err.println(e.getMessage());
		}
		Freken.makes();
		child Child = new child();
		a.join(Child.getName());
		try {
			Child.What(" она собиралась провести в тишине несколько приятных минут");
		}catch(PushException e) {
			System.out.println(e.getMessage());
		}
		Child.knowns();
		Freken.Behavior(" спокойно");
		Freken.DrinkWhat( " софе");
		Freken.drinks();
		Freken.EatWhat(" плюшка");
		Freken.eats();
		try {
			Child.What(" вредно только детям");
		}catch(PushException e) {
			System.out.println(e.getMessage());
		}
		Child.Food(" мучное");
		
		Child.eats();
		
		Freken.loooks(Child.getName());
		try {
			Child.What(" теперь самое время с ней заговорить");
		}catch(PushException e) {
			System.out.println(e.getMessage());
		}
		Child.think();
		buzzing Buzzing = new buzzing();
		a.join(Buzzing.getName());
		Buzzing.FamiliarandWeakly();
		Child.listen(Buzzing);
		window Window = new window();
		a.join(Window.getName());
		Window.near(Child);
		people Kacona = new people("Карлсона");
		a.join(Kacona.getName());
		bun Bun = new bun();
		a.join(Bun.getName());
		Bun.put("на тарелке");
		Bun.where();
		Window.place(Bun);
		Child.laugh();
		Freken.notice(false);
		try {
			Freken.what(" как та же маленькая пухлая ручка взяла еще одну");
		}catch(PushException e) {
			System.err.println(e.getMessage());
		}
		Freken.see(Bun);
		Child.laugh();
		Freken.tries(false);
		try {
			Freken.what(" он самый утомительный в мире мальчик");
		}catch(PushException e) {
			System.err.println(e.getMessage());
		}
		Freken.Behavior(" с раздражением");
		Freken.thinks();
		Freken.what("Принесла же его нелегкая именно теперь, когда ");
		Freken.Behavior("");
		Freken.drinks();
		
	}

}