package maventest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaMain {

	private static Logger Logger = LoggerFactory.getLogger(JavaMain.class);
	public static void main(String[] args) {
		
		Logger.info("Je me connecte");

		Token georgeTransformer = new Token();
		String text = "Mon nom est {name}, j'habite aux {address}, vous pouvez m'appelez a ce numero {phone} ou directement mon entreprise {company}";
		System.out.println(text);
		georgeTransformer.addToken("{name}", "George");
		georgeTransformer.addToken("{address}", "78, rue de la vie");
		georgeTransformer.addToken("{phone}", "06 66 58 47 78");
		georgeTransformer.addToken("{company}", "Amazon");
		georgeTransformer.removeToken("{company}");
		text = georgeTransformer.transform(text);
		
		
		
		System.out.println(text);

	}

}
