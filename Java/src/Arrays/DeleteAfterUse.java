package Arrays;

public class DeleteAfterUse {
	long monthly = 2000;
	long total = 0;
	long TotalInvestMent = 0;

	public static void main(String[] args) {
		DeleteAfterUse a = new DeleteAfterUse();
		a.Test();
	}

	private void Test() {
		for (int i = 0; i < 10; i++) {
			total = total + monthly * 12;

			// total yearly investment
			long Myinvest = monthly * 12;
			TotalInvestMent = TotalInvestMent + Myinvest;
			System.out.print("Monthly = " + monthly);

			// increasing for next Month
			long sum = (monthly / 100) * 15;
			monthly = (monthly + sum);

			// interest
			long interest = (total / 100) * 8;
			total = total + interest;

			// Total With Intrest
			long WithInt = total + interest;
			System.out.println(" My Yearly invest = " + Myinvest + " Interst = " + interest + " Yearly With Intrest = "
					+ total + " , " + " With Intrest " + WithInt);
		}

		System.out.println("Total InvestMent = " + TotalInvestMent);
	}
}
