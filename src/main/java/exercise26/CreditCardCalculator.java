package exercise26;

public class CreditCardCalculator {

    public double numberOfMonths;
    public double monthlyPaymentAmount;

    public double calculateMonthsUntilPaidOff(double balance, double apr, double monthlyPayment){

        double dailyRate = (apr/100)/365;
        double innerBrackets = Math.pow(1+dailyRate,30);
        double bDividedbyP = balance/monthlyPayment;
        double upperLog = Math.log10(1+bDividedbyP*(1-(innerBrackets)));
        double lowerLog = Math.log10(1+dailyRate);

        return numberOfMonths = Math.ceil((-1.0/30) * (upperLog/lowerLog));

    }

}
