package projectA04;

import javax.swing.text.DefaultTextUI;

public class Abc {

	public static void main(String[] args) {
		int rank = 1;
		char medalColor = ' ';
		
		if(rank == 1) {
			medalColor = 'G';
		}else if(rank == 2) {
			medalColor = 'S';
		}else if(rank == 3) {
			medalColor = 'B';
		}else {
			medalColor = 'A';
		}
		System.out.println(rank + "등의 메달 색은" + medalColor + "입니다.");
	}

}
