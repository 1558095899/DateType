package Runtime;

import java.io.IOException;

public class RuntimeClass {

	public static void main(String[] args) throws IOException {
		Runtime r=Runtime.getRuntime();
		r.exec("notepad");

	}

}
