package methodoverriding.anvesh;

public class DisplayOverriding extends Family {
     public void kids()
     {
    	System.out.println("kids are playing"); 
     }
	public static void main(String[] args) {
		DisplayOverriding d=new DisplayOverriding();
		d.kids();
		d.parents();

	}

}
