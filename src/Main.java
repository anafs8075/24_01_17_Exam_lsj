import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		new App(sc).run();
	}
}


class App {

	private Scanner sc;

	public App(Scanner sc) {
		// TODO Auto-generated constructor stub
		this.sc=sc;
	}

	public void run() {
		
		System.out.println("==명언 앱 실행==");
		String cmd = sc.nextLine().trim();
		int id =1;
		
		while(true) {
			System.out.println("명령어 )");
				if(cmd.equals("등록")) {
					System.out.println("명언 : ");
					String content = sc.nextLine().trim();
					System.out.println("작가 : ");
					String author = sc.nextLine().trim();
					System.out.printf("%d번 명언이 등록되었습니다.\n", id);
					id++;
				} else if(cmd.equals("종료")) {
					break;
				}else {
					System.out.println("등록되지 않은 명령어");
				}
			
				
				
			}
		
		
		}
		
	}


