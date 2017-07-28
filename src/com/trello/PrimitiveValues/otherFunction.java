package com.trello.PrimitiveValues;

public class otherFunction {
	
public void falseSwap(int x, int y){
	int temp=x;
	x=y;
	y=temp;
	
	System.out.println("x from falseSwap:"+x+"\t y from falseSwap:"+y);
}

public void moreOperation(int a, int b){
	System.out.println("a:"+a+"\t b:"+b);
	a=a*b;
	b=12;
	System.out.println("a:"+a+"\t b:"+b);
	falseSwap(a, b);
	System.out.println("a:"+a+"\t b:"+b);
}
}
