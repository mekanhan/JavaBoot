package class_March16_Constructor;

public class ElectricBilling {

    public int memberID;
    int counter;
    String name;
    double billAmount;
    public ElectricBilling(int memberID, int counter, String name, double billAmount){
        this.memberID=memberID;
        this.counter=counter;
        this.name=name;
        this.billAmount=billAmount;
    }

    void displayBill(){
        this.billAmount = this.counter*1.9;
        System.out.println(this.billAmount);
    }
    void readCounter(){
        System.out.println(this.counter);
    }
    void addConsumption(int consumption){
        this.counter+=consumption;
    }
    @Override
    public String toString(){
        return "ElectricBill :\n" +
                "memberID=\t" + memberID +
                ", counter=\t" +counter +
                ", name=\t" + name +
                ", billAmount=\t" + billAmount;

    }
}