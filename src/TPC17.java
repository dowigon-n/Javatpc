import kr.tpc.MovieVO;

public class TPC17 {
	public static void main(String[] args) {

		// 1���� �迭 3���� ������� �����
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
		
		
		// ��ȭ������(����, ����, ���ΰ�, ���, �ð�)
		
		MovieVO m=new MovieVO("�쿵��", 15000, "�쿵��", 12, 1.3f);
		m.setTitle("������");
		m.setPrice(15000);
		m.setAuthor("����");
		
		System.out.println(m.toString());
		
		// ��ȭ 3���� ���� => ��ü�迭�� �����.
		
		MovieVO[] mArr=new MovieVO[3];
		
		mArr[0]=new MovieVO("��Ʈ", 13000, "���켺", 15, 1.5f);
		mArr[1]=new MovieVO("ĳ������� ����", 15000, "���ϵ�", 18, 23.5f);
		mArr[2]=new MovieVO("��ȭ", 10000, "���ΰ�", 11, 12.9f);
		
//		System.out.println(mArr[0]);
//		System.out.println(mArr[1]);
//		System.out.println(mArr[2]);

		for(int i=0; i<mArr.length; i++) {
			System.out.println(mArr[i]);
		}
		
		

	}

}
