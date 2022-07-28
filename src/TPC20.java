import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {

		// 하위클래스 타입이 상위클래스 타입으로 들어가는 것은 상속 관계에서 자동임 = 프로모션 = 자동 형변환 = object casting
		// 그래서 굳이 class 타입을 맞춰줄 필요가 없다. 
		// 이 object casting 중에서도 작은 타입이 큰 타입으로 들어가는 것은 자동이다. 이게 Upcasting <-> 나중에 배울 Downcasting (중요 개념)
		
		// Animal 부모클래스를 사용하지 않고 재정의함.
		// 이것을 사용하는 때는 Dog, Cat에 어떠한 동작이 있는지 직접 설계했거나 알고 있는 경우에 해당한다.
		Dog d=new Dog();
		d.eat();   // ? 
		
		Cat c=new Cat();
		c.eat();
		c.night();

		// Dog.class, Cat.class 파일밖에 없고 소스파일이 없을 때 이 안에 어떤 동작이 있는지 알 수가 없을 때는 
		
		Animal ani=new Dog();   // upcasting(자동형변환)
		ani.eat();       // ?가 아니라 Dog의 eat이 동작됨. 이는 클래스가 실행되는 시점에 재정의된 내용부터 찾아보고 재정의되었으면 부모 eat은 무시하고 자식 eat으로 자동 실행됨.
		
		ani=new Cat();
		ani.eat();
		//ani.night();
		
		((Cat)ani).night();   // 부모 type을 자식 type으로 바꾸는 것 --> downcasting(강제형변환)
		
	}

}
