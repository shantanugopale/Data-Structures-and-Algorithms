
class ElectricityBill {

    /*
     *  0  - 100 : 5/unit
     * 101 - 200 : 7/unit
     * 201 - 300 : 10/unit
     * 301 - 400 : 12/unit
     * 
     * input : 270
     */
    public static void main(String[] args) {
        int unit = 270;
        int totalBill;
        if (unit <= 100 && unit >= 0) {
            totalBill = unit * 5;
        } else if (unit <= 200 && unit >= 0) {
            totalBill = 100 * 5 + (unit - 100) * 7;
        } else if (unit <= 300 && unit >= 0) {
            totalBill = 100 * 5 + 100 * 7 + (unit - 200) * 10;
        } else {
            totalBill = 100 * 5 + 100 * 7 + 100 * 10 + (unit - 300) * 12;
        }
        System.out.println("Total Electricity Bill is : " + totalBill);
    }

}
