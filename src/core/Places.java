package core;

public enum Places {
	NEAR_WINDOW,
	IN_WINDOW;
	@Override
	public String toString() {
		if(this == NEAR_WINDOW) {
			return " у окна";
		}else {
			return " в окне";
		}
	}
}
