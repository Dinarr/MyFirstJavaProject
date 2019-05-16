package statics;

import java.util.*;
//import static java.util.Arrays.*;
import static statics.BestBuy.*;

public class Shopping {

	public static void main(String[] args) {
		System.out.println(numOfcomputers);
		Random r = new Random();
		//sort(a); //Arrays.sort(a);
		BestBuy b1 = new BestBuy();
		b1.location = "Chicago Downtown";
		BestBuy b2 = new BestBuy();
		b2.location = "Des Plaines, IL";
		BestBuy b3 = new BestBuy();
		b3.location = "Ohare Area";
		//System.out.println(b1.location);
		// How to access static fields/variables;
		//b1.sellComputer();
		//b3.sellComputer();
		BestBuy.day = "Monday";
		System.out.println(BestBuy.numOfcomputers);

	}
}
