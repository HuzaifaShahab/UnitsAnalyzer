public class consumerBillCalculations {
    String consumerName ;
    String billMonth ;
    int regNumber ;
    int meterReading ;
    double finalBill ;
    // *** Method Overloading ***
    void consumerDetails (String consumerName , String billMonth){
        this.consumerName = consumerName ;
        this.billMonth = billMonth ;
    }
    // *** Method Overloading ***
    void consumerDetails (int regNumber , int meterReading){
        this.regNumber = regNumber ;
        this.meterReading = meterReading ;
    }
// Bill Calculation    ** Method Overloading **
    double billCalculation (int unitsConsumed){
        if (unitsConsumed <= 100 && unitsConsumed > 0){
             return finalBill = (unitsConsumed * 7.74) ;
        }else if (unitsConsumed > 100 && unitsConsumed <= 200){
             return finalBill = (100*7.74) + ((unitsConsumed-100) * 22.95) ;
        }else if (unitsConsumed > 200 && unitsConsumed <= 300){
             return finalBill = (100*7.74) + ((unitsConsumed-100) * 27.14) ;
        }else if (unitsConsumed > 300 && unitsConsumed <= 400){
             return finalBill = (100*7.74) + ((unitsConsumed-100) * 32.03) ;
        }else if (unitsConsumed > 400 && unitsConsumed <= 500){
             return finalBill = (100*7.74) + ((unitsConsumed-100) * 35.24) ;
        }else if (unitsConsumed > 500 && unitsConsumed <= 600){
             return finalBill = (100*7.74) + ((unitsConsumed-100) * 36.66) ;
        }else if (unitsConsumed > 600 && unitsConsumed <= 700){
             return finalBill = (100*7.74) + ((unitsConsumed-100) * 37.80) ;
        }else {
             return finalBill = (100*7.74) + ((unitsConsumed-100) * 42.72) ;
        }
    }
// Government Charges  ** Method Overloading **
    double billCalculation (float tvFee ,float gst , float gstFPA ,float gstED ) {
        return (tvFee+gst+gstED+gstFPA) ;
    }
}
