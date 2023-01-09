package constructor.deva;

public class Pen {
	int Pennum;
	String Pencolor;
	String Penname;
	
	public Pen() {
		// default constructor
		Pennum = 1;
		Pencolor = "blue";
		Penname = "Reynolds";
		System.out.println("PenType should be displayed");
	}
	
	
	public Pen(int Pennum, String Pencolor, String Penname) {
	this.Pennum = Pennum;
	this.Pencolor = Pencolor;
	this.Penname = Penname;
	
	
}

}
