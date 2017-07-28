package com.trello.PrimitiveValues;

public class mainFunction {

	public static void main(String[] args) {
		int x=3;
		int y=2;
		System.out.println("value of x:"+x+"\nvalue of y:"+y);
		
		 otherFunction f= new  otherFunction(); 
		 f.falseSwap(x, y);
		 System.out.println("x after the falseSwap:"+x+"\ty after the falseSwap:"+ y);
		 f.moreOperation(x,y);
		 System.out.println("x after the moreOperation:"+x+"\ty after the moreOperation:"+ y);
}
}