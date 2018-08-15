package biNumbers;

import java.math.BigDecimal;

public class SimpleInterestCalculation {
	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalculation(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);

	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// Formular for TotalValue = principal + principal * interest * noOfYears
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));

		return totalValue;
	}

}
