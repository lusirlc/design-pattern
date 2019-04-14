package interpreter;

/**
 * 解释器模式：给定一种语言，定义它的文法的一种表示，并定义一个解释器
 * 这个解释器使用该表示来解释语言中的句子。
 * 通常当有一个语言需要解释执行，并且你可将该语言中的句子表示为一个抽象语法树时，可用解释器模式
 * Created By Lu Chuan On 2019/4/13
 */
public class Main {
	public static void main(String[] args) {
		PlayContext playContext = new PlayContext();
		Expression expression = null;
		playContext.setText("O 2 E 0.5 A 3 E 0.5 D 3 E 0.5 G 0.5 A 0.5");
		while (playContext.getText().length() > 0) {
			String str = playContext.getText().substring(0, 1);
			switch (str) {
				case "O":
					expression = new ScaleExpression();
					break;
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":
				case "A":
				case "B":
					expression = new NoteExpression();
					break;
				
			}
			System.out.print(expression.interpret(playContext));
		}
	}
}
