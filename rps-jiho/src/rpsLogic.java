import java.util.Scanner;

public class rpsLogic {
	int cnt;
	
	void rpsStart(int cnt){
		
		double userRpsresult;
		
		//vo 문자열 세팅
		rpsVo rps = new rpsVo();
		rps.setRock("바위");
		rps.setPaper("보");
		rps.setScissors("가위");
		
		
		//가위바위보 3번 진행
		for (int i = 1; i <= cnt; i++) {
			System.out.println(i+"회차 가위바위보를 시작합니다.");
			System.out.println("-------가위, 바위, 보 중에 입력해주세요-------");
			Scanner sc = new Scanner(System.in);
			String userRps = sc.nextLine();
			
			//가위, 바위, 보 중에 안나오면 다시 시작
			if(userRps.equals(rps.getPaper()) || userRps.equals(rps.getRock()) 
					|| userRps.equals(rps.getScissors())) {
				System.out.println("사용자가 낸 거 : " + userRps);
				
				//사용자가 바위를 입력 시 값에 0.0 입력
				if (userRps.equals(rps.getRock())) {
					userRpsresult = 0.0;
				//사용자가 보를 입력 시 값에 3.4 입력	
				} else if (userRps.equals(rps.getPaper())) {
					userRpsresult = 3.4;
				//사용자가 가위를 입력 시 값에 6.7 입력	
				} else {
					userRpsresult = 6.7;
				}
				
				//랜덤으로 컴퓨터 묵찌빠 나오게 하기
				double rpsRandom = Math.random();
				double rpsCom = (rpsRandom*10);
				String rpsComResult;
				
				//랜덤 값에 따른 컴퓨터 값 나오게 하기
				if(rpsCom >= 0.0 && rpsCom <= 3.3) {
					rpsComResult = rps.getRock();
				} else if (rpsCom >= 3.4 && rpsCom <= 6.6) {
					rpsComResult = rps.getPaper();
				} else {
					rpsComResult = rps.getScissors();
				}
				
				System.out.println("컴퓨터가 낸 거 : " + rpsComResult);
				
				//사용자가 묵을 냈을 때
				if ((userRpsresult == 0.0 && rpsCom < 3.4) || (userRpsresult == 3.4 && rpsCom <= 6.6 && rpsCom >= 3.4)
						|| (userRpsresult == 6.7 && rpsCom >= 6.6)) {
					System.out.println("비겼습니다.");
				} else if ((userRpsresult == 0.0 && rpsCom >= 6.6) || (userRpsresult == 3.4 && rpsCom < 3.4) 
						|| (userRpsresult == 6.7 && rpsCom <= 6.6 && rpsCom >= 3.4)) {
					System.out.println("사용자가 이겼습니다.");
				} else {
					System.out.println("컴퓨터가 이겼습니다.");
				}
				
			} else {
				System.out.println("가위, 바위, 보 중 입력해 주세요");
			}
			System.out.println("--------------------------------------");
		}
		
		System.out.println("----------가위바위보를 종료합니다.-----------");
		
		
	}
		
		
	}

