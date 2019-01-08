package workbook.StepK;

import java.util.Scanner;

public class K04 {
	private int num;
	private int quadrant[] = {0,0,0,0};
	private int place;
	public K04() {
		count();
		input();
		output();
	}
	
	void count() {
		Scanner s = new Scanner(System.in);
		System.out.printf("몇 개의 좌표를 입력하겠습니까?");
		num = s.nextInt();
	}
	void input(){
		point p[] = new point[num];
		
		for(int i =0; i<num; i++) {
			p[i] = new point();
			System.out.printf("%d번째 ", i+1);
			place = p[i].input();
			if(place != 0)
				quadrant[place-1]++;
		}
		
		System.out.println("====================================");
		for(int i =0; i<num; i++) {
			System.out.printf("%d번째 ", i+1);
			p[i].output();
		}
	}
	void output() {
		for(int i = 0; i<4; i++)
			System.out.printf("%d사분면의 좌표는 모두 %d개입니다.\n", i+1, quadrant[i]);
	}
}