import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiple  extends Thread  {
	 private Socket connection;
	 private BufferedReader in;
	 private PrintWriter out;
	 private Annance anance;
	 private Server serv;
	 private ObjectInputStream obj_in;
	 private ObjectOutputStream obj_out;
	
	
	public Multiple(Socket connection,Server serv)
	{
		 try{
		 this.connection=connection;
		 InputStream in=connection.getInputStream();
		 OutputStream out=connection.getOutputStream();
		 this.in = new BufferedReader(new InputStreamReader(in));
		 this.out = new PrintWriter(new OutputStreamWriter(out));
		 
		 this.serv=serv;
		 } catch (IOException ex) {
		 System.err.println(ex);
		 }
		 }
		 public void run() {
			
	        	try {
	        			out.write("donner votre User_name. \n");
						out.flush();
						String id=in.readLine();
						String publicKey1=in.readLine();
						System.out.println(publicKey1);
						boolean exist= serv.exist_id(id);
						String port=connection.getPort()+"";
						String ip= connection.getInetAddress()+"";

						
						while(true)
						{
						String ce_que_fais=in.readLine();
						System.out.println(ce_que_fais);
						if(ce_que_fais.contains("1"))
						{
						out.write("donner le domaine de l'annonce. \n");
						out.flush();
						String domaine=in.readLine();
						out.write("donner le prix \n");
						out.flush();
						String prix=in.readLine();
						out.write("donner le descrptif \n");
						out.flush();
						String descriptif=in.readLine();
						out.flush();
						//obj_in=new ObjectInputStream(connection.getInputStream()) ;
						//Annance a =(Annance) obj_in.readObject();
						//System.out.println("imed "+a.domaine+" "+a.description+" "+a.prix);
						Annance anance=new Annance(id,domaine,prix,descriptif,ip,port,publicKey1);
						System.out.println("1 ici  "+ id +"   " +domaine+"    "+prix+ "    "+descriptif);
						System.out.println("la chaine est    "+anance.get_domaine_Anannce());
						if(serv.l.size()==0)
						anance.set_referance(0);
						else
						anance.set_referance(Integer.parseInt(serv.l.get(serv.l.size()-1).get_referance())+1);
						serv.addListe(anance);
						serv.affiche_list();
						}
						if(ce_que_fais.contains("2"))
						{
							out.write("Si Vous voulez voir tout les element de liste appuyer sur 1 \n");
							out.write("Si Vous voulez Voir selon le domain apuyer sur2 \n");
							out.flush();
							String afficher=in.readLine();
							System.out.println("la val dr affiche "+ afficher);
							if(afficher.equals("1"))
							{
								out.write(serv.getListe().size()+"\n");
								out.flush();
								int i=0;
								for (i=0;i<serv.getListe().size();i++)
								{
									out.write(serv.l.get(i).toString()+"\n");
									out.flush();
								}
							}
							if(afficher.contains("2"))
							{
								out.write("donner le domaine de l'annonce. \n");
								out.flush();
								
								String domaine=in.readLine();
								System.out.println("je suis dans 2-2 "+ afficher);
								
								System.out.println("je suis la"+domaine);
								int k=0;
								for (int i=0;i<serv.getListe().size();i++)
								{
									if(serv.l.get(i).get_domaine_Anannce().equals(domaine))
										{
											k++;
										}
								}
								System.out.println("la val de k est "+ k);
								out.write(k+"\n");
								out.flush();
								
								for (int i=0;i<serv.getListe().size();i++)
								{
									if(serv.l.get(i).get_domaine_Anannce().equals(domaine))
										{
											out.write(serv.l.get(i).toString()+"\n");
											out.flush();
										}
								}
								
							}
						}
						if(ce_que_fais.contains("4")) 
						{
							out.write("Donner le id du user \n");
							out.flush();
							String id_user_msg=in.readLine();							
							String ip_port=serv.search_ip_user(id_user_msg).substring(1);
							System.out.println("l @ et port "+ (ip_port));
							String[] parts = ip_port.split(" ");
							System.out.println("j' envois a letulisateur   "+id_user_msg);
							out.write(parts[0]+"\n");
							out.flush();
							String publicKey_client=serv.search_public_key(id_user_msg);							
							System.out.println(publicKey_client);
							out.write(publicKey_client+"\n");
							out.flush();	
						}
						if(ce_que_fais.contains("5")) 
						{
							out.write("Donner la ref de l'annoce \n");
							
							
						}
				 }}
	        	catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	            try {
					out.flush();
					sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            try {
					connection.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	            try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		 
		 }
