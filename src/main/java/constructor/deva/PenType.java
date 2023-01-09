package constructor.deva;

public class PenType {
	public static void main(String[] args) {
		
		Pen ruth = new Pen();
		
		System.out.println(ruth.Pennum);
		System.out.println(ruth.Pencolor);
		System.out.println(ruth.Penname);
		
		Pen dev = new Pen(2, "red" , "technotip");
		System.out.println(dev.Pennum);
		System.out.println(dev.Pencolor);
		System.out.println(dev.Penname);
	}

}
