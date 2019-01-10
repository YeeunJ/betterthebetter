package workbook.StepL;

import java.util.*;

public class StudentInfo {
	private String Info[] = new String[6];
	
	StudentInfo(String[] in) {
		for(int i =0; i< Info.length; i++)
			this.Info[i] = in[i];
	}
	
	ArrayList<StudentInfo> si = new ArrayList<StudentInfo>();
	public StudentInfo() {
		ask();
	}
	
	void ask() {
		int menu = 0;
		Scanner s = new Scanner(System.in);
		while(menu != 8) {
			System.out.println("------------------------------------------------------------------------------------------------- ");
			System.out.printf("1) 학생등록 2) 정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==> ");
			menu = s.nextInt();
			System.out.println("------------------------------------------------------------------------------------------------- ");
			switch(menu) {
			case 1:
				register();
				break;
			case 2:
				list();
				modify();
				break;
			case 3:
				list();
				remove();
				break;
			case 4:
				print_list();
				break;
			case 5:
				search_name();
				break;
			case 6:
				re_list();
				break;
			case 7:
				search_address();
				break;
			case 8:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
			System.out.println();
		}
	}
	
	void register() {
		input();
		si.add(new StudentInfo(Info));
		System.out.printf("총 %d명이 등록되었습니다.\n", si.size());
	}
	
	void modify() {
		int m_num;
		Scanner s = new Scanner(System.in);
		System.out.printf("==> 수정하실 번호를 입력하세요 : ");
		m_num = s.nextInt();
		input();
		si.set(m_num-1, new StudentInfo(Info));
		System.out.println("수정되었습니다.");
	}
	
	void remove() {
		int r_num;
		String really;
		Scanner s = new Scanner(System.in);
		System.out.printf("==> 삭제하실 번호를 입력하세요 :");
		r_num = s.nextInt();
		System.out.printf("정말로 삭제하시겠습니까?(Y/N) ");
		really = s.next();
		if(really.equalsIgnoreCase("Y")) {
			si.remove(r_num-1);
			System.out.println("삭제되었습니다.");
		}
	}
	
	void print_list() {
		System.out.println("이름	학번		성별	주소		전화번호		복학생");
		for(int i = 0; i < si.size(); i++) {
			System.out.printf("%s	%s	%s	%s	%s	%s\n", si.get(i).Info[0], si.get(i).Info[1], si.get(i).Info[2], si.get(i).Info[3], si.get(i).Info[4], si.get(i).Info[5]);
		}
	}
	void search_name() {
		int count = 0;
		String s_word;
		Scanner s = new Scanner(System.in);
		System.out.printf("검색하실 이름을 입력하세요 :");
		s_word = s.next();
		System.out.println("검색되었습니다.");
		System.out.println("번호	이름	학번		성별	주소		전화번호		복학생");
		for(int i = 0; i < si.size(); i++) {
			if(si.get(i).Info[0].indexOf(s_word) != -1) {
			System.out.printf("%d	%s	%s	%s	%s	%s	%s\n", count+1, si.get(i).Info[0], si.get(i).Info[1], si.get(i).Info[2], si.get(i).Info[3], si.get(i).Info[4], si.get(i).Info[5]);
			count++;
			}
		}
	}
	void re_list() {
		int count = 0;
		System.out.println("번호	이름	학번		성별	주소		전화번호		복학생");
		for(int i = 0; i < si.size(); i++) {
			if(si.get(i).Info[5].equalsIgnoreCase("Y")) {
			System.out.printf("%d	%s	%s	%s	%s	%s	%s\n",count+1, si.get(i).Info[0], si.get(i).Info[1], si.get(i).Info[2], si.get(i).Info[3], si.get(i).Info[4], si.get(i).Info[5]);
			count++;
			}
		}
		System.out.printf("복학생은 %d명입니다.\n", count);
	}
	void search_address() {
		int count = 0;
		String s_word;
		Scanner s = new Scanner(System.in);
		System.out.printf("검색하실 이름을 입력하세요 :");
		s_word = s.next();
		System.out.println("검색되었습니다.");
		System.out.println("번호	이름	학번		성별	주소		전화번호		복학생");
		for(int i = 0; i < si.size(); i++) {
			if(si.get(i).Info[3].indexOf(s_word) != -1) {
			System.out.printf("%d	%s	%s	%s	%s	%s	%s\n", count+1, si.get(i).Info[0], si.get(i).Info[1], si.get(i).Info[2], si.get(i).Info[3], si.get(i).Info[4], si.get(i).Info[5]);
			count++;
			}
		}
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("학생이름, 학번, 성별을 입력하세요 :");
		for(int i = 0; i < 3; i++)
			Info[i] = s.next();
		System.out.printf("주소를 입력하세요 :");
		String strInput = s.nextLine();
		Info[3] = s.nextLine();
		System.out.printf("전화번호를 입력하세요 :");
		Info[4] = s.next();
		System.out.printf("복학생입니까?(Y/N)");
		Info[5] = s.next();
	}
	void list() {
		System.out.println("번호	이름	학번		성별	주소		전화번호		복학생");
		for(int i = 0; i < si.size(); i++) {
			System.out.printf("%d	%s	%s	%s	%s	%s	%s\n",i+1, si.get(i).Info[0], si.get(i).Info[1], si.get(i).Info[2], si.get(i).Info[3], si.get(i).Info[4], si.get(i).Info[5]);
		}
	}
}
