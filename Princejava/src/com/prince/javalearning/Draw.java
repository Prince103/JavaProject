package com.prince.javalearning;
public class Draw {
	String draw;
	Draw()
	{		System.out.println("Draw Object Created");}
    Draw(String todraw)
    {    	draw=todraw;
    	System.out.println("Drawing " + todraw);}
	public static void main(String[] args) {
		Draw draw = new Draw();
		Draw draw1 = new Draw("Circle");
	}}
