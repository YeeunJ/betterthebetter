package workbook.StepI;

import java.util.Random;

public class JudgeNumber {
	private int number[] = new int[10];
	private byte kind;
	private int judge[] = {0,0,0};
	private String name[] = {"대(70 이상)", "중(40이상)", "소(40미만)"};
	
	public JudgeNumber() {
		input();
	}
	
	public void printNumber() {
		for(int i=0; i<3; i++)
			System.out.printf("%d. %s : %d회 생성\n", i+1, name[i], judge[i]);
	}
	void input() {
		Random r = new Random();
		System.out.println("10개의 숫자를 생성합니다.");
		//10번 반복
		for(int i = 0; i<number.length; i++) {
			//생성하고
			number[i] = r.nextInt(100) + 1;
			System.out.printf("생성된 임의의 숫자는 %d입니다.\n", number[i]);
			//함수
			kind = GetRandom(number[i]);
			judge[kind]++;
		}
	}
	byte GetRandom(int number) {
		// 대(70 이상)
		if(number >= 70)
			return 0;
		//아니고 중(40이상), 
		else if(number >= 40)
			return 1;
		//아니면 소
		else
			return 2;
	}
}
