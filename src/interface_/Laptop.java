package interface_;

public class Laptop implements Computers {
    protected String mainBoardSpecs;
    protected int memorySize;
    protected int cpuSpeed;
    protected String cpuType;
    protected int batteryPercent;

    //Constructor
    public Laptop(String mainBoardSpecs, int memorySize, int cpuSpeed, String cpuType, int batteryPercent) {
        this.mainBoardSpecs = mainBoardSpecs;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
        this.batteryPercent = batteryPercent;
    }

    public void setMainBoard() { //
        if (this.mainBoardSpecs.contains("intel")) {
            System.out.println("Intel processor is set");
        } else if (this.mainBoardSpecs.contains("AMD")) {
            System.out.println("AMD processor is set");
        } else {
            System.out.println("Unknown");
        }
    }

    @Override
    public void installCPU() {

    }

    @Override
    public void installMemory() {

    }

    @Override
    public void installDrive() {

    }

    @Override
    public void powerSupply() {

    }

    @Override
    public void graphics() {

    }

    void chargeBattery() {
        if (batteryPercent < 100)
            this.batteryPercent++;
    }

    void showBatteryPercentage() {
        System.out.println(this.batteryPercent);


    }

    public void cpuType() {
    }
}