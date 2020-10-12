import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	 	public static  List<Message> liste_msg=new ArrayList<>();
		public List<Annance> l = new ArrayList<>();
		public List<Annance> getListe()
		{
			return this.l;
		}
		
		
		public  synchronized void addListe(Annance annonce)
		{
			this.l.add(annonce);
		}
		
		public void affiche_list()
		{
			for(int i=0;i<this.l.size();i++)
			{
				System.out.println(this.l.get(i).toString());
			}
		}
		public boolean exist_id(String id)
		{
			for(int i=0;i<this.l.size();i++)
			{
				if (this.l.get(i).get_id_Anannce()==id)
				{
					return true;
				}
			}
			return false;
		}
		
		public String search_port_user(String id_user)
		{
			for (int i=0;i<this.l.size();i++)
			{
				if(this.l.get(i).get_id_Anannce().equals(id_user))
					{
						return this.l.get(i).get_port() ;
					}				
			}
			return null;
		}
		
		
		public String search_ip_user(String id_user)
		{
			for (int i=0;i<this.l.size();i++)
			{
				if(this.l.get(i).get_id_Anannce().equals(id_user))
					{
					
					return this.l.get(i).get_ip(); 
					}
				
			}
			
			return null;
		}
		
		public String search_public_key(String id_user)
		{
			for (int i=0;i<this.l.size();i++)
			{
				if(this.l.get(i).get_id_Anannce().equals(id_user))
					{
					
					return this.l.get(i).get_publicKey1_Anannce(); 
					}
				
			}
			
			return null;
		}
		
		
		
		
		public List<Annance> list_annance_domain_to_list_string(String domain)
		{
			List<Annance> resultat=new ArrayList<Annance>();
			for (int i=0;i<this.l.size();i++)
			{
				if(this.l.get(i).get_domaine_Anannce().equals(domain))
					{
						resultat.add(this.l.get(i));
					}
			}
			return resultat;
		}				
		static int x=0;
		public static void main(String[] args) throws IOException, InterruptedException {
	        ServerSocket server = new ServerSocket(2001);
	        Server serv=new Server();
	        while(true)
	        {
	            Socket connection = server.accept();    
	            Multiple mult=new Multiple(connection,serv);
	            mult.start();
	        }
	}
}