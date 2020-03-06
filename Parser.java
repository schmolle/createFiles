package createFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Parser {
		
		public void parse(File file, String writePath) {
			try{
			NYTCorpusDocumentParser parser = new NYTCorpusDocumentParser();
			NYTCorpusDocument nytDocument = new NYTCorpusDocument();
			nytDocument = parser.parseNYTCorpusDocumentFromFile(file, false);
			String content =  nytDocument.getBody();
			File writeFile=new File(writePath);
			FileWriter fr = new FileWriter(writeFile,true);
			if(content !=null){
			fr.write(content);
			}
			fr.close();
				}
			catch(IOException e){}
			}

}

