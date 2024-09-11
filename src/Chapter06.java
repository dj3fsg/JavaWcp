
public class Chapter06 {
	public static void main(String [] args) {
		//プリミティブ型の「long」の変数に値(10000000000)を代入して出力
		long long1 = 10000000000L;
		System.out.println(long1);
		
		//プリミティブ型の「double」の変数に値(3.14)を代入して出力
		double double1 = 3.14d;
		System.out.println(double1);
		
	    //プリミティブ型の「boolean」の変数(true)に値を代入して出力
		boolean boolean1 = true;
		System.out.println(boolean1);
		
		//ラッパークラスの「Integer」の変数に値(100)を代入して出力
		Integer int2 = 100;
		System.out.println(int2);
		
		//ラッパークラスの「Float」の変数に値(1.4142)を代入して出力
		Float float1 = 1.4142f;
		System.out.println(float1);
		
		
		//ラッパークラスの「Character」の変数に値('う')を代入して出力
		Character char1 = 'う';
		System.out.println(char1);
		
		//要素数が5の「int」配列に値({ 0, 10, 10, 30, 40 })を代入して、インデックス番号が3の値を出力
		int [] array1 = new int[] { 0, 10, 10, 30, 40 };
		System.out.println(array1[3]);
	}

}
