package experiments.boofcv.autocode;

import java.io.IOException;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

/**
 * @author Marius Orfgen
 */
public class MinTest {

	public static void main(String[] args) {
		try {
			STGroup stGroup = new STGroupFile("templates/boofcv.stg");
			String str = StringTemplateHelper.readFileAsString("templates/min.st");
			
			ST st = new ST(stGroup, str);
			
			String out = st.render();
			StringTemplateHelper.writeStringToFile(out, "generated/ImageStatistics.java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
