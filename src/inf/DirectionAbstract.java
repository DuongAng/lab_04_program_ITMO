package inf;

public abstract class DirectionAbstract implements DirectionInterface {
	private boolean miscellaneous;

	public DirectionAbstract(boolean miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	@Override
	public boolean isMiscellaneous() {
		return miscellaneous;
	}

	@Override
	public void setMiscellaneous(boolean miscellaneous) {
		this.miscellaneous = miscellaneous;
	}
}
