package com.cg.spring;

public class Student { 
	
	private int id;
	private Mathcheat mathcheat;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMathcheat(Mathcheat mathcheat) {
		this.mathcheat = mathcheat;
	}

	public void cheating() {
		
		mathcheat.mathcheat();
		System.out.println("ID is = " +id);
	}

}
