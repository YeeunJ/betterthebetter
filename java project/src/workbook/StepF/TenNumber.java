package workbook.StepF;

import java.util.Scanner;

public class TenNumber {
	private int number[] = new int[10];// 사용자가 입력한 숫자 10개
	private int count; 
	private boolean dup = true;
	
	public TenNumber() {
		input();
	}
	
	public void printTen() {
		for(int i = 0; i < 10; i++)
			System.out.printf("%d번째 숫자는 %d입니다.\n", i+1, number[i]);
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("1부터 100까지의 숫자를 입력하시오.");
		//계속 반복
		while(count < 10) {
			//입력받기
			System.out.printf("%d번째 숫자를 입력하시오.", count+1);
			number[count] = s.nextInt();
			//1~100이 아니면 false
			if((number[count] < 1)||(number[count] > 100))
				dup = false;
			else{
				//맞으면 count전까지 반복
				for(int i = 0; i < count; i++)
					//같으면 false
					if(number[i] == number[count])
						dup = false;
			}
			//true이면 count++
			if(dup == true)
				count++;
			//아니면 잘못 입력했다고 말하고 true
			else {
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
				dup = true;
			}
		}
	}
}
