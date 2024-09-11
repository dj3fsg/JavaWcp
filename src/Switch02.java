
public class Switch02 {
	//ここではChapter08の内容を列挙型を用いる
	//列挙型
	enum Vals{
		EXCELLENT,
		GOOD,
		POOR
	};
	public static void main(String [] args) {
		Vals val = Vals.POOR;
		switch (val) {
		case EXCELLENT:
			System.out.println("よくできました！");
			break;
		case GOOD:
			System.out.println("ふつうでした！");
			break;
		default:
			System.out.println("がんばろう！");
		}
	}

}
