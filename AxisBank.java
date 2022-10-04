package week3day1;

public class AxisBank extends BankInfo{
	
	
	public void deposit() {
		System.out.println("Deposited 35000 today");

	}
	
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();
	
		
				
	}

}
