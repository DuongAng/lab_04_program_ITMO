package inf;

public interface DirectionInterface extends ThingInterface {
	DirectionType getType();

	boolean isMiscellaneous();

	void setMiscellaneous(boolean miscellaneous);
}
