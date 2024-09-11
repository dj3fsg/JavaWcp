package practice;

public class Task {
	// メンバー変数
		// 日付
		private int date; // インスタンス変数
		// タスク内容
		private String content;  // インスタンス変数
		// 状態（trueで完了）
		private boolean done;  // インスタンス変数

		// コンストラクタを作成
		Task(int date,String content){
			this.date = date;
			this.content =content;
			this.done =false;
		}

		// doneメソッド
		// 状態を完了にする
		public void done(){
			System.out.println("タスク「" + content + "」を完了します。");
			done = true;
		}
		

		// printメソッド
		// タスク内容を表示する
		public void print() {
			//完了・未完了共通部分
			System.out.print(date + "のタスク「" +content + "」は");
			
			//完了・未完了
			if (done == true) {
				System.out.println("完了しています。");
			}else {
				System.out.println("未完了です。");
			}
		}

}
