package com.jan.demo;
/*
 * 多线程
 */
public class Test {
	// main 是主线程
	 public static void main(String[] args) {
		 System.out.println("开启多线程！");
		 
		 // 攀登者 1
		 ClimbRunnable ruOne = new ClimbRunnable(2000, 2000);
		 Thread thOne = new Thread(ruOne, "攀登者 1 号");
		 thOne.start();
		 
		 // 攀登者 2
		 ClimbRunnable ruTwo = new ClimbRunnable(3000, 3000);
		 Thread thTwo = new Thread(ruTwo, "攀登者 2 号");
		 thTwo.start();
	}
}
