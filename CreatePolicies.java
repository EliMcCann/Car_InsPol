public class CreatePolicies 
{
    public static void main(String[] args)
    {
        // Variables and constants
        CarInsurancePolicy first = new CarInsurancePolicy(213);
        CarInsurancePolicy second = new CarInsurancePolicy(1124, 34);
        CarInsurancePolicy third = new CarInsurancePolicy(3241, 64, "Atluscore");

        // Output phase
        first.display();
        second.display();
        third.display();
    }
}