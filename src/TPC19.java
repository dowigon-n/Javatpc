import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	public static void main(String[] args) {
		
		// Dog class, Cat class --> Animal class
		 
		Dog d=new Dog();
		d.eat();
		
		Cat c=new Cat();
		c.eat();
		
		// Dog.java(x), Dog.class(o)
		// Dog dd=new Dog();
		
		// Animal <--- [Dog.class, Cat.class]  (Dog와 Cat의 정확한 동작 방식은 모른다. class 파일뿐이라)
		// 그러므로 여기서는 Animal을 가지고 Dog와 Cat을 어떻게 동작시킬 수 있는지를 알아내는 것이 가장 핵심이다.
		
		// Dog dd=new Dog();
		// dd.eat(); 이렇게 쓰면 ? 값만 나오
		/*		
		Animal ad=new Dog();
		ad.eat();
		
		Animal ac=new Cat();
		ac.eat();
		*/
		
		
	}

}
