
import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.myUtil;

public class TPC18 {
	public static void main(String[] args) {

		// 1. Java���� �������ִ� class��... -> API
		// ���ڿ�(String) : String�� ����Ʈ ��Ű���� �����ϹǷ� �����ص� �ȴ�.
		// �⺻ ���信 ���ϸ� java.lang.String str=new java.lang.String(); ���� ��ü�� �����ؾ� ������ ������ �� �ִٴ� �ǹ��̴�.
		
		String str=new String("APPLE");
		
		System.out.println(str.toString());
		System.out.println(str.toLowerCase());  // �빮�ڸ� �ҹ��ڷ� ���
		
		
		// 2. ���� ���� ����ϴ� class��... => DTO/VO, DAO, Utility(Helper Object) => API
		
		myUtil my=new myUtil();
		int sum=my.hap();
		System.out.println(sum);
		
		
		// 3. �ٸ� ȸ�翡�� ����� ���� class��.. => API
		// Gson -> json : MvcRepository���� gson-2.8.5.jar ���̺귯�� ������ �ٿ�ް� �����Ѵ�.
		// ������Ʈ ��Ŭ��>Build Path>configure Build Path>Classpath>Add External jar... �� jar ������ �߰��Ѵ�. 
		
		
		Gson gson=new Gson();
		BookVO vo=new BookVO("�ڹ�", 13000, "����", 600);
		
		String json=gson.toJson(vo);
		System.out.println(json);
		
		// JSON�� ��ü�� ���ڿ��� �������ִ� ������ ����. key : value
		
	}

}
