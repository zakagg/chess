import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;







import java.net.*; 
import java.io.*; 
  
public class WaitMessage extends Thread 
{ 
	 public WaitMessage(Client c) {
		 this.c=c;
	}
	 static int port=8888;
	 Client c;
    //initialize socket and input stream 
        public void  run()  
    { 
        	 ServerSocket server = null;
			try {
				server = new ServerSocket(8888);
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
        	while(true)
    	{
        	Socket connection = null;
			try {
				connection = server.accept( );
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
        	ThreadWaitNewMsg thrnwmsg=new ThreadWaitNewMsg(connection,c);
        	thrnwmsg.start();
    	}
    } 
} 

