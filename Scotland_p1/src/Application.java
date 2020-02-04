import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		Scanner inputScr = new Scanner(System.in);
		while(true)
		{
		 System.out.print("would you like to encrypt(E) or decrypt(D) or Exit(X) ?");
		 char inputChar = inputScr.next().charAt(0);
		 	if (Character.isLetter(inputChar))
		 	{
		 		String inputStr = Character.toString(inputChar);
		 		inputStr = inputStr.toUpperCase();
		 		switch (inputStr) {
		 		case "E":
		 		System.out.println("---Encrypt---");
		 		System.out.println("Please enter 4 numbers 0 - 9 to encrypt");
		 		String inpnum = inputScr.next();
		 		String inpStr = String.valueOf(inpnum);
		 		Encrypter Encrypterresult = new Encrypter();
		 		String encryptvar = Encrypterresult.EncryptThis(inpStr);
		 		System.out.println("encrypted results " + encryptvar );
		 		break;
		 		case "D":
		 		System.out.println("---Decrypt---");
		 		System.out.println("Please enter 4 numbers 0 - 9 to encrypt");
		 		String inpnum2 = inputScr.next();
		 		String inpStr2 = String.valueOf(inpnum2);
		 		Decrypter Decrypterresult = new Decrypter();
		 		String decryptvar = Decrypterresult.DecryptThis(inpStr2);
		 		System.out.println("Decrypted results " + decryptvar );
		 		
		 		break;
		 		case "X":
		 		System.exit(0);
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		}
		 	}
	}

}
}