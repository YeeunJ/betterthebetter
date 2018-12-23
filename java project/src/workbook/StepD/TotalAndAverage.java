package workbook.StepD;

import java.util.Scanner;

public class TotalAndAverage {
	int number;
	int count=0;
	int totalsum = 0; 
	double average;
	
	public TotalAndAverage() {
		input();
	}
	public void printTA() {
		System.out.printf("입력한 %d 개의 숫자들의 총 합계는 %d이고, 평균값은 %.1f 입니다.\n",count, totalsum, GetTA());
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//계속 반복
		while(true) {
			//입력받고
			System.out.printf("0부터 100 사이의 숫자를 입력하세요.");
			this.number = s.nextInt();
			//0~100아니면 나가기
			if((number >= 100)||(number <= 0))
				break;
			//count++
			count++;
			//더하고
			totalsum += number;
		}
	}
	
	double GetTA() {
		average = (double)totalsum / count;
		
		return this.average;
	}
}
