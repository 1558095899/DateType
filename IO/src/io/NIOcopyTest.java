//新io的copy方法
package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOcopyTest{
	public static void main(String[] args) throws IOException, IOException {
		Files.copy(Paths.get("new.txt"), new FileOutputStream("copy.txt"));
		Files.copy(new FileInputStream("copy.txt"), Paths.get("o.txt"));
	}
}