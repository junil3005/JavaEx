package ch6;

class ch6p17 {


public static void main(String args) {
	MyMath mm = new MyMath();
	long result = mm.max(5, 3);
	
	
	System.out.println("max(5L, 3L) = " + result);
	
}





class MyMath {
	// 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
	
	long max(long a , long b) {
		return a >b ? a :b;
	}
	
}
	
}

}