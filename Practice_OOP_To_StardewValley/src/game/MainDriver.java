package game;

import item.seeds.*;

public class MainDriver {
	public static void main(String[] args)
	{
		Seed_Parsnip parsnipSeed = new Seed_Parsnip();
//		System.out.println(parsnipSeed.getGrowAccelerationRate());
//		System.out.println(parsnipSeed.getDaysToGrow());
		parsnipSeed.printItemInfo();
	}
}
