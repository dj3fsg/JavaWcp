
public class Variable02 {
	//static final定数の宣言
	static final int MIN_NUMBER = 10;
	
	public static void main (String []args) {
		System.out.println(MIN_NUMBER);
		
	    //定数への代入は不可
		//MIN_NUMBER= 20;
		
		//final定数の設定
		final int maxValue;
		//値の設定は可能
		maxValue = 100;
		System.out.println (maxValue);
	
	}

}
