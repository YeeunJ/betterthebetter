package workbook.StepJ;

public class GoldenRatio {
	private int count = 2;
	private double before = 2;
	private double after;
	public GoldenRatio() {
		print();
	}
	
	void print() {
		while(true) {
			before = after;
			after = (double)fibonacci(count+1)/(double)fibonacci(count);
			System.out.printf("%d번째 비율 (%d / %d) : %f\n", count, count, count-1, after);
			if((before-after <0.000001)&&(before-after >-0.000001)) break;
			count++;
		}
	}
	int fibonacci(int n) {
		if(n > 2) return fibonacci(n-1) + fibonacci(n-2);
		else return 1;
	}
}
