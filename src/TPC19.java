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
		
		// Animal <--- [Dog.class, Cat.class]  (Dog�� Cat�� ��Ȯ�� ���� ����� �𸥴�. class ���ϻ��̶�)
		// �׷��Ƿ� ���⼭�� Animal�� ������ Dog�� Cat�� ��� ���۽�ų �� �ִ����� �˾Ƴ��� ���� ���� �ٽ��̴�.
		
		// Dog dd=new Dog();
		// dd.eat(); �̷��� ���� ? ���� ����
		/*		
		Animal ad=new Dog();
		ad.eat();
		
		Animal ac=new Cat();
		ac.eat();
		*/
		
		
	}

}
