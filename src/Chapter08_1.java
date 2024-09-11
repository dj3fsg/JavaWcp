
public class Chapter08_1 {
	public static void main (String [] args) {
		int dist = 999;
		
		
		//距離が5以下の場合は "とても近いです" を出力する				
		if (dist <= 5) {
			System.out.println("とても近いです。");
			
		//距離が5より大きく10以下の場合は "近いです" を出力する
		}else if (dist > 5 && dist <= 10) {
			System.out.println("近いです。");
			
		//距離が10より大きく15以下の場合は "遠いです" を出力する
		}else if (dist > 10 && dist <= 15) {
			System.out.println("遠いです。");
			
		//距離が15より大きい場合は "とても遠いです" を出力する
		}else {
			System.out.println("とても遠いです。");
		}
	}

}
