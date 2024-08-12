package npc;

public class NPC_Marriable extends NPC {
	
	public boolean isRelationshipOngoing = false;
	public boolean isMarried = false;
	
	private final int MAX_HEART_BEFORE_RELATIONSHIP = 8;
	private final int MAX_HEART_AFTER_MARRIAGE = 14;
	
	@Override
	public void setHeart(int amount)
	{
		if(isMarried)
		{
			addHeart(amount, MAX_HEART_AFTER_MARRIAGE);
		}
		else if(isRelationshipOngoing)
		{
			addHeart(amount, MAX_HEART);
		}
		else
		{
			addHeart(amount, MAX_HEART_BEFORE_RELATIONSHIP);
		}
	}
}
