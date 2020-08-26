package class_April4;

public class RetailStore {
    private String product;
    private int quantity;
    private static int totalQuantity;

    public  RetailStore (String product, int quantity){
        this.product=product;
        this.quantity=quantity;
        totalQuantity+=this.quantity;   //initial qty need as well
    }


}
