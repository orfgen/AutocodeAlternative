package experiments.boofcv.autocode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * TODO I am positive that this is not the right way to load the template.
 * @author Marius Orfgen
 *
 */
public class StringTemplateHelper {

	public static String readFileAsString(String filePath) throws IOException {
		return readFileAsString(new File(filePath));
	}

	public static String readFileAsString(File file) throws IOException {
		byte[] bytes = Files.readAllBytes(file.toPath());
		return new String(bytes);
	}

	public static void writeStringToFile(String str, String filePath) throws IOException {
		writeStringToFile(str, new File(filePath));
	}

	private static void writeStringToFile(String str, File file) throws IOException {
		Files.write(file.toPath(), str.getBytes());
	}

}
