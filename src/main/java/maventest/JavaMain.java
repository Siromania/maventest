package maventest;

public class JavaMain {

	public static void main(String[] args) {

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
