package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/

public class ifEx28_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int meLeft = 0;
		int meRight = 0;
		int meFinal = 0;
		int comFinal = 0;
		int comLeft = 0;
		int comRignt = 0;
		
		while (meLeft < 1 || meLeft > 3) {
			System.out.print("왼손 가위(1) 바위(2) 보(3) 입력 : ");
			meLeft = scan.nextInt();
		}
		
		while (meRight < 1 || meRight > 3) {
			System.out.print("오른손 가위(1) 바위(2) 보(3) 입력 : ");
			meRight = scan.nextInt();
		}
		
		comLeft = ran.nextInt(3) + 1;
		comRignt = ran.nextInt(3) + 1;
		
		while (meFinal < 1 || meFinal > 2) {
			System.out.print("왼손(1), 오른손(2) 선택 : ");
			meFinal = scan.nextInt();
		}
		
		if (meFinal == 1) {
			meFinal = meLeft;
		}
		else {
			meFinal = meRight;
		}
		
		comFinal = ran.nextInt(1) + 1;
		if (comFinal == 1) {
			comFinal = comLeft;
		}
		else {
			comFinal = comRignt;
		}
		
		if (meFinal == comFinal) {
			switch (meFinal) {
			case 1:
				System.out.println("me = 가위");
				System.out.println("com = 가위");
				System.out.println("무승부");
				break ;
			case 2:
				System.out.println("me = 바위");
				System.out.println("com = 바위");
				System.out.println("무승부");
				break ;
			case 3:
				System.out.println("me = 보");
				System.out.println("com = 보");
				System.out.println("무승부");
				break ;				
			}
		}
		else if ((meFinal == 1 && comFinal == 2) || 
				(meFinal == 2 && comFinal == 3) ||
				(meFinal == 3 && comFinal == 1)) {
			switch (meFinal) {
			case 1 :
				System.out.println("me = 가위");
				System.out.println("com = 바위");
				System.out.println("패배");
				break ;
			case 2:
				System.out.println("me = 바위");
				System.out.println("com = 보");
				System.out.println("패배");
				break ;
			case 3:
				System.out.println("me = 보");
				System.out.println("com = 바위");
				System.out.println("패배");
				break ;
			}
		}
		else {
			switch (meFinal) {
			case 1 :
				System.out.println("me = 가위");
				System.out.println("com = 보");
				System.out.println("승리");
				break ;
			case 2:
				System.out.println("me = 바위");
				System.out.println("com = 가위");
				System.out.println("승리");
				break ;
			case 3:
				System.out.println("me = 보");
				System.out.println("com = 바위");
				System.out.println("승리");
				break ;
			}
		}
		scan.close();
	}
}

