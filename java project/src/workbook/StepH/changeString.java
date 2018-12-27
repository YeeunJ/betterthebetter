package workbook.StepH;

import java.util.Scanner;

public class changeString {
	private String input; 
	private String findStr; 
	private String replaceStr;
	
	public changeString() {
		input();
	}
	
	public void printChangeStr() {
		getStr();
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("=> 문자열을 입력하세요 (x: 종료) : ");
		input = s.nextLine();
		if(!input.equalsIgnoreCase("X")) {
			System.out.printf("=> 찾을 문자열을 입력하세요 : ");
			findStr = s.next();
			System.out.printf("=> 바꿀 문자열을 입력하세요 : ");
			replaceStr = s.next();
		}
	}
	
	void getStr() {
		int count = 0;
		while(!input.equalsIgnoreCase("X")) {
		//몇 개 있는지 출력
			String list[] = input.split(" ");
			for(int i = 0; i < list.length; i++)
				if(list[i].equals(findStr))
					count++;
			System.out.printf("=> 총 %d번 바뀌었습니다.", count);
			//모두 바꾸기
			input = input.replace(findStr, replaceStr);
			System.out.printf("=> %s\n\n", input);
			input();
		}
	}
}
