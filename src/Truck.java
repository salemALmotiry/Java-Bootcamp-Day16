public class Truck implements Vehicle{

    private String truckType ;
    private int weeklyRate;
    private int weekRent;
    private boolean rented;

    public Truck(String truckType, int weekRent) {
        this.truckType = truckType;
        this.weekRent = weekRent;
       this.weeklyRate = 500;

    }

    @Override
    public double calculateRentalCost() {
        return this.weeklyRate * weekRent;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck");
        System.out.println("----------------------------------");
        System.out.println("Truck Type: " + this.truckType);
        System.out.println("Week Rent: " + this.weekRent);
        System.out.println("weekly Rate: " + this.weeklyRate);
        System.out.println("Rental Cost: " + calculateRentalCost());
        System.out.println("----------------------------------");

    }



    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getDailyRate() {
        return weeklyRate;
    }

    public void setDailyRate(int weeklyRate) {
        this.weeklyRate = weeklyRate;
    }

    public int getWeekRent() {

        return weekRent;
    }

    public void setWeekRent(int weekRent) {
        this.weekRent = weekRent;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
