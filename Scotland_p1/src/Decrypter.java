
public class Decrypter {

	Decrypter () 
	{
		
	}
	String DecryptThis (String encryptNum)
	{
		int intNumout;
    	int oneNum;
    	String encryptout = "";
    	String encryptret = "";
    	String encryptStr = encryptNum; 
    	
    	for(int i = 0; i < encryptStr.length(); i++) 
    	{
    		oneNum = Character.digit(encryptStr.charAt(i), 10);
    		oneNum += 10;
    		intNumout = ((oneNum - 7) % 10 );
    		encryptout += intNumout;
    	}	    	
    	
    	encryptret = Character.toString(encryptout.charAt(2));
    	encryptret += Character.toString(encryptout.charAt(3));
    	encryptret += Character.toString(encryptout.charAt(0));
    	encryptret += Character.toString(encryptout.charAt(1));	    	
    	
    	return encryptret;
	
	}

}
