import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Decrypt {
	private final static String dir = System.getProperty("user.dir");

	public static void main(String[] args) {
		String fileData = "";
		String input = dir + "\\bomb.kgb";
		String output = dir + "\\output.txt";
		String error = dir + "\\decryption_error.txt";
		RSA key = new RSA();
		BigInteger decryptedMessage, message;
		FileReader reader;
		FileOutputStream stream, errorStream;
		String bangReplacement, tempString, decryptedString, errorString;

		try {
			reader = new FileReader(input);
			int i;
			while ((i = reader.read()) != -1)
				fileData += (char) i;
			
			fileData = fileData.replaceAll("\\r", "");			
			bangReplacement = fileData.replaceAll("\\n", "!");
			StringTokenizer token = new StringTokenizer(bangReplacement, "!");

			tempString = bangReplacement;
			stream = new FileOutputStream(output);

			while (token.hasMoreTokens()) {
				tempString = token.nextToken();

				message = new BigInteger(tempString);
				decryptedMessage = key.decrypt(message);
				
				decryptedString = RSA.bigIntToString(decryptedMessage);

				String temp;
				for (i = 0; i < decryptedString.length(); i++) {
					temp = decryptedString.substring(i, i + 1);
					if (temp.equals("\n"))
						stream.write(System.getProperty("line.separator").getBytes());
					else
						stream.write(temp.getBytes());
				}
			}

			stream.close();
		} catch (FileNotFoundException e0) {
			try {
				errorStream = new FileOutputStream(error);

				errorString = "ERROR: input not found.";
				errorString += "Please ensure that there is a file named \"input.txt\" to encrypt.";
				errorString += "You may delete this file.";

				errorStream.write(errorString.getBytes());
				errorStream.close();
			} catch (Exception e) {
				System.out.println("You done goofed");
			}
			System.exit(0);
		} catch (IOException e1) {
			try {
				errorStream = new FileOutputStream(error);

				errorString = "ERROR: I/O Exception detected.";
				errorString += "You may delete this file.";

				errorStream.write(errorString.getBytes());
				errorStream.close();
			} catch (Exception e) {
				System.out.println("You done goofed");
			}
			System.exit(0);
		} catch (NumberFormatException e2) {
			try {
				errorStream = new FileOutputStream(error);

				errorString = "ERROR: Number Format Exception detected.";
				errorString += "You may delete this file.";

				errorStream.write(errorString.getBytes());
				errorStream.close();
			} catch (Exception e) {
				System.out.println("You done goofed");
			}
			System.exit(0);
		}
	}
}