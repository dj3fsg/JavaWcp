package classmethod;

import classmethod.human.Human04;

public class ClassMethod04 {
	public static void main(String [] args) {
		//Human04インスタンスの生成後、コンストラクタ内の処理が実施
		Human04 yamada = new Human04("山田");
		
		//静的メンバはインスタンス生成なしで使用できる
		Human04.staticMethodPrint();
		
		//staticなクラス定数もインスタンスを使用せずに参照
		System.out.println(Human04.GREETING);
		
		//インスタンスメンバは直接使用できない
		//Human04.instanceMethodPrint();
		// System.out.println(Human04.name);

		// インスタンスメンバーはインスタンス生成してから使用する
		yamada.instanceMethodPrint();
		
	}

}
