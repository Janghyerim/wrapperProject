package com.java.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); //get 선언시 c.get(Calendar.); 생략가능
		c.get(Calendar.YEAR);
		System.out.println(c.get(Calendar.YEAR)+"년"); //2022
		c.get(Calendar.MONTH);
		System.out.println(c.get(Calendar.MONTH)+ 1 +"월"); //0 ~ 11
		c.get(Calendar.DATE);
		System.out.println(c.get(Calendar.DATE)+"일");
		System.out.println(c.get(Calendar.HOUR)+"시");
		System.out.println(c.get(Calendar.MINUTE)+"분");
		System.out.println(c.get(Calendar.SECOND)+"초");
		System.out.println(c.get(Calendar.DAY_OF_WEEK)+"요일"); //1.일요일  1~7

		
		

	}

}
