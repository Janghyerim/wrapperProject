package com.java.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample { //달력 만들기

	public static void main(String[] args) {///////
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("해당 연/월 입력 : ");
		int year = sc.nextInt();  //2022
		int month = sc.nextInt();  //10
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1,1); //시작하는 달의 1일 날짜로 초기화
		eDay.set(year,month,1);  //다음 달 1일 날짜로 초기화
		
		eDay.add(Calendar.DATE , -1);  //전 달의 마지막 날짜
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);   // 7 : 토요일
		END_DAY = eDay.get(Calendar.DATE);  //31일
		
		System.out.println("      " + year + "년" + month + "월");
		System.out.println(" SU MO TU WE TH FR SA ");
		
		for(int i=1;i<START_DAY_OF_WEEK;i++) {
		    System.out.print("   "); //3칸
		}
		
		for(int i=1,n=START_DAY_OF_WEEK;i<=END_DAY;i++,n++) {
			System.out.print((i < 10 ? "  " + i: " "+ i)); //2칸 1칸
			if(n % 7 == 0) {
				System.out.println();
			}
		}
	
	}

}
