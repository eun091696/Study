package projectA15; //vector

import java.util.Vector;

public class projectA1502 {

	public static void main(String[] args) {
		//정수 값만 다루는 벡터 생성
		Vector<Integer> v = new Vector<>();
		
		//자료 추가
		v.add(5);
		v.add(4);
		v.add(-1);
		
		//중간 자료 추가 -> 2번째 인덱션에 100 추가
		v.add(2, 100); 
		
		for(int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		System.out.println();
		for(int i : v) {
			System.out.println(i);
		}
		int sum = 0;
		for(int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum = sum + n;
		}
		System.out.println(sum);
	}

}
