public class Details {
    public String name = "Santhosh";
    int Age = 25;
    int Weight = 80;
    double Height = 5.7;
    Long MobileNo = 6303986808L;
    public static void main(String[] args){
        System.out.println("Details");
        Details details = new Details();
        System.out.println("Name: " +details.name);
        System.out.println("Age: " +details.Age);
        System.out.println("Weight: " +details.Weight);
        System.out.println("Height: " +details.Height);
        System.out.println("Mobile No: " +details.MobileNo);

    }
}
