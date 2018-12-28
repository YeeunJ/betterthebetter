package workbook.StepI;

import java.util.Scanner;

public class FatDecision {
	private int height;
	private int weight;
	private double bmi;
	
	public FatDecision() {
		input();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//10번 반복하며 
		for(int i = 0; i<10; i++) {
			//묻기
			System.out.printf("%d번째 사람의 신장(cm)과 체중(kg)을 입력하시오.", i+1);
			height = s.nextInt();
			weight = s.nextInt();
			//계산하는 함수
			AskBiman(height, weight);
		}
	}
	
	void AskBiman(int height, int weight) {
		//bmi계산
		bmi = weight/((height/100.0)*(height/100.0));
		//1. 18.5 미만 : 저체중
		if(bmi < 18.5)
			System.out.println("저체중입니다.");
		//2. 아니고 23 미만 : 정상체중 
		else if(bmi < 23)
			System.out.println("정상입니다.");
		//3. 아니고 25미만 : 과체중
		else if(bmi < 25)
			System.out.println("과체중입니다.");
		//4. 아니고 30미만 : 경도비만 
		else if(bmi < 30)
			System.out.println("경도 비만입니다.");
		//5. 아니고 고도비만
		else
			System.out.println("고도 비만입니다.");
	}
}
