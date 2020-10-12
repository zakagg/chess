import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class ThreadWaitNewMsg extends Thread {

	Socket connection ;
	Client c;
	ThreadWaitNewMsg(Socket connection,Client c)
	{
		this.connection=connection;
		this.c=c;
	}
	
	public void  run() 
	{
		InputStream in = null;
		try {
			in = connection.getInputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	BufferedReader br = new BufferedReader(new InputStreamReader(in));
    	 String line = null;
    	 String decryptedString="";
		try {
			line = br.readLine();
			
			decryptedString = RSAUtil.decrypt(line, c.get_privateKey1());
			System.out.println("Vous avez envoyer "+decryptedString);
		} catch (IOException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException | NoSuchAlgorithmException | NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
