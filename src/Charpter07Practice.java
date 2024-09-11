
public class Charpter07Practice {
	public static void main(String [] args ) {
		int a = 9;
		int b = 4;
		System.out.println(a%b);
		
		//前置と後置
		
		int a2 = 0;
		int c2 = 0;
		
		System.out.println("前置と後置の違いに注意すること");
		//前置
		a2=5;
		// a をインクリメントした後に、a が c に代入される
		c2 = ++a2;
		

		System.out.println(c2);
		
		//後置
		a2=5;
		// a を c に代入した後に、a がインクリメントされる
		c2 = a2++;
		System.out.println(c2);
		
		//代入演算子
		int d = 100;
		
		System.out.println(d += 5); //これは d = d + 5と同じ動作
		System.out.println(d -= 3);
		System.out.println(d *= 4);
		System.out.println(d /= 2);
		System.out.println(d %= 7);
		
		//比較演算子
		int a3 = 5;
		boolean c3;
		
		System.out.println(c3 = a3 != 5);
		
		//文字列の比較で==の使用は非推奨
		String mojiretsu1 = "onaji";
		String mojiretsu2 = new String("onaji");
		System.out.println( mojiretsu1 == mojiretsu2);
		
		
		
	}
}
