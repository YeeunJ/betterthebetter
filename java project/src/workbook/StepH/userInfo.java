package workbook.StepH;

import java.util.Scanner;

public class userInfo {
	private String input;
	private String userList[];
	
	public userInfo(){
		input();
	}
	
	public void printInfo() {
		register();
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.printf("=> 문자열을 입력하세요 (x: 종료) : ");
		input = s.next();
	}
	
	void register() {
		while(!input.equalsIgnoreCase("X")) {
			//문자열 split
			userList = input.split("###");
			System.out.printf("=> 총 %d명이 등록되었습니다.\n", userList.length);
			//문자열만큼 돌리면서
			for(int i = 0; i<userList.length; i++) {
				//|를 바꾸고 출력
				userList[i] = userList[i].replace("|", " ");
				System.out.printf("%d %s\n", i+1, userList[i]);
			}
			input();
		}
	}
}
