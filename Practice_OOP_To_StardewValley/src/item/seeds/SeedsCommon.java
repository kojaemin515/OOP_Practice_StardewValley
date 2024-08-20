package item.seeds;

import item.Item;
import item.groupInterfaces.GroupCode_01;

public abstract class SeedsCommon extends Item implements GroupCode_01{
	// 현재 성장도 저장 변수. 최대값 = daysToGrow 이어야 한다.
	// 0일땐 씨앗, 1~daysToGrow일땐 줄기, dayToGrow일땐 열매
	protected int matureDegree = 0;

	// 기본 성장일수
	protected int basicDaysToGrow;
	public void setBasicDaysToGrow(int days) {
		this.basicDaysToGrow = days;
	}
	
	// 변수 적용 후 성장일수
	protected int daysToGrow;
	public void setDaysToGrow() {
		this.daysToGrow = (int)(this.basicDaysToGrow * (1.0 - growAccelerationRate));
	}
	public int getDaysToGrow() {
		return this.daysToGrow;
	}
	
	// 씨앗이 자랄 수 있는 계절. 봄, 여름, 가을, 겨울 순서
	protected int[] growableSeasons = new int[4];
	public void setGrowableSeasons(int spring, int summer, int fall, int winter) {
		this.growableSeasons[0] = spring;
		this.growableSeasons[1] = summer;
		this.growableSeasons[2] = fall;
		this.growableSeasons[3] = winter;
	}
	
	// 성장시간감소 변수 적용시 감소율
	protected double growAccelerationRate = 0.0;
	public void setGrowAccelerationRate(boolean isFertilized, boolean isFarmingExpert) {
		this.growAccelerationRate = isFertilized ? (isFarmingExpert ? (0.35) : (0.25))
				: ((isFarmingExpert ? (0.1) : (0.0)));
	}
	public double getGrowAccelerationRate() {
		return this.growAccelerationRate;
	}
}
