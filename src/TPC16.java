import kr.tpc.Overload;

public class TPC16 {
	public static void main(String[] args) {

		// 1+1=?, 23.4+56=?, 56.7+78.9=? 
		
		Overload ov=new Overload();
		
		ov.hap(20, 50);  // ov.hap_int_int(20, 50) ȣ��
		ov.hap(23.4f, 56);  // ov.hap_float_int(23.4f, 56) ȣ��
		ov.hap(56.7f, 78.9f);  // ov.hap_float_float(56.7f, 78.9f) ȣ��
		// �̰��� ���� ���ε��̶�� �Ѵ�.
		// ������ ������ ȣ��� �޼��尡 �� ������ �ȴ�.
		
	}

}
