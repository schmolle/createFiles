package createFiles;

public class CreateFiles {
		public static void main(String[] args) {
			Importer importer = new Importer();
			String filePath = "/var/local/data/nyt_corpus/data/";
			String writePath= "/home/jschmolzi/txtFiles/";
			for(int i=1987; i<=2007 ; i++) {
			importer.importFiles(filePath+i,writePath+i+".txt");
			}
		}
}
