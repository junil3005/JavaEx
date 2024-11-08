package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		//	upcasing : 부모 타입으로 자식 인스턴스 참조
		Animal dog1 = new Dog("Snoopy");
		dog1.eat();
		dog1.walk();
//		dog1.bark();	// 참조 타입의 설계도에 있는 것만 사용
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		//	Downcastuing : 부모 타입으로 참조되던 타입을
//		//					원랴댜로 되도리는 것
//		((Dog)pet).bark();
	
		
		pet = new cat("Yaong");
		pet.eat();
		pet.walk();
		
//		캐스팅 해당 객체가 캐스팅 가능 객체인지 확인
		if (pet inseance Dog) {
			((Dog)pet).bark();
		} else if (pet instance )
//		((Dog)pet).bark();
		

	}

}
