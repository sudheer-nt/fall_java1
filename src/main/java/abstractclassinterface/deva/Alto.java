package abstractclassinterface.deva;

public class Alto extends SmallSegmentCar {
	
	String modelName ="ZXi";
	int noOfGears;
	public boolean acImplementation() {
		if(modelName.equals("ZXi")) {
			System.out.println("Implement AC");
			return true;
		} else {
			System.out.println("No AC");
			return false;
		}
	}
	
	public void windowRolling() {
		if(modelName.equals("ZXi")) {
			System.out.println("Implement window auto rolling");
		} else {
			System.out.println("Implement window manual rolling");
		}
	}
	

}
