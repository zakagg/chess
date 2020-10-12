import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
public class Client extends Thread {
	private String publicKey1;
	private String privateKey1;	
	
	public Client (String publicKey1,String privateKey1)
	{
		this.publicKey1=publicKey1;
		this.privateKey1=privateKey1;
	}
	
	String get_publicKey1()
	{
		return publicKey1;
	}
	String get_privateKey1()
	{
		return privateKey1;
	}
	
	
	public void set_publicKey1_privateKey1()
	{
		
	}
	
	
	private static List<Message> list_msg=new ArrayList<>();
	public List<Message> get_list ()
	{
		return this.list_msg;
	}
	
	public List<String> list_msg_to_list_string()
	{
		List<String> resultat=new ArrayList<String>();
		for (int i=0;i<this.list_msg.size();i++)
		{
			resultat.add(this.list_msg.get(i).tostring());
		}
		return resultat;
	}
	
	public void delete_msg(int i)
	{		
			list_msg.remove(i);
	}	
	
	public static void affiche_list1(List<String> l)
	{
		if(l.size()==0)
		{
			System.out.println("pas d'element");
		}
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).toString());
		}
	}
	public static void affiche_list(List<Annance> l)
	{
		if(l.size()==0)
		{
			System.out.println("pas d'element");
		}
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).toString());
		}
	}
	public static void affiche_list_msg(List<Message> l)
	{
		if(l.size()==0)
		{
			System.out.println("pas d'element");
		}
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).tostring());
		}
	}
	
	public void run() 
	{
	    PrintWriter out = null;
        BufferedReader networkIn = null;
        ObjectInputStream obj_in;
   	 	ObjectOutputStream obj_out;
   	 	
        try {
            Socket theSocket = new Socket("localhost", 2001);
            System.out.println("Client: Connecté au serveur d'echo "+ theSocket);
            networkIn = new BufferedReader( new InputStreamReader(theSocket.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter (theSocket.getOutputStream()));
           // obj_in=new ObjectInputStream(theSocket.getInputStream()) ;
   		 	//obj_out=new ObjectOutputStream(theSocket.getOutputStream());   		 
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            	System.out.println(networkIn.readLine());
            	String id = myObj.nextLine();
            	out.write(id+"\n");
            	out.flush();
            	out.write(publicKey1+"\n");
            	out.flush();
            	ServerSocket s = new ServerSocket(0);
            	System.out.println("listening on port: " + s.getLocalPort());
            	String port   = s.getLocalPort()+"";
            	
            	System.out.println("la valeur de IP  "+ port);
            	
            	
            	while(true)
           	 	{
            	System.out.println("si vous voulez ajjouter anonce taper  1. \n");
                System.out.println(" voir  les anonce taper  2. \n");
                System.out.println("si vous voulez quiter taper 3. \n");
                System.out.println("si vous voulez envoyer un message taper 4. \n");
                System.out.println("si vous voulez supprimer une annance un message taper 5. \n");
                System.out.println("si vous voulez afficher la liste des message locale 6 \n");
                System.out.println("Vous voulez supprimer un messages appuyer sur 7  \n");
                System.out.println("Vous voulez stocker les message dans le serveur messages appuyer sur 8  \n");
                String ce_que_fais = myObj.nextLine();//  je choisis 1 ou 2 ou 3
            	out.write(ce_que_fais+"\n");
            	System.out.println(ce_que_fais);
            	out.flush();
                
                if(ce_que_fais.contains("1"))//ajjouter une annonce
                {
            	System.out.println(networkIn.readLine());
            	String domaine = myObj.nextLine();
            	out.write(domaine+"\n");
            	out.flush();
            	System.out.println(networkIn.readLine());
            	String prix = myObj.nextLine();
            	out.write(prix+"\n");
            	out.flush();
            	//ici l ajjout
            	System.out.println(networkIn.readLine());
            	String descriptif = myObj.nextLine();
            	out.write(descriptif+"\n");
            	out.flush();
            	System.out.println("je suis dans le 1");            	
                }
                if(ce_que_fais.contains("2"))
                {
                	System.out.println(networkIn.readLine());
                	System.out.println(networkIn.readLine());
                	String afficher = myObj.nextLine();
                	out.write(afficher+"\n");
                	out.flush();
                	if(afficher.contains("1"))
                	{
                		int i=0;
                		String number=networkIn.readLine();
                		int length=Integer.parseInt(number);
                		while(i<length)
                		{
                			System.out.println(networkIn.readLine());
                			i++;
                		}
                		
                	}
                	
                	if(afficher.contains("2"))
                	{
                		int i=0;
                		System.out.println(networkIn.readLine());
                		String domaine = myObj.nextLine();
                		System.out.println(domaine);
                    	out.write(domaine+"\n");
                    	out.flush();
                    	String k=(networkIn.readLine());;
                    	if( k=="0")
                    	System.out.println("pas d'element dans le dommaine ");
                    	
                    	int length=Integer.parseInt(k);;
                    	while(i<length)
                		{
                			System.out.println(networkIn.readLine());
                			i++;
                		}
                		
                	}                    	            	
                }
                if(ce_que_fais.contains("3"))
                {
                	break;
                }
                if(ce_que_fais.contains("4"))
                {
                	System.out.println(networkIn.readLine());
                	String id_user_msg = myObj.nextLine();
                	out.write(id_user_msg+"\n");
                	out.flush();
                	String adresse_ip=networkIn.readLine();
                	System.out.println("donner le MSG SVP");
                	String msg = myObj.nextLine();
                	msg=msg+" //FROM "+id;	
                	String publicKey_client=networkIn.readLine();
                	
                	msg = Base64.getEncoder().encodeToString(RSAUtil.encrypt(msg, publicKey_client));
                	Socket theSocket1 = new Socket(adresse_ip, 8888);
                	System.out.println("Client: Connecté au serveur d'echo "+ theSocket1);
                	PrintWriter out1 = new PrintWriter(theSocket1.getOutputStream());
                	out1.write(msg+"\n");
                	System.out.println("j'ai fini le travail");
                	out1.flush();
                	 }
				
        }}
        catch (IOException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | NoSuchAlgorithmException ex) {System.err.println(ex);
        } finally {
            try {
                if (networkIn != null) networkIn.close();
                if (out != null) out.close();
            } catch (IOException ex) {}
        }
   	 	}		
	
    public static void main(String[] args) throws ClassNotFoundException, NoSuchAlgorithmException, IOException
    {
    	
    	RSAUtil keyPairGenerator = new RSAUtil();
    	keyPairGenerator.writeToFile("RSA/publicKey", keyPairGenerator.getPublicKey().getEncoded());
        keyPairGenerator.writeToFile("RSA/privateKey", keyPairGenerator.getPrivateKey().getEncoded());
        String publicKey1=(Base64.getEncoder().encodeToString(keyPairGenerator.getPublicKey().getEncoded()));
        String privateKey1=(Base64.getEncoder().encodeToString(keyPairGenerator.getPrivateKey().getEncoded()));
    	
    	Client client=new Client(publicKey1,privateKey1);
    	client.start();
    	
    	WaitMessage wait=new WaitMessage(client);
    	wait.start();
    	
    }
    }
