package com.kh.khy;

import java.util.Scanner;

public class PlayerFunction {
	Player [] players;
	
	public PlayerFunction () {
		players = new Player[3];
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======선수 성적 확인 프로그램======");
		System.out.println("1. 선수 정보 입력");
		System.out.println("2. 텐텐클럽 가입 여부 확인");
		System.out.println("3. 득점왕 확인");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
		System.out.println();
		System.out.println("===================================");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======선수 이름, 성적 입력=======");
		for(int i = 0; i < players.length; i++) {
			System.out.println(""+(i+1)+"번째 선수 정보 입력");
			System.out.print("선수 이름 입력 : ");
			String name = sc.next();
			System.out.print("넣은 골 수 입력 : ");
			int goal = sc.nextInt();
			System.out.print("도움 수 입력 : ");
			int assist = sc.nextInt();
			System.out.println("==================================");
			players[i] = new Player();
			players[i].setName(name);
			players[i].setGoal(goal);
			players[i].setAssist(assist);
		}
	}
	
	public void joinTen() {
		System.out.println("=======텐텐클럽 가입 여부 확인=======");
		for(int i = 0; i < players.length; i++) {
			int g = players[i].getGoal();
			int a = players[i].getAssist();
			System.out.println(""+(i+1)+" 번째" + " "+players[i].getName()+ "선수는 ?");
			// 골이 10이상이고 어시스트도 10 이상인 경우만 텐텐클럽에 가입한다.
			if (g >= 10 && a >= 10) {
				System.out.println("텐텐 클럽 가입 성공!");
			}else {
				// 어시스트는 10이상인데, 골은 10보다 부족하면 골이 부족하다고 출력
				if (g < 10) {
					System.out.println("골이 부족합니다!");
				}
				// 골은 10 이상인데,  어시스트가 10보다 부족하면 도움 부족 이라고 출력
				if (a < 10) {
					System.out.println("도움이 부족합니다!");
				}
				}
			}
		}
	
	public void goldenB() {
		System.out.println("============득점왕 확인============");
		int [] goals = new int[players.length];
		String [] names = new String[players.length];
		for(int i = 0; i < players.length; i++) {
			goals[i] = players[i].getGoal();
			names[i] = players[i].getName();
		}
		int max = 0;
		for(int i = 0; i < players.length; i++) {
			if(goals[max] <= goals[i]) {
				max = i;
			}
		}
		for(int i = 0; i < players.length; i++) {
			if(goals[max] == goals[i]) {
				System.out.println("득점왕은");
				System.out.println(names[i]);
				System.out.println("~!!");
			}
		}
	}
	
}
