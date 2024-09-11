
public class Chapter09_Ex2 {
	 public static void main(String[] args) {
	        int a = 976;
	        int b = 2;
	        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
	    }

	    // ユークリッドの互除法で最大公約数を計算するメソッド
	    static int gcd(int a, int b) {
	        int mod = 0;//余りを出す
	        
	        
	        //余りが0でない場合は繰り返す
	        while(a % b > 0) {
	        	//大きな数を小さな数で割って余りを出す
		        mod = a % b;
		        
		        //変数を以下の通りに代入
		        //大きな数←小さな数
		        a = b;
		        
		        //小さな数←余り
		        b = mod;
		        
		        //このメソッドを再帰的に呼び出す
		        gcd(a, b);
	        }
	        
	        return b;
	    	
	    }
}
