package createFiles;

import java.io.File;
import java.util.ArrayList;

public class Importer {
	public void importFiles(String filePath,String writePath) {

		Parser parser = new Parser();
		File[] files = new File(filePath).listFiles();
		parseFiles(files, parser,writePath);

	}

	public void parseFiles(File[] files, Parser parser,String writePath) {
		for (File file : files) {
			if (file.isDirectory()) { // ist file ein directory wird dessen inhalt untersucht
				System.out.println("Dir: " + file.getName());
				parseFiles(file.listFiles(), parser,writePath);
			} else {
				if (file.getName().endsWith(".xml")) { // info zu xml files ausgeben und parsen
					System.out.println("File: " + file.getName());
					System.out.println("File Size: " + file.length() + "\n");
					parser.parse(file,writePath);
				}
			}
		}
	}

}
