public class FooCorporation {

    public static void main(String[] args) {
        totalPay(7.50,35);
        totalPay(8.20,47);
        totalPay(10.00,73);

    }

    public static void totalPay (double basePay, double hoursWorked){
        double overtime = (hoursWorked - 40) * basePay;
        double calculatePay = 40 * basePay;

        if ((hoursWorked <= 40) && basePay >= 8.00){
            System.out.println(calculatePay);
        }
        else if ((hoursWorked > 40) && (hoursWorked <= 60) && (basePay >= 8.00)){
            System.out.println(calculatePay + overtime);
        }
        else System.out.println("Error");
    }
} //Name: Nana Kwaku Owusu
