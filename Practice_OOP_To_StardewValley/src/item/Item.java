package item;
/*
 * 아이템 클래스
 * 종류 : 씨앗(묘목), 과일, 야채, 채집, 도구(장비), 광물, 유물, 자원,
 * 가구(장식/설치사용), 동물생산품, 장인생산품, 생선, 잡동사니
 * */
public abstract class Item {
	// 아이템 정보
	protected String itemCode = "";
	protected String itemName = "";
	protected String itemComment = "";
	
	// 아이템 정보 setter, code getter
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setItemComment(String itemComment) {
		this.itemComment = itemComment;
	}
	public String getItemCode() {
		return this.itemCode;
	}
	
	public abstract void printItemInfo();
}