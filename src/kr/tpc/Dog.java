package kr.tpc;

public class Dog extends Animal {
	
	// 개이름, 나이, 종 : 상태정보

	// 부모가 가지고 있는 메서드를 재정의 한 것(Override)
	public void eat() {
		System.out.println("개먹");
	}
	
}
