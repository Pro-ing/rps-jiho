import java.util.Iterator;
import java.util.Scanner;

public class rpsMain {
	
	public static void main(String[] args) {
		
		
		rpsLogic rpsLogic = new rpsLogic();
		System.out.println("가위바위보를 시작합니다.");		
		rpsLogic.rpsStart(5);

	}

}
	