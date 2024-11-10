public class Bike implements Vehicle{

    private String brand;
    private int hourlyRate;
    private int hoursRent;
    private boolean rented;


    public Bike( String brand,int hoursRent) {
        this.hoursRent = hoursRent;
        this.brand = brand;
        this.hourlyRate = 10;
    }

    @Override
    public double calculateRentalCost() {
        return hourlyRate * hoursRent;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike");
        System.out.println("----------------------------------");
        System.out.println("Brand: " + this.brand);
        System.out.println("Hours Rent: " + this.hoursRent);
        System.out.println("Hourly Rate: " + this.hourlyRate);
        System.out.println("Rental Cost: " + calculateRentalCost());
        System.out.println("----------------------------------");


    }




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDailyRate() {
        return hourlyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.hourlyRate = dailyRate;
    }

    public int getHoursRent() {
        return hoursRent;
    }

    public void setHoursRent(int hoursRent) {
        this.hoursRent = hoursRent;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
