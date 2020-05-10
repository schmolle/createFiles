package createFiles;

import java.io.File;
import java.util.ArrayList;

public class Importer {
	public void importFiles(String filePath,String writePath) {

		Parser parser = new Parser();
		File[] files = new File(filePath).listFiles();
		parseFiles(files, parser,writePath);

	}

	public void importFiles(File[] files, Parser parser,String writePath) {
		for (File file : files) {
			if (file.isDirectory()) { // ist file ein directory wird dessen inhalt untersucht
				parseFiles(file.listFiles(), parser,writePath);
			} else {
				if (file.getName().endsWith(".xml")) { // ist file xml weiter zu parser
					parser.parse(file,writePath);
				}
			}
		}
	}

}
