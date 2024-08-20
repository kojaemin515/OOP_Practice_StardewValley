package npc;

/*
 * NPC 클래스.
 * 호감도 부분
 * 	일반 NPC : 최대하트 10개.
 * 	결혼가능 NPC : 최대하트 8개. 연인관계로 발전시 10개, 결혼시 14개.
 * */
public abstract class NPC {
	protected String name = "";
	protected boolean isMale = false;
	
	public int giftReceivedThisWeek = 0;
	public boolean isTalkedToday = false;
	
	protected int heart = 0;
	protected final int MAX_HEART = 10;
	public int getHeart() { return this.heart; }
	// amount : 음수, 양수 가능
	public void setHeart(int amount) {
		addHeart(amount, MAX_HEART);
	}
	
	protected void addHeart(int amount, int limit) {
		this.heart += amount;
		if (this.heart >= limit)
			this.heart = limit;
		else if (this.heart <= 0)
			this.heart = 0;
	}
}
