package objectdatatypes;

public class WatchShop {

	public static void main(String[] args) {
		Watch watch1 = new Watch();

		watch1.brand = "Rolex";
		watch1.color = "Gold";
		System.out.println(watch1.brand);
		System.out.println(watch1.color);

		Watch watch2 = new Watch();
		watch1.showTime();
		watch1.showDate();
		watch2.price = 4.599;
		watch2.style = "Classic";
		System.out.println(watch2.price);
		System.out.println(watch2.style);
	}
}
