public class TPC06 {
	public static void main(String[] args) {
		// 5. 핵심은 메서드 -> 동작(method), 기능(function) 
		
		int a=67;
		int b=98;
		// a+b=?

		int result = sum(a, b);   // 함수(메서드)를 호출
		System.out.println(result);
		
		int[] arr = makeArr();  // 10, 20, 30 넘어오는 데이터형이 int[] 이고 값을 담은 변수명이 arr이니까 int[] arr
		int hap=0;
		for(int i=0; i<arr.length; i++) {
			hap+=arr[i];
		}
		System.out.println(hap);
		
	}

	// static 메서드는 같은 static 메서드만 바로 호출할 수 있다. (추후 이것에 대해 설명한다고함)
	// 정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오.
	public static int sum(int a, int b) {    // 매개변수 전달기법 : a=67, b=98 값을 전달한다 해서 Call by Value 라고 부른다.
		int v = a + b;
		return v;
		
	}
	// 10, 20, 30 (3개)를 return 하고 싶다면?
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
