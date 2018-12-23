package workbook.StepC;

import java.util.Scanner;

public class MonthToDay {
	private int month, day; // 월, 일
	private int day_count = 0; // 1년 중 날 수
	
	public MonthToDay() {
		input();
	}
	public void printDay() {
		getDay();
		if(day_count == 0)
			System.out.println("잘못 입력하셨습니다.\n");
		else
			System.out.printf("이 날짜는 1년중 %d 번째 날에 해당됩니다.\n", getDay());
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("월을 입력하시오.");
		month = s.nextInt();
		System.out.printf("일을 입력하시오.");
		day = s.nextInt();
	}
	
	int getDay() {
		//만약 month가 1이고 day가 31보다 작으면
		if((month == 1)&&(day<=31)&&(day > 0))
			day_count = day;
			//day_count = day
		//만약 month가 2이고 day가 28보다 작거나 같고 0보다 크면
		else if((month == 2)&&(day<=28)&&(day > 0))
			day_count = day +31;
			//1월달 것 모두 더하고 day더하기
		//이런식으로 반복
		else if((month == 3)&&(day<=31)&&(day > 0))
			day_count = day +31+28;
		else if((month == 4)&&(day<=30)&&(day > 0))
			day_count = day +31+28+31;
		else if((month == 5)&&(day<=31)&&(day > 0))
			day_count = day +31+28+31+30;
		else if((month == 6)&&(day<=30)&&(day > 0))
			day_count = day +31+28+31+30+31;
		else if((month == 7)&&(day<=31)&&(day > 0))
			day_count = day +31+28+31+30+31+30;
		else if((month == 8)&&(day<=31)&&(day > 0))
			day_count = day +31+28+31+30+31+30+31;
		else if((month == 9)&&(day<=30)&&(day > 0))
			day_count = day +31+28+31+30+31+30+31+31;
		else if((month == 10)&&(day<=31)&&(day > 0))
			day_count = day +31+28+31+30+31+30+31+31+30;
		else if((month == 11)&&(day<=30)&&(day > 0))
			day_count = day +31+28+31+30+31+30+31+31+30+31;
		else if((month == 12)&&(day<=31)&&(day > 0))
			day_count = day +31+28+31+30+31+30+31+31+30+31+30;
		//2월 : 28일
		//1, 3, 5, 7, 8, 10, 12월 : 31일
		//4, 6, 9, 11월 : 30일
		return this.day_count;
	}
}
