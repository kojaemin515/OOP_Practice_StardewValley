package item;

public class Seeds extends Item {
	String itemGroup = "Seeds";
	int groupCode = 01;
	
	/*
	 * Growable 특성은 씨앗밖에 적용되지 않으므로
	 * Seeds 클래스에서 구현 필요.
	 * */
	protected enum MatureDegree {
		Seed, Growing, Harvestable
	}
	protected enum DaysToGrow {
		day_4, day_6, day_7, day_8, day_12, day_13, day_28
	}
}
