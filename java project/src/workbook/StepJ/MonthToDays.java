package workbook.StepJ;

import java.util.Scanner;
public class MonthToDays {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int date[][] = new int[2][2];
	private byte test[] = new byte[2];
	
	public MonthToDays() {
		input();
	}
	
	public void printDiffer() {
		int differ;
		if((test[0] == 0)&&(test[1]==0)) {
			differ = CalcDate(date[0][0],date[0][1])-CalcDate(date[1][0],date[1][1]);
			if(differ < 0)
				System.out.printf("두 날짜의 간격은 %d일입니다.\n", -differ);
			else
				System.out.printf("두 날짜의 간격은 %d일입니다.\n", differ);
		}
		else
			System.out.println("잘못 입력하셨습니다.");
	}
	
	void input() {
		String name[] = {"첫번째", "두번째"};
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//월 일 두개 입력받고
		for(int i = 0; i < 2; i++) {
			System.out.printf("%s 날짜를 입력하시오. (월 일)", name[i]);
			for(int j = 0; j < 2; j++)
				date[i][j] = s.nextInt();
			test[i] = testNum(date[i][0], date[i][1]);
		}
	}
	
	byte testNum(int month, int day) {
		byte test = 0;
		//월이 13을 넘으면 1
		if(month >= 13) test = 1;
		//월-1이 해당되monthdays보다 day가 크면 1;
		else if(day > monthdays[month-1]) test = 1;
		return test;
	}
	
	int CalcDate(int month, int day) {
		int sum = day;
		//month만큼 돌리면서 합치기
		for(int i = 0; i < month-1; i++)
			sum += monthdays[i];
		return sum;
	}
}
