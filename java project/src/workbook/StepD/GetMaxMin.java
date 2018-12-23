package workbook.StepD;

import java.util.Scanner;
public class GetMaxMin {
	private int number; // 입력받은 수
	private int max_num, min_num;
	private int count = 0;
	
	public GetMaxMin(){
		input();
	}
	public void printMaxMin() {
		System.out.printf("입력된 숫자들 중 가장 큰 수는 %d이고, 가장 작은 수는 %d입니다.\n", max_num, min_num);
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//계속 반복
		while(true) {
			//값 입력받고
			System.out.printf("0부터 100사이의 숫자를 입력하세요.");
			number = s.nextInt();
			//0~100사이 아니면 break
			if((number < 0)||(number > 100))
				break;
			//count++
			count++;
			//count가 1이면 max, min은 number
			if(count == 1) {
				max_num = number;
				min_num = number;
			}
			//아니면 number이 max보다 크면 바꾸고 min보다 작으면 바꾸고
			else if(number > max_num)
				max_num = number;
			else if(number < min_num)
				min_num = number;
		}
	}
}
