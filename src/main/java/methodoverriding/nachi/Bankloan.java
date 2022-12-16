package methodoverriding.nachi;

 class Bankloan extends Loan {
	 @Override
	 public void homeloan() {
		    super.homeloan();
			int interest=5;
			String bankname="ICICI";
			System.out.println(interest+" "+bankname);
		}
	 @Override
	 public void croploan()
	 {    
		 super.croploan();
		 float interest=8.8f;
			String bankname="HDFC and SBI";
			System.out.println(interest+" "+bankname);
	 }
}
