package workbook.StepL;

import java.util.*;
import java.text.SimpleDateFormat;

public class ParkingLot {
	private int carnum, num, count, sequence;
	private int year, month, day, hour, minute;
	private String kind;
	private Date time;
	private int seperateTime[] = new int[5];
	private int order[] = new int[100];
	
	ParkingLot(int s, int n, String k, Date t){
		this.sequence = s;
		this.carnum = n;
		this.kind = k;
		this.time = t;
	}
	
	ArrayList<ParkingLot> pl = new ArrayList<ParkingLot>();
	
	public ParkingLot() {
		ask();
		program();
	}
	
	void ask() {
		//몇 대 주차할 것인지 묻고 그만큼이 되면 while문을 빠져 나오는 걸로 하자..!!
		Scanner s = new Scanner(System.in);
		System.out.printf("주차할 수 있는 차의 개수를 입력하세요 : ");
		num = s.nextInt();
		System.out.printf("총 %d대를 주차할 수 있습니다.\n", num);
	}
	
	void program() {
		int menu = 0;
		Scanner s = new Scanner(System.in);
		while(menu != 6) {
			System.out.println("---------------------------------------------------");
			System.out.printf("1) 입차 2) 출차 3) 리스트 4)입차 총개수 5)주차잔여개수 6)종료 ==>");
			menu = s.nextInt();
			System.out.println("---------------------------------------------------");
			
			switch(menu){
				case 1:
					if(pl.size() < num)
						incar();
					else
						System.out.println("주차가 가능한 공간이 없습니다.");
					break;
				case 2:
					list();
					outcar();
					break;
				case 3:
					list();
					System.out.printf("%d대 주차가능.\n", num-pl.size());
					break;
				case 4:
					System.out.printf("총 %d대가 주차되어 있습니다.\n\n", pl.size());
					list();
					break;
				case 5:
					System.out.printf("주차 가능한 자리는 %d대입니다. \n", num-pl.size());
					break;
				case 6:
					System.out.println("종료되었습니다.");
					break;
				default:
					System.out.println("잘못 입력했습니다.");
			}
			System.out.println();
		}
	}
	
	//입차
	void incar() {
		Scanner s = new Scanner(System.in);
		SimpleDateFormat i = new SimpleDateFormat("YYYY년 M월 d일 k시 m분", Locale.KOREA);
		System.out.printf("입차할 차의 번호와 차종을 입력하세요. ");
		carnum = s.nextInt();
		kind = s.next();
		Date d = new Date();
		sequence = place();
		pl.add(new ParkingLot(sequence, carnum, kind, d));
		
		System.out.printf("[%d번] %s 입차 되었습니다.\n", sequence, i.format(d));
	}
	
	//출차
	void outcar() {
		int out_num;
		Scanner s = new Scanner(System.in);
		System.out.printf("==> 출차 번호를 입력하세요 : ");
		out_num = s.nextInt();
		for(int i = 0; i < pl.size(); i++) {
			if(pl.get(i).sequence == out_num) {
				Money(i);
				pl.remove(i);
				order[i] = 0;
				break;
			}
		}
		System.out.println("정산되었습니다.");
	}
	//리스트
	void list() {
		SimpleDateFormat t = new SimpleDateFormat("YYYY-MM-dd kk:mm", Locale.KOREA);
		int number = 0;
		int i = 0;
		//number이 입차된 수까지 될때까지 돌리면서 만약 출력하면 number++하는 걸로 하자
		while(number < pl.size()) {
			//만약 order[i]가 1이라면 그 번호에 차가 있는거니까 돌리면서  sequence가 i+1인 것을 찾아서 출력해주면 되겠다..!!출력하면 number++,마지막에 무조건 i++;
			if(order[i] == 1)
				for(int j = 0; j < num; j++)
					if(pl.get(j).sequence == i+1) {
						System.out.printf("[%d번] %d %s %s\n", pl.get(j).sequence, pl.get(j).carnum, pl.get(j).kind, t.format(pl.get(j).time));
						number++;
						break;
					}
			i++;
		}
	}
	
	int place() {
		int s = 0;
		for(int i = 0; i < order.length; i++)
			if(order[i] == 0) {
				s = i;
				break;
			}
		order[s] = 1;
		return s+1;
	}
	//돈 계산
	void Money(int out_index){
		long nowdate, pastdate, different, charge, total_d;
		SimpleDateFormat new_t = new SimpleDateFormat("YYYYMMddkkmm", Locale.KOREA);
		SimpleDateFormat t = new SimpleDateFormat("YYYYMMdd kk:mm", Locale.KOREA);
		
		Date now = new Date();
		nowdate = Long.parseLong(new_t.format(now));
		pastdate = Long.parseLong(new_t.format(pl.get(out_index).time));
		different = nowdate - pastdate;
		total_d = different/10000*24*60+(different%10000)/100*60 + different%100;
		System.out.println(total_d);
		if(total_d == 0)
			charge = 0;
		else if(total_d % 10 == 0)
			charge = total_d/10*500-500;
		else
			charge = total_d/10*500+500;
		System.out.printf("==> 현재 시간은 [%s]이므로 주차금액은 %d원입니다.\n", t.format(now), charge);
	}
}
