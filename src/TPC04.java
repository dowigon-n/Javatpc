public class TPC04 {
	public static void main(String[] args) {
	// 4. �����͸� �̵��϶�.(���� VS �迭)�� ����
		
		int a, b, c;
		a=10;
		b=20;
		c=30;
		// a+b+c=? �޼��� ó�� -> hap()
		
		// 3�� �����͸� �ٸ� �Լ�, Ŭ������ �̵��� �� ��� �̵��ϴ� ���� �ո����̰� ������ �ǽ�

		// �Լ�(�޼���) ȣ��=��
		hap(a, b, c);    // �޼��� ȣ���� �Ǹ� ������� �Ѿ��. ������� �Ѿ �� int x, int y, int z��.. a��->x, b��->y, c��->z : 10, 20, 30 ���� �Ѿ��.
		
		
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b; 
		arr[2] = c;
		
		hap1(arr);  // ȣ��
		
		
		int[][] marr;
		marr = new int[3][4];   // ���=��ü ����
		
	}
	
	public static void hap(int x, int y, int z) {   // �Ű� ���� a, b, c�� �ƴ϶� x, y, z���� �������.
		
		// hap()�� 3�� �����͸� �޾Ƽ� ���� ���ؼ� ����� �ص� �ǰ� �ٽ� �����ص� �ǰ�..
		int sum = x + y + z;
		
		System.out.println(sum);
	}
	
	public static void hap1(int[] x) {    // main�� arr�� x�� �ѱ�� x�� arr[0]�� a, arr[1]�� b, arr[2]�� c�� ����ų �� �ִ�.
		
		// �迭�̴ϱ� �ݺ��� Ȱ�� - for, while
		// �ݺ��� �𸣸�
		//int sum = x[0] + x[1] + x[2];
		//System.out.println(sum);
		
		int sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
	// 1���� �迭 : Vector, List
	// 2���� �迭 : Array
	
}
