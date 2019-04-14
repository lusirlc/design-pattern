package interpreter;

/**
 * 表达式类
 * Created By Lu Chuan On 2019/4/13
 */
public abstract class Expression {
	// 解释器
	public String interpret(PlayContext context) {
		String text = context.getText();
		if (text.length() != 0) {
			String playKey = text.substring(0, 1);
			text = context.getText().substring(2);
			String playValue = null;
			int index = text.indexOf(" ");
			if (index == -1) {
				playValue = text;
				context.setText("");
			} else {
				playValue = text.substring(0, text.indexOf(" "));
				context.setText(text.substring(text.indexOf(" ") + 1));
			}
			return execute(playKey,playValue);
		}
		return null;
	}
	
	public abstract String execute(String key, String value);
}
