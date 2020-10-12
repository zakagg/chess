import java.io.Serializable;

public class Annance implements Serializable {
	

    private String id;
	private String domaine;
	private String prix;
	private String descriptif;
	private String ip;
	private String port;
	private int referance;
	private String publicKey1;
	
	
	public Annance(String id,String domaine,String prix,String descriptif,String ip,String port,String publicKey1)
	{
		this.id=id;
		this.prix=prix;
		this.domaine=domaine;
		this.descriptif=descriptif;
		this.ip=ip;
		this.port=port;
		this.publicKey1=publicKey1;
	}
	public synchronized int set_referance (int a)
	{
		return referance=a;
	}
	public String get_referance()
	{
		return referance+"";
	}
	
	public void set_Anannce(String id,String domaine,String prix,String descriptif,String ip,String port)
	{
		this.prix=id;
		this.prix=prix;
		this.domaine=domaine;
		this.descriptif=descriptif;
		this.ip=ip;
		this.port=port;
	}
	
	public String get_publicKey1_Anannce()
	{
		return this.publicKey1;
	}
	public String get_id_Anannce()
	{
		return this.id;
	}
	
	public String get_domaine_Anannce()
	{
		return this.domaine;
	}
	public String get_prix_Anannce()
	{
		return this.prix;
	} 
	
	public String get_descriptif()
	{
		return this.descriptif;
	}
	
	public String get_ip()
	{
		return this.ip;
	}
	
	public String get_port()
	{
		return this.port;
	}
	
	public String toString()
	{
		return "ref "+referance+ " id "+ this.id+ "  "+ "prix "+ this.prix+ "  "+ "domaine " +this.domaine+"  "+"descriptif "+this.descriptif;
	}	

}
