import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// 관계를 이해하라. PDT VS UDDT 비교
		// 예제) 정수 1개를 저장하기 위한 변수를 선언하시오.
		
		int a;            // 이게 변수를 선언한 것
		a=10;      // 변수 a에 10이라는 정수를 넣는다.
		
		// 그럼 이런것은? 책 1권을 저장하기 위한 변수를 선언하시오.
		Book b;    // 변수 b에 Book(객체)을 넣는다? No. 객체를 넣을 수 없다. 그래서 b가 Book의 메모리 번지수를 가르키게 한다. 
		
		b=new Book();   // ()는 생성자 함수
		
		// b(Book)에 데이터를 넣는다. 
		b.title="자바책";
		b.price=15000;
		b.company="한빛미디어";
		b.page=700;
		
		System.out.print(b.title + "\t");  // 공백 tab (띄움)
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page);
		
		// 전부 b라는 통해서 작업을 했기때문에 책 한권이라 할 수 있다.
		
		
		// Book이라는 자료형은 필요해서 만든 사용자정의 자료형이다.
		// 이를 사용하려면 class 파일로 만들어야 한다. 즉, class는 새로운 자료형을 만드는 도구. 모델링 도구.
		// 사용자정의자료형(UDDT) = 객체자료형
		// 문자열 String 은 자바에서 이미 만들어서 제공하는 것이라 따로 만들 필요가 없다.
		
		// 메모리에 번지수를 만든다(실체) 이것을 객체를 생성한다고 한다.
		// 그리고 이 실체를 인스턴스(Instance)라고 한다.
		// b를 인스턴스를 가르키는 인스턴스 변수 또는 객체를 가르키는 객체 변수라 한다. (객체를 저장하고 있는 변수)
		// b를 객체라고 보면 된다.
		
		// VO나 DTO를 만든다.(class)
		PersonVO p;     // p라는 변수에 PersonVO를 가르킨다(객체를 담는다)
		p=new PersonVO();    // 객체 생성
		
		// class를 만들고 사용하는 가장 기본적인 방법
		p.name="서범진";
		p.age=37;
		p.weight=74.5f;
		p.height=180.0f;
		
		System.out.print(p.name + "\t");
		System.out.print(p.age + "\t");
		System.out.print(p.weight + "\t");
		System.out.println(p.height + "\t");
		
		
		// p의 실체는 name, age, w, h 로 메모리에 저장되어 있지만 배열은 아니다. 새로운 구조로 본다. (PersonVO에 메모리 공간에는 문자열, 정수형, 실수형이 담겨야 하기 때문)
		// 배열은 기억공간에(메모리) 데이터가 동일한 데이터만 넣어야 한다. 배열로는 객체를 표현하기가 어렵다.
		// 그래서 우리는 이러한 구조를 직접 설계를 해서 만들어 사용하는 구조가 되는 것이다.
		

	}

}
