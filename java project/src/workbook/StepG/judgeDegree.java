package workbook.StepG;

import java.util.Scanner;
public class judgeDegree {
	private double degrees[] = new double[10];
	private String degree_name[] = {"냉수", "미온수", "온수", "끓는물", "잘못 입력"};
	private int count[] = {0,0,0,0};
	private int sel;
	
	public judgeDegree() {
		input();
	}
	
	public void printDegree() {
		getDegree();
		//4번 반복
		for(int i = 0; i < 4; i++)
			//출력
			System.out.printf("%s 입력 횟수 : %d\n", degree_name[i], count[i]);
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//10개 받기
		for(int i = 0; i< 10; i++) {
			//입력받고
			System.out.printf("%d번 물의 온도를 입력하시오.", i+1);
			degrees[i] = s.nextInt();
		}
	}
	
	void getDegree() {
		//10번 반복
		for(int i = 0; i < 10; i++) {
			//먼저 출력
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.", i+1, degrees[i]);
			//만약 음수 값 (0미만) : 잘못입력 
			if(degrees[i] < 0)
				sel = 4;
			//아니고 25도 미만 : 냉수 ++
			else if(degrees[i] < 25)
				sel = 0;
			//아니고 40도 미만 : 미온수 ++
			else if(degrees[i] < 40)
				sel = 1;
			//아니고 80도 미만 : 온수 ++
			else if(degrees[i] < 80)
				sel = 2;
			//아니면 끓는 물++
			else
				sel = 3;
			
			count[sel]++;
			System.out.println(degree_name[sel]);
		}
		
	}
}
