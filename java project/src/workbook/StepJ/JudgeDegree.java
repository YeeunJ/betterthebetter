package workbook.StepJ;

import java.util.Scanner;

public class JudgeDegree {
	private double degree[] = new double[10];
	private int judge[] = new int[4];
	private String name[] = {"냉수", "미온수", "온수", "끓는 물"};
	
	public JudgeDegree() {
		input();
	}
	
	public void printDegree() {
		int result;
		for(int i = 0; i < degree.length; i++) {
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.\n", i+1, degree[i]);
			result = AskWater(degree[i]);
			if(result != -1)
				judge[AskWater(degree[i])]++;
		}
		for(int i = 0; i < judge.length; i++)
			System.out.printf("%s 입력 횟수 %d입니다.\n", name[i], judge[i]);
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//10번 입력받고
		for(int i = 0; i<degree.length; i++) {
			System.out.printf("%d번째 물의 온도를 입력하시오.", i+1);
			degree[i] = s.nextDouble();
		}
	}
	
	byte AskWater(double degree) {
		//판정해서 리턴  0도 ~ 25도 미만 : 냉수 25도 ~ 40도 미만 : 미온수 40도 ~ 80도 미만 : 온수 80도 이상 : 끓는 물
		if(degree >= 80)
			return 3;
		else if (degree >= 40)
			return 2;
		else if (degree >= 25)
			return 1;
		else if (degree >= 0)
			return 0;
		else return -1;
	}
}
