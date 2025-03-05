import java.util.InputMismatchException;
import java.util.Scanner;

public class NameNumber {

	private static String pPhoneNum;

	public static void main(String[] args) {
		boolean exit = false; 
		
		do {
			
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("인원 수 입력>> ");
				int personNum = scanner.nextInt();
				People[] p = new People[personNum];
				
				for ( int i= 0; i < p.length; i++) {
					System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >>");
					String pName = scanner.next();
					String pPhonNum = scanner.next();
					
				p[i]= new People(pName, pPhoneNum);
					
				}
				
				
				System.out.println("저장되었습니다.");
				
				for (int j = 0; j< Integer.MAX_VALUE; j++) {
					
					System.out.print("검색할 이름 >> ");
					String searchName = scanner.next();
					
					boolean test = true; 
							
					for (int i = 0; i < p.length; i++) {
						
					if (searchName.equals(p[i].name)) {
						p[i].ShowPhoneNum();
						test = true;
						break;
						
					} else {
							test = false;
						
					}
						
			}
					
					if (searchName.equals("그만")) {
						System.out.println("프로그램을 종료합니다.");
						exit = true;
						
						break;
						
					} else if (!test) {
						System.out.println(searchName + "은(는) 존재하지 않습니다.");
						
						
					}
					
				}
		
					scanner.close();
				
			} catch (InputMismatchException e) {
				
				System.out.println("값을 제대로 입력해주세요.");
				
			}
						
		} while (!exit); 

	}

}
