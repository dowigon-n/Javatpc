public class TPC08 {
	public static void main(String[] args) {
		
		int a=30;
		int b=50;
		int v=add(a, b); // static method call (static method �� ��� ���Ÿ�ü�� �ٲ�)
		
		System.out.println(v); 
		

	}
	
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}

}

// static Ű����� ���α׷��� �����ϱ� ���� �޼����� ���� �ڵ带 �ڵ����� �޸𸮿� �ε���Ű�� ���� ����ϴ� Ű������.