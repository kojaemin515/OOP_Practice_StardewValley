package player;

public class Player {
	private String playerName = "";
	public String getPlayerName()
	{
		return this.playerName;
	}
	private String favoriteThing = "";
	public String getFavoriteThing()
	{
		return this.favoriteThing;
	}
	public boolean isMale;
	public int[] hairColorRGB = new int[3];
	public enum hair_type_male {
		NATURAL, BALD, SEMI_BALD, LONG, TWO_BLOCKED
	}
	public enum hair_type_female {
		NATURAL, LONG, SHORT, PONY_TAIL, TWIN_TAIL
	}
	
	// 생성자 - 플레이어 객체는 세이브파일당 하나여야 함. (구현필요)
	public Player(String name, boolean isMale, String thing)
	{
		this.playerName = name;
		this.isMale = isMale;
		this.favoriteThing = thing;
	}
}
