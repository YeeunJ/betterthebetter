package workbook.StepA;

import java.util.Scanner;
public class GigaToOther {
	private int gigabytes; 
	private int megabytes; 
	private int kilobytes; 
	private long bytes;
	
	public GigaToOther() {
		input();
	}
	public void printOther() {
		System.out.printf("입력하신 파일 용량은 \n%d 메가바이트,\n%d 킬로바이트,\n%d 바이트 입니다.\n", getMega(), getKilo(), getByte());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 기가바이트 단위로 입력하세요.");
		//입력받고
		this.gigabytes = s.nextInt();
		s.close();
	}
	int getMega() {
		megabytes = gigabytes * 1024;
		return this.megabytes;
	}
	
	int getKilo() {
		kilobytes = megabytes * 1024;
		return this.kilobytes;
	}
	
	long getByte() {
		bytes = (long)kilobytes * 1024;
		return this.bytes;
	}
}
