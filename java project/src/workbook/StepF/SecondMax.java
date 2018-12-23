package workbook.StepF;

import java.util.Scanner;
public class SecondMax {
	private int num[] = new int[10];
	private int first, first_index;
	private int second;
	private int second_max_index;
	
	public SecondMax() {
		input();
	}
	public void Print2nd() {
		System.out.printf("두번째로 큰 수는 %d번째 수 %d입니다.\n", second_max_index, second);
	}
	void input() {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//10번 반복하면서 수 입력받기
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번째 수를 입력하시오.", i+1);
			num[i] = s.nextInt();
			//만약 i = 0이면 가장 큰거 두번째 모 = num[i]
			if(i == 0) {
				first = num[i];
				second = num[i];
				first_index = 1;
				second_max_index = 1;
			}
			//아니고 num[i]가 first보다 크거나 같으면 first에 있는 것은 second, first는 num[i]
			else if(num[i] >= first) {
				second = first;
				second_max_index = first_index;
				first_index = i+1;
				first = num[i];
			}
			//아니고 second보다 크면 second만 바꾸기
			else if (num[i] > second){
				second = num[i];
				second_max_index = i+1;
			}
			
		}
	}
	
	
}
