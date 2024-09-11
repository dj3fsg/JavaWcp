
public class Chapter08_3 {
	public static void main (String [] args) {
		int price = 600;//価格
		boolean isForhere = false;//店内で食べるか、外で食べるか
		
		//店内は消費税10%
		//持ち帰りは消費税8%
		if (isForhere == true){
			price *= 1.1;
		}else {
			price *= 1.08;
		}
		
		//価格表示
		System.out.println(price);
	}

}
