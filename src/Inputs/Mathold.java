package Inputs;

public class Mathold {
  public static void main(String[] args) {
	int minutes = 70;
	minutes %= 60; // --> minutes = minutes % 60;
	System.out.println(minutes);
	minutes*= 3; // minutes = minutes * 3;
	System.out.println(minutes);
  }
}
