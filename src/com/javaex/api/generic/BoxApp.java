package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		//	IntegerBox를 만든다
		IntegerBox iBox = new IntegerBox();
//		iBox.setContent("문자열");
		
		// 어떤 객체든 담을 수 있는 박스를 설계
		ObjectBox intBox  = new ObjectBox();
		intBox.setContent(123);
		
		// 값을 꺼내와 봅시다
		Integer retVal = (Integer)intBox.getContent();
		System.out.println(retVal);
		
		ObjectBox strBox = new ObjectBox();
		strBox.setContent("Java");
		
		// 값을 꺼낸다
		String strVal = (String)strBox.getContent();
		System.out.println(strVal);
		
		//	GenericBox
		//	내부 데이터 타입을 외부에서 객체화 시점에서 결정한다
		GenericBox<String> genericStrBox = 
				new GenericBox<String>();	// 내부콘텐츠 String이다.
		genericStrBox.setContent("Generic Box");
//		genericStrBox.setContent(2024);		
//		->	컴파일 타임에서 내부데이터 타입을 체크 가능
		
		String objStr = genericStrBox.getContent();
		//	-> 캐스팅 불필요
		
		
	}	// 문자열이니까 스트링으로 변환인데 그걸 제네릭을 사용해서 불필요한 캐스팅을 덜어주고 내부데이터를 보호해준다.

}
