package com.java.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample { //�޷� �����

	public static void main(String[] args) {///////
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ش� ��/�� �Է� : ");
		int year = sc.nextInt();  //2022
		int month = sc.nextInt();  //10
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1,1); //�����ϴ� ���� 1�� ��¥�� �ʱ�ȭ
		eDay.set(year,month,1);  //���� �� 1�� ��¥�� �ʱ�ȭ
		
		eDay.add(Calendar.DATE , -1);  //�� ���� ������ ��¥
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);   // 7 : �����
		END_DAY = eDay.get(Calendar.DATE);  //31��
		
		System.out.println("      " + year + "��" + month + "��");
		System.out.println(" SU MO TU WE TH FR SA ");
		
		for(int i=1;i<START_DAY_OF_WEEK;i++) {
		    System.out.print("   "); //3ĭ
		}
		
		for(int i=1,n=START_DAY_OF_WEEK;i<=END_DAY;i++,n++) {
			System.out.print((i < 10 ? "  " + i: " "+ i)); //2ĭ 1ĭ
			if(n % 7 == 0) {
				System.out.println();
			}
		}
	
	}

}
