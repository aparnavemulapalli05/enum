package com.advance.enumset;
import java.util.EnumSet;

public class EnumSetA {
	enum PizzaSize{
          SMALL, MEDIUM,LARGE,EXTRA_LARGE, FAMILY;
           }

	public static void main(String[] args) {
		EnumSet<PizzaSize> pizzaSizes=EnumSet.allOf( PizzaSize.class);
		System.out.println("pizza sizes:" +pizzaSizes);
		
		EnumSet<PizzaSize> basicPizzaSizes=EnumSet.noneOf(PizzaSize.class);
		basicPizzaSizes.add(PizzaSize.SMALL);
		basicPizzaSizes.add(PizzaSize.MEDIUM);
		basicPizzaSizes.add(PizzaSize.LARGE);
		System.out.println("Basic pizza prizes:" +basicPizzaSizes);
		
		EnumSet<PizzaSize>basicPizzaSizes1=EnumSet.of(PizzaSize.SMALL, PizzaSize.MEDIUM, PizzaSize.LARGE);
		System.out.println("Basic pizza prizes:" +basicPizzaSizes);
		
		EnumSet<PizzaSize>middlePizzaSizes=EnumSet.range(PizzaSize.MEDIUM, PizzaSize.EXTRA_LARGE);
		System.out.println("middle pizza sizes:" +middlePizzaSizes);
		

	}

}
