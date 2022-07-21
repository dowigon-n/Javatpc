import kr.tpc.MovieVO;

public class TPC17 {
	public static void main(String[] args) {

		// 1차원 배열 3가지 방식으로 만들기
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int[] b= {10, 20, 30, 40, 50};
		
		int[] c=new int[] {10, 20, 30, 40, 50};
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		// 영화데이터(제목, 가격, 주인공, 등급, 시간)
		
		MovieVO m=new MovieVO("우영우", 15000, "우영우", 12, 1.3f);
		m.setTitle("프렌즈");
		m.setPrice(15000);
		m.setAuthor("몰라");
		
		System.out.println(m.toString());
		
		// 영화 3편을 저장 => 객체배열로 만든다.
		
		MovieVO[] mArr=new MovieVO[3];
		
		mArr[0]=new MovieVO("비트", 13000, "정우성", 15, 1.5f);
		mArr[1]=new MovieVO("캐리비안의 해적", 15000, "조니뎁", 18, 23.5f);
		mArr[2]=new MovieVO("영화", 10000, "주인공", 11, 12.9f);
		
//		System.out.println(mArr[0]);
//		System.out.println(mArr[1]);
//		System.out.println(mArr[2]);

		for(int i=0; i<mArr.length; i++) {
			System.out.println(mArr[i]);
		}
		
		

	}

}
