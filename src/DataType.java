
public class DataType {
	public static void main(String [] args) {
		char char4 = 0x3042;
		//long最後何もなしはコンパイルエラー
		//long WorldPopulation=8119000000;
		long WorldPopulation=8119000000L;
		System.out.println("世界の人口は" + WorldPopulation + "人");
		
		//short,byteは明示的な記述は不要
		short short1 = 4096;
		byte byte1 =64;
		
		double double1 = 1234567.89;
		double double2 = 1234567.89d;  // 明示的にすることも可能
		//float float1 = 0.123;          // コンパイルエラー
		float float2 = 0.123f;
		System.out.println(char4);
		
		//浮動小数点は以下の通り誤差が生じることがあるので、
		//注意する
		System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
	}
}
