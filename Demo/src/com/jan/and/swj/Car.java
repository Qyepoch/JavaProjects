package com.jan.and.swj;

/*
 * explain:	内部类代码学习
 * date:	2024-12-01
 * author:	zhangjian
 */
public class Car {
	private Engin engin;// 发动机
	private double oilVolume;// 油量
	
	public Car() {
		this.engin = new Engin();
	}
	
	public void setOilVolume(double oilVolume) {
		this.oilVolume = oilVolume;
	}
	
	public void start() {
		engin.on();
	}
	
	public void drive() {
		while(engin.flag) {
			engin.work();
		}
	}
	public void stop() {
		engin.off();
	}
	private class Engin {
		private boolean flag;
		
		void on() {
			System.out.println("发送机启动！");
			flag = true;
		}
		
		void off() {
			System.out.println("发送机关闭！");
			flag = false;
		}
		
		void work() {
			if(oilVolume <= 0) {
				flag = false;
				return;
			}
			System.out.println("发动机工作");
			oilVolume --;
		}
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.setOilVolume(5);
		car.start();
		car.drive();
		car.stop();
	}

}

