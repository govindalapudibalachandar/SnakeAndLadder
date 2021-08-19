package com.bridgelaz;

public class SnakeAndLadder {
	
	  public static int position = 0 ;

	public static void main(String[] args) {
		
		 int die = (int)(Math.random() * 100) % 7;
		 if(die!=0)
		 {
			 System.out.println("position ="+position);
		 }
		 
		 position = die;
		
		System.out.println("Welcome to SnakeAndLadder");
		System.out.println("playerposition : " +position);

	}

}
