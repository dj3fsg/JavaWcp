
public class Chapter09_Ex1 {
	public static void main (String [] args) {
		//二重for
		for (int i = 1 ; i<= 9; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				//j=9までは改行無し
				//空白途中
				System.out.print(i + "*" + j + "="+ i*j +" ");
				
				//j=9で改行
				if(j == 9) {
					System.out.println("");
					}
			}
		}
	}

}
