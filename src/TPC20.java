import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {

		// ����Ŭ���� Ÿ���� ����Ŭ���� Ÿ������ ���� ���� ��� ���迡�� �ڵ��� = ���θ�� = �ڵ� ����ȯ = object casting
		// �׷��� ���� class Ÿ���� ������ �ʿ䰡 ����. 
		// �� object casting �߿����� ���� Ÿ���� ū Ÿ������ ���� ���� �ڵ��̴�. �̰� Upcasting <-> ���߿� ��� Downcasting (�߿� ����)
		
		// Animal �θ�Ŭ������ ������� �ʰ� ��������.
		// �̰��� ����ϴ� ���� Dog, Cat�� ��� ������ �ִ��� ���� �����߰ų� �˰� �ִ� ��쿡 �ش��Ѵ�.
		Dog d=new Dog();
		d.eat();   // ? 
		
		Cat c=new Cat();
		c.eat();
		c.night();

		// Dog.class, Cat.class ���Ϲۿ� ���� �ҽ������� ���� �� �� �ȿ� � ������ �ִ��� �� ���� ���� ���� 
		
		Animal ani=new Dog();   // upcasting(�ڵ�����ȯ)
		ani.eat();       // ?�� �ƴ϶� Dog�� eat�� ���۵�. �̴� Ŭ������ ����Ǵ� ������ �����ǵ� ������� ã�ƺ��� �����ǵǾ����� �θ� eat�� �����ϰ� �ڽ� eat���� �ڵ� �����.
		
		ani=new Cat();
		ani.eat();
		//ani.night();
		
		((Cat)ani).night();   // �θ� type�� �ڽ� type���� �ٲٴ� �� --> downcasting(��������ȯ)
		
	}

}
