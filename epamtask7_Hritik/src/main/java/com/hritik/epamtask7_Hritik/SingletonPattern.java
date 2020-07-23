package com.hritik.epamtask7_Hritik;

public class SingletonPattern {
	private static SingletonPattern obj;
	public static SingletonPattern getInstance() {
		if(obj == null){
			obj = new SingletonPattern();
		}
		return obj;
	}
}
	