
import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.myUtil;

public class TPC18 {
	public static void main(String[] args) {

		// 1. Java에서 제공해주는 class들... -> API
		// 문자열(String) : String은 디폴트 패키지에 존재하므로 생략해도 된다.
		// 기본 개념에 의하면 java.lang.String str=new java.lang.String(); 으로 객체를 생성해야 하지만 생략할 수 있다는 의미이다.
		
		String str=new String("APPLE");
		
		System.out.println(str.toString());
		System.out.println(str.toLowerCase());  // 대문자를 소문자로 출력
		
		
		// 2. 직접 만들어서 사용하는 class들... => DTO/VO, DAO, Utility(Helper Object) => API
		
		myUtil my=new myUtil();
		int sum=my.hap();
		System.out.println(sum);
		
		
		// 3. 다른 회사에서 만들어 놓은 class들.. => API
		// Gson -> json : MvcRepository에서 gson-2.8.5.jar 라이브러리 파일을 다운받고 설정한다.
		// 프로젝트 우클릭>Build Path>configure Build Path>Classpath>Add External jar... 에 jar 파일을 추가한다. 
		
		
		Gson gson=new Gson();
		BookVO vo=new BookVO("자바", 13000, "영진", 600);
		
		String json=gson.toJson(vo);
		System.out.println(json);
		
		// JSON은 객체를 문자열로 포맷해주는 데이터 구조. key : value
		
	}

}
