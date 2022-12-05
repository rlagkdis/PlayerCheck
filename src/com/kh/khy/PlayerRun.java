package com.kh.khy;

public class PlayerRun {
	public static void main(String [] args) {
		PlayerFunction pFunc = new PlayerFunction();
		EXIT :
		while (true) {
			switch (pFunc.printMenu()) {
			case 1 : 
				pFunc.input();
				break;
			case 2 :
				pFunc.joinTen();
				break;
			case 3 :
				pFunc.goldenB();
				break;
			case 4 :
				break EXIT;
			}
		}
	}

}
