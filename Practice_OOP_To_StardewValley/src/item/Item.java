package item;
/*
 * 아이템 클래스
 * 종류 : 씨앗(묘목), 과일, 야채, 채집, 도구(장비), 광물, 가구(장식/설치사용)
 * 		 유물, 자원, 동물생산품, 장인생산품
 * */
public abstract class Item {
	// 이하는 각 아이템그룹 클래스에서 선언하여 사용해야 하는 상수 목록
	
	public final String groupName = "";
	public final int groupCode = 00;
	
	// 이하는 각 아이템 클래스에서 선언하여 사용해야 하는 상수 목록
	public final String name = "";
	public final String comment = "";
	public final int itemCode = 000;
	
	public abstract void printItemInfo();
}
