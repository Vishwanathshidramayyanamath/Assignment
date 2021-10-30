package com.constructorthisandsuperkeywordssss;

public class ownerandservant {

	public ownerandservant(int price) {
		System.out.println("Owner gave money to servant");
		
		
	}
	public ownerandservant(String product) {
		this(100);
		System.out.println("Servant goes to shop");
		
	}
	public ownerandservant(int amount,double cost) {
		this("Book");
		System.out.println("The value of book is "+amount);
		System.out.println("bought the book for "+cost+" paid back Rs"+(amount-cost)+" to owner");
		
	}
public static void main(String[] args) {
	ownerandservant d1 = new ownerandservant(100,70);
	
	
	
			}
		
	}

