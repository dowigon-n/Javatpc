
public class TPC05 {

	public static void main(String[] args) {


		// ���� ���� �迭
//		int[][] a;
//		a = new int[3][];
//		
//		a[0] = new int[3];
//		a[1] = new int[4];
//		a[2] = new int[5];
//		
//		System.out.println(a[0].length);
//		System.out.println(a[1].length);
//		System.out.println(a[2].length);
		
		int[] b = new int[3];
		b[0]=10;
		b[1]=20;
		b[2]=30;
				
		int sum=0;
		for(int i=0; i<b.length; i++) {
			sum += b[i];
			
		}		
		System.out.println(sum);
		
		// 9���� ������ ������ ������. -> 2���� ����
		int[][] c = new int[3][3];
		c[0][0]=1;
		c[0][1]=2;
		c[0][2]=3;
		
		c[1][0]=1;
		c[1][1]=2;
		c[1][2]=3;
		
		c[2][0]=1;
		c[2][1]=2;
		c[2][2]=3;
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	
		// �������� �迭
		int[][] star = new int[5][];
		star[0] = new int[1];
		star[1] = new int[2];
		star[2] = new int[3];
		star[3] = new int[4];
		star[4] = new int[5];
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				star[i][j]='*';
	 			System.out.print((char)star[i][j]);
			}
			System.out.println();
		}
	}
}







