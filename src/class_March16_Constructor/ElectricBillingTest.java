package class_March16_Constructor;
public class ElectricBillingTest{

//    private int consumption;
//    private int b;
//    private int c;
//
//    public ElectricBillingTest(int consumption) {
//        this.consumption = consumption;
//    }
        public static void main(String[] args) {
            ElectricBilling myBill = new ElectricBilling(9876999,0,"veteran",0);
            System.out.println(myBill.toString());
            myBill.addConsumption(100);
            myBill.readCounter();
            myBill.displayBill();
            myBill.addConsumption(33);
            myBill.readCounter();
    }
}