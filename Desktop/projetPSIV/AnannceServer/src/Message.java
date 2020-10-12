import java.io.Serializable;

public class Message  implements Serializable 
{
	private  static  final  long serialVersionUID =  1350092881346723536L;
	private String id;
	private String msg;
	private String ref;
	private String id_user_msg;
	
	public synchronized void set_ref(String ref)
	{
		 this.ref=ref;
	}
	
	public Message (String id,String msg,String ref)
	
	{
		this.id=id;
		this.msg=msg;
		this.ref=ref;
		
	}
		
	public String get_ref()
	{
		return this.ref;
	}
	
	public String get_id()
	{
		return this.id;
	}
	
	public String tostring()
	{
		return "ref "+ref  +" id "+id+" a envoyer "+ "  msg "+msg;
	}
	public String get_id_user_msg()
	{
		return this.id_user_msg;
	}	
}
