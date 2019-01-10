package workbook.StepK;

import java.util.Scanner;

public class Student {
	private int score[] = new int[3];
	private int total = 0;
	private double average;
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("학생의 국어, 영어, 수학점수를 입력하시오 -->");
		for(int i =0; i<score.length;i++) {
			score[i] = s.nextInt();
			total += score[i];
		}
		average = total/3.0;
	}
	
	String judge() {
		if(average > 95)
			return "A+";
		else if(average > 90)
			return "A";
		else if(average > 85)
			return "B+";
		else if(average > 80)
			return "B";
		else if(average > 75)
			return "C+";
		else if(average > 70)
			return "C";
		else if(average > 65)
			return "D+";
		else if(average > 60)
			return "D";
		else
			return "F";
	}
	void print(int index) {
		System.out.printf("%d	%d	%d	%d	%d	%.1f	%s\n", index, score[0], score[1], score[2], total, average, judge());
	}
}
