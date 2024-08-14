package item.seeds;

public class Seed_Parsnip extends SeedsCommon {
	boolean tmp_true = true;
	boolean tmp_false = false;
	// 아이템 정보
	public final String name = "파스닙 씨앗";
	public final String comment
		= "파스닙의 씨앗이다. 봄철에 자랄 수 있다. 완전히 성장하는 데 4일이 걸린다.";
	public final int itemCode = 001;
	
	// 생성자
	public Seed_Parsnip() {
		setGrowableSeasons(1, 0, 0, 0);
		setGrowAccelerationRate(tmp_false, tmp_true);
		setBasicDaysToGrow(4);
		setDaysToGrow();
	}

	@Override
	public void printItemInfo() {
		System.out.println("아이템 이름 : " + name);
		System.out.println("분류명 : " + groupName);
		System.out.println("설명 : "+ comment);
	}
}
