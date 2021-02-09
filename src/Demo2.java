
import javax.script.ScriptEngineManager;

public class Demo2 {
	public static void main(String[] args) {
		ScriptEngineManager manager = new ScriptEngineManager();
		System.out.println(manager.getEngineByName("console.log(navigator.appVersion)").toString());

	}

}
