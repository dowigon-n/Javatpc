public class TPC06 {
	public static void main(String[] args) {
		// 5. �ٽ��� �޼��� -> ����(method), ���(function) 
		
		int a=67;
		int b=98;
		// a+b=?

		int result = sum(a, b);   // �Լ�(�޼���)�� ȣ��
		System.out.println(result);
		
		int[] arr = makeArr();  // 10, 20, 30 �Ѿ���� ���������� int[] �̰� ���� ���� �������� arr�̴ϱ� int[] arr
		int hap=0;
		for(int i=0; i<arr.length; i++) {
			hap+=arr[i];
		}
		System.out.println(hap);
		
	}

	// static �޼���� ���� static �޼��常 �ٷ� ȣ���� �� �ִ�. (���� �̰Ϳ� ���� �����Ѵٰ���)
	// ���� 2���� �Ű������� �޾Ƽ� ������ ���Ͽ� �����ϴ� �޼��带 �����Ͻÿ�.
	public static int sum(int a, int b) {    // �Ű����� ���ޱ�� : a=67, b=98 ���� �����Ѵ� �ؼ� Call by Value ��� �θ���.
		int v = a + b;
		return v;
		
	}
	// 10, 20, 30 (3��)�� return �ϰ� �ʹٸ�?
	public static int[] makeArr() {
		int x=10;
		int y=20;
		int z=30;
		int[] arr = new int[3];
		arr[0]=x;
		arr[1]=y;
		arr[2]=z;
		return arr;
	}

}
