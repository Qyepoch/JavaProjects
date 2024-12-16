package com.jan.demo;

public class ClimbRunnable implements Runnable {
	// 每爬100米需要的时间
	private int time;
	// 爬了多少个100米
	private int num;
	
	public ClimbRunnable(int time,int meter) {
		this.time = time;
		this.num = meter * 1000 / 100;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		Thread.currentThread().setName("攀登者");
		while(num > 0) {
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "爬了100米！");
			num --;
		}
		System.out.println(Thread.currentThread().getName() + "到达终点！"); 	
	}
}
