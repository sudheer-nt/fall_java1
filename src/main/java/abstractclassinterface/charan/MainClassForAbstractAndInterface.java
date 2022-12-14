package abstractclassinterface.charan;

//main method for all classes
public class MainClassForAbstractAndInterface {

	public static void main(String[] args) {
//created object for java classes
		CharanNormalClassToTakeAbstract objectreference1 = new CharanNormalClassToTakeAbstract();
		CharanNormalclassToTakeInterfacd objectreference2 = new CharanNormalclassToTakeInterfacd();
//calling methods with object reference
		objectreference1.charanMethodsInAbstract();
		objectreference1.sampleMethodInAbstract();
		objectreference2.charanInterfacemethod1();
		objectreference2.charanInterfacemethod2();
	}

}
