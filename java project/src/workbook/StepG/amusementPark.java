package workbook.StepG;

import java.util.Scanner;

public class amusementPark {
	private int team_count; //방문 팀 수
	private int charge[] = {5000, 10000, 15000, 3000};//연령별 요금
	private int count;//방문자
	private int v_count[] = {0, 0, 0, 0}; //각각 방문자 수
	private int total_count = 0;//전체 방문자
	private int sum = 0;//요금 합
	private int total_sum =0;//전체 요금 합
	private int membership = 0;
	private String name[] = {"초등학생", "청소년", "일반인", "경로대상"};
	
	public amusementPark() {
		input();
	}
	
	public void printCharge() {
		System.out.printf("\n오늘 총 방문자 수는 %d명입니다.\n", total_count);
		for(int i =0; i < 4; i++) {
			System.out.printf("%s 수는 %d명입니다.\n", name[i], v_count[i]);
		}
		System.out.printf("\n총 입장료는 %d원입니다.\n", total_sum);
		
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//방문한 팀 입력받고
		System.out.printf("오늘 방문한 팀 수를 입력하시오.");
		team_count = s.nextInt();
		//그만큼 반복
		for(int i = 0; i < team_count; i++) {
			//4번 반복
			sum = 0;
			System.out.printf("%d번팀 인원수(초등학생, 청소년, 일반인, 경로대상)를 입력하세요.", i+1);
			for(int j = 0; j<4; j++) {
				//인원 입력받고
				count = s.nextInt();
				//인원 더하고
				total_count += count;
				v_count[j] += count;
				//돈 합치고
				sum += charge[j]*count;
			}
			//할인카드 입력받기
			System.out.printf("%d번팀 할인카드 종류(카드없음:0, 일반등급 카드 : 1, VIP 등급 카드 : 2)를 입력하세요.", i+1);
			membership = s.nextInt();
			//카드없음 : 할인 없음, - 일반등급 카드 : 10% 할인, - VIP 등급 카드 : 20% 할인
			//돈 다시 계산
			if(membership == 2)
				sum = sum/5*4;
			else if(membership == 1)
				sum = sum/10*9;
			//돈 합치고
			total_sum += sum;
			System.out.printf("%d번팀 입장료는 %d원입니다.\n", i+1, sum);
		}
	}
}
