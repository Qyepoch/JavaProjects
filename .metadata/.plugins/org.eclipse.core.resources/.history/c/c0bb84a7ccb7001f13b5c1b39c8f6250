package com.jan.and.swj.enumlearn;

public enum Week {
	MONDAY,TUESDAY,WENSDAY,THERSDAY,FRIDAY,SATERDAY,SUNDAY;
	
	public static Week getByValue(int value) {
		Week[] all = Week.values();
		if(value > 0 && value <= all.length) {
			return all[value - 1];
		}
		
		return null;
	}
}
