import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        consumerBillCalculations cbc = new consumerBillCalculations() ;
        System.out.println("Input Your Registered Name");
         String conName = sc.nextLine() ;
        System.out.println("Input Your Bill Month");
         String billMon = sc.nextLine() ;
        System.out.println("Input Your Registration Number");
            int regNum = sc.nextInt() ;
        System.out.println("Input Meter/Units Reading Carefully");
            int meterRead = sc.nextInt() ;
            int unitsConsumed = meterRead ;
        System.out.println("Input T.V Fee");
            float tvFee = sc.nextFloat() ;
        System.out.println("Input GST");
            float gst = sc.nextFloat() ;
        System.out.println("Input GST on Fuel Price Adjustment");
            float gstFPA = sc.nextFloat() ;
        System.out.println("Input E.D on FPA");
            float gstED = sc.nextFloat() ;

            // ****** Method Overloading ******
            cbc.consumerDetails(conName , billMon);
            cbc.consumerDetails(regNum , meterRead);
            // Bill calculations
            double finalBill = cbc.billCalculation(unitsConsumed);
            // Govt.Charges Calculations
            double govtCharges = cbc.billCalculation(tvFee,gst,gstFPA,gstED) ;

        System.out.println("------- Electricity Consumer Bill -------");
        System.out.println("\t"+cbc.consumerName);
        System.out.println("\t"+cbc.billMonth);
        System.out.println("\t"+cbc.regNumber);
        System.out.println("\t"+cbc.meterReading);
        System.out.println("Bill  Without Govt.Charges  : "+finalBill);
        System.out.println("Bill Payable After Due Date  : "+(finalBill+govtCharges));
        System.out.println("Bill Payable After Due Date  : "+(finalBill+govtCharges+335.0));








    }
}