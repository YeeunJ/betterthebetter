package workbook.StepF;

import java.util.Scanner;

public class MonthToDay {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	// 1~12월의 날 수
	private int month, day; 
	private int day_count = 0;
	
	public MonthToDay() {
		input();
	}
	
	public void printDay() {
		if (countDay() == 0)
			System.out.println("잘못 입력하셨습니다.");
		else
			System.out.printf("이 날짜는 1년 중 %d번째 날에 해당됩니다.\n", day_count);
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//월 일 입력받고
		System.out.printf("월을 입력하시오.");
		month = s.nextInt();
		System.out.printf("일을 입력하시오.");
		day= s.nextInt();
		
	}
	
	int countDay() {
		//만약 월이랑 일이 맞으면
		if((month >= 1)&&(month <= 12)&&(day <= monthdays[month-1])){
			//월 만큼 반복
			for(int i = 0; i < month - 1; i++)
				//더하고
				day_count += monthdays[i];
			//day더하고
			day_count += day;
		}
		//리턴
		return this.day_count;
	}
}
