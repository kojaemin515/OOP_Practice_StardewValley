package item.seeds;

public class Seed_Parsnip extends SeedsCommon {
	// 생성자
	public Seed_Parsnip() {
		// 아이템 정보 설정
		setItemCode("001");
		setItemName("파스닙 씨앗");
		setItemComment("파스닙의 씨앗이다. 봄에 자랄 수 있다. 완전히 자라는 데 4일이 걸린다.");
		// 씨앗 특성 설정
		setGrowableSeasons(1, 0, 0, 0);
		setGrowAccelerationRate(false, true);
		setBasicDaysToGrow(4);
		setDaysToGrow();
	}
	
	public void printItemInfo() {
		System.out.println("아이템명 : " + this.itemName);
		System.out.println("분류명 : " + Seed_Parsnip.groupCode);
		System.out.println("설명 : " + this.itemComment);
	}
}