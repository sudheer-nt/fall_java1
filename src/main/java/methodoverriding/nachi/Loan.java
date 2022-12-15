package methodoverriding.nachi;

 class Loan { 
	 
	protected void homeloan() {
		int interest=8;
		String bankname="SBI";
		System.out.println(interest+ " "+bankname);
	}
	protected void croploan() {
		float interest=2.5f;
		String bankname="HDFC";
		System.out.println(interest+" "+bankname);
	}
}
