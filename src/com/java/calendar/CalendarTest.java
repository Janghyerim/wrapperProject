package com.java.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); //get ����� c.get(Calendar.); ��������
		c.get(Calendar.YEAR);
		System.out.println(c.get(Calendar.YEAR)+"��"); //2022
		c.get(Calendar.MONTH);
		System.out.println(c.get(Calendar.MONTH)+ 1 +"��"); //0 ~ 11
		c.get(Calendar.DATE);
		System.out.println(c.get(Calendar.DATE)+"��");
		System.out.println(c.get(Calendar.HOUR)+"��");
		System.out.println(c.get(Calendar.MINUTE)+"��");
		System.out.println(c.get(Calendar.SECOND)+"��");
		System.out.println(c.get(Calendar.DAY_OF_WEEK)+"����"); //1.�Ͽ���  1~7

		
		

	}

}
