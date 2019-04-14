package interpreter;

/**
 * 音符类
 * Created By Lu Chuan On 2019/4/13
 */
public class NoteExpression extends Expression {
	
	@Override
	public String execute(String key, String value) {
		StringBuilder sb = new StringBuilder();
		
			switch (key) {
				case "C":
					sb.append(1);
					break;
				case "D":
					sb.append(2);
					break;
				case "E":
					sb.append(3);
					break;
				case "F":
					sb.append(4);
					break;
				case "G":
					sb.append(5);
					break;
				case "A":
					sb.append(6);
					break;
				case "B":
					sb.append(7);
					break;
			}
		
		return sb.toString();
		
	}
}
