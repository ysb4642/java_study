import java.util.*;

public class Exercise4_14 {

	public static void main(String[] args) {
		int answer = (int)(Math.random() *100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();
			
			if (answer == input) {
				System.out.printf("맞췄습니다.\n시도 횟수는 %d번 입니다.", count);
				break ;
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("더 큰 수를 입력하세요.");
			}
		} while (true);

	}

}
