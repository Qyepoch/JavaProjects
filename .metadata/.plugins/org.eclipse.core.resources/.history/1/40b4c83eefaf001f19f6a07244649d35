package com.jan.and.swj;

import java.util.Scanner;
import com.jan.and.swj.enumlearn.Season;
import com.jan.and.swj.enumlearn.Week;

public class main {
	public static void main(String[] args) {
		Season spring = Season.SPRING;
		Season summer = Season.SUMMER;
		Season winter = Season.WINTER;
		spring.show();
		summer.show();
		winter.show();
		System.out.println(spring);
		System.out.println(winter);
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入星期：");
		int value = input.nextInt();
		
		Week week = Week.getByValue(value);
		if(week!=null) {
			System.out.println("名称：" + week.name());
			System.out.println("序号：" + week.ordinal());
		}
		
		switch(week) {
		case MONDAY:
			System.out.println("星期一");break;
		case TUESDAY:
			System.out.println("星期二");break;
		case WENSDAY:
			System.out.println("星期三");break;
		case THERSDAY:
			System.out.println("星期四");break;
		case FRIDAY:
			System.out.println("星期五");break;
		case SATERDAY:
			System.out.println("星期六");break;
		case SUNDAY:
			System.out.println("星期日");break;
		default:
			System.out.print("输入有误");
		}
		
	}
}
