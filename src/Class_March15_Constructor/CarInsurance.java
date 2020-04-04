package Class_March15_Constructor;

public class CarInsurance {
    int modelYear; // private
    int ofTickets; // private
    int ofAccidents;  //private
    int priceOffer;
    int basePrice; //final
    int currentYear;

    public CarInsurance(){
        this.modelYear=2007;
        this.ofTickets=3;
        this.ofAccidents=0;
        this.priceOffer=500;
        this.basePrice=400;
        this.currentYear=2020;
    }
    // Constructor
    private CarInsurance(int modelYear, int ofTickets, int ofAccidents){
        this.modelYear=modelYear;
        this.ofTickets=ofTickets;
        this.ofAccidents=ofAccidents;
    }
    CarInsurance(int priceOffer, int currentYear){
        this.priceOffer=priceOffer;
        this.currentYear=currentYear;

    }
    void CarInsurance(int basePrice){
        this.basePrice=basePrice;
    }

    public int makeOffer (){
        return this.basePrice+(currentYear-modelYear)*50 + (30*ofTickets)+(100*ofAccidents);
    }

    @Override
    public String toString() {
        return "CarInsurance{" +
                "modelYear=" + modelYear +
                ", ofTickets=" + ofTickets +
                ", ofAccidents=" + ofAccidents +
                ", priceOffer=" + priceOffer +
                ", basePrice=" + basePrice +
                ", currentYear=" + currentYear +
                '}';
    }
}
