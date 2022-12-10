package com.kh.khy;

import java.util.Scanner;

public class PlayerFunction {
	Player [] players;
	
	public PlayerFunction () {
		players = new Player[3];
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======���� ���� Ȯ�� ���α׷�======");
		System.out.println("1. ���� ���� �Է�");
		System.out.println("2. ����Ŭ�� ���� ���� Ȯ��");
		System.out.println("3. ������ Ȯ��");
		System.out.println("4. ����");
		System.out.print("���� : ");
		System.out.println();
		System.out.println("===================================");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======���� �̸�, ���� �Է�=======");
		for(int i = 0; i < players.length; i++) {
			System.out.println(""+(i+1)+"��° ���� ���� �Է�");
			System.out.print("���� �̸� �Է� : ");
			String name = sc.next();
			System.out.print("���� �� �� �Է� : ");
			int goal = sc.nextInt();
			System.out.print("���� �� �Է� : ");
			int assist = sc.nextInt();
			System.out.println("==================================");
			players[i] = new Player();
			players[i].setName(name);
			players[i].setGoal(goal);
			players[i].setAssist(assist);
		}
	}
	
	public void joinTen() {
		System.out.println("=======����Ŭ�� ���� ���� Ȯ��=======");
		for(int i = 0; i < players.length; i++) {
			int g = players[i].getGoal();
			int a = players[i].getAssist();
			System.out.println(""+(i+1)+" ��°" + " "+players[i].getName()+ "������ ?");
			// ���� 10�̻��̰� ��ý�Ʈ�� 10 �̻��� ��츸 ����Ŭ���� �����Ѵ�.
			if (g >= 10 && a >= 10) {
				System.out.println("���� Ŭ�� ���� ����!");
			}else {
				// ��ý�Ʈ�� 10�̻��ε�, ���� 10���� �����ϸ� ���� �����ϴٰ� ���
				if (g < 10) {
					System.out.println("���� �����մϴ�!");
				}
				// ���� 10 �̻��ε�,  ��ý�Ʈ�� 10���� �����ϸ� ���� ���� �̶�� ���
				if (a < 10) {
					System.out.println("������ �����մϴ�!");
				}
				}
			}
		}
	
	public void goldenB() {
		System.out.println("============������ Ȯ��============");
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
				System.out.println("��������");
				System.out.println(names[i]);
				System.out.println("~!!");
			}
		}
	}
	
}
