import inf.*;

public class Main {
	public static void main(String[] args) {
		StartInterface s = new StartInterface() {
		// anonymous class
			@Override
			public void Start() {
				System.out.println("Начать историю:");
			}
		};
		s.Start();
		Story.Fictional f = new Story.Fictional();
		f.print(true);
		Story story = new Story();
		story.start();
		story.End();
	}
}
