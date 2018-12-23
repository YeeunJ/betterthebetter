package workbook.StepF;

import java.util.Scanner;

public class calculateBMI {
	private int height, weight;
	private double bmilist[] = new double[10]; 
	private int count = 0;
	
	public calculateBMI() {
		input();
	}
	
	public void printBMI() {
		getBMI();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//반복
		for(int i = 0; i < 10; i++) {
			//입력받기
			System.out.printf("%d번쨰 사람의 신장(cm)과 체중(kg)을 입력하시오.", i+1);
			height = s.nextInt();
			weight = s.nextInt();
			//비만도 수치 = 체중(kg) / (신장(m)의 제곱)
			bmilist[i] = (double)weight/(((double)height/100)*((double)height/100));
		}
	}
	
	void getBMI() {
		//10번 반복
		for(int i = 0 ; i < 10; i++) {
			//출력
			if(bmilist[i] >= 25) {
				System.out.printf("%d번쨰 사람은 비만입니다.\n", i+1);
				//count++
				count++;
			}
		}
		//출력
		System.out.printf("총 %d명의 사람이 비만입니다.\n", count);
	}
}
