package workbook.StepD;

import java.util.Scanner;

public class countArea {
	private double m2_area; 
	private double pyung_area; 
	private int count1; //소
	private int count2; //중소
	private int count3; //중
	private int count4; //대
	private int i;
	
	public countArea() {
		input();
	}
	public void printArea() {
		System.out.printf("\"소형 아파트\"의 개수는 %d 입니다.\n",count1);
		System.out.printf("\"중소형 아파트\"의 개수는 %d 입니다.\n",count2);
		System.out.printf("\"중형 아파트\"의 개수는 %d 입니다.\n",count3);
		System.out.printf("\"대형 아파트\"의 개수는 %d 입니다.\n",count4);
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		for(i = 0; i < 10; i++) {
			System.out.printf("아파트의 분양 면적(제곱미터)을 입력하시오.");
			this.m2_area = s.nextDouble();
			pyung_area = m2_area/3.305;
			System.out.printf("이 아파트의 평형은 %.1f 입니다.\n", pyung_area);
			//15평 미만 : 소형
			if(pyung_area < 15)
				count1++;
			//아니고 30평 미만 : 중소형
			else if(pyung_area < 30)
				count2++;
			//아니고 50평 미만 : 중형
			else if(pyung_area < 50)
				count3++;
			//아니면 대형
			else
				count4++;
		}
	}
}
