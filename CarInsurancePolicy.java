public class CarInsurancePolicy
{
    // Instance variables(data fields) for this class
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    // Various overloaded constructor methods for this class
    public CarInsurancePolicy(int num, int payments, String city) 
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }

    public CarInsurancePolicy(int num, int payments)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = "Night-City";
    }

    public CarInsurancePolicy(int num)
    {
        policyNumber = num;
        numPayments = 6;
        residentCity = "Night-City";
    }

    // accessor method to show all policy details
    public void display() 
    {
        System.out.println("Policy #" + policyNumber + "." + numPayments + "payments annually. Driver resides in" + residentCity + ".");
    }
}