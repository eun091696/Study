package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int lottoAr[] = new int[6];
		int userAr[] = new int[6];
		int bonus;
		int bonusUser;
		int count = 0;
		//로또배열 6애의 랜덤값을 저장
		for(int i = 0; i < 6; i++) {
			lottoAr[i] = random.nextInt(45) + 1; //0 ~ 44 -> 1 ~ 45	
		}
		//bonus = random
		bonus = random.nextInt(45) + 1;
		
		System.out.println("Lotto:" + Arrays.toString(lottoAr) + ", bonus:" + bonus);
		
		//사용자에게 6개의 값과 보너스를 입력
		System.out.print("숫자 6개 입력:");
		for(int i = 0; i < 6; i++) {
			userAr[i] = sc.nextInt();
		}
		System.out.print("보너스 값 입력:");
		bonusUser = sc.nextInt();
		System.out.println("User:" + Arrays.toString(userAr) + ", bonus:" + bonusUser);
		//로또배열의 값과 사용자배열의 갑중 같은 값이 몇개 있는지 카운팅
		for(int j  = 0; j < 6; j++) {	
			for(int i = 0; i < 6; i++) {
				if(lottoAr[j] == userAr[i]) {
					count++;
				}
			}
		}
		System.out.println("총 맞춘 갯수:" + count);
		//count의 갯수에 까라 등수 정하기
		if(count == 6) {
			System.out.println("축하합니다! 1등입니다.!");
		}else if(count == 5) {
			if(bonus == bonusUser) {
				System.out.println("축하드립니다! 2등입니다.");
			}else {
				System.out.println("축하드립니다! 3등입니다.");
			}
		}else if(count == 4) {
			System.out.println("축하드립니다! 4등입니다.");
		}else if(count == 3) {
			System.out.println("축하드립니다! 5등입니다.");
		}else {
			System.out.println("아쉽지만 다음 기회에");
		}
	}

}
