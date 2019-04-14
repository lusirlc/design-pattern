package interpreter;

/**
 * 音阶类
 * Created By Lu Chuan On 2019/4/13
 */
public class ScaleExpression extends Expression {
	@Override
	public String execute(String key, String value) {
		switch (value) {
			case "1":
				return "低音";
			case "2":
				return "中音";
			case "3":
				return "高音";
		}
		return null;
	}
	
	
}
