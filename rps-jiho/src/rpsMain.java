import java.util.Scanner;


public class rpsMain {
	
	public static void main(String[] args) {
		
		rpsVo rps = new rpsVo();

		rps.setRock("바위");
		rps.setPaper("보");
		rps.setScissors("가위");

		System.out.println("가위, 바위, 보 중에 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String userRps = sc.next();

		System.out.println(userRps);
		System.out.println(rps.toString());
		if(userRps == rps.toString()) {
			System.out.println("동일함");
		
		}
		
		
	}

}
