public class Car implements Vehicle {


    private String model;
    private int dailyRate;
    private int daysRent;
    private boolean rented;

    public Car( String model, int daysRent) {
        this.model = model;
        this.dailyRate = 50;
        this.daysRent = daysRent;
    }

    @Override
    public double calculateRentalCost() {
        return daysRent * dailyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car");
        System.out.println("----------------------------------");
        System.out.println("Model: " + this.model);
        System.out.println("Days Rent: " + this.daysRent);
        System.out.println("Daily Rate: "+ this.dailyRate);
        System.out.println("Rental Cost: " + calculateRentalCost());
        System.out.println("----------------------------------");


    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getDaysRent() {
        return daysRent;
    }

    public void setDaysRent(int daysRent) {
        this.daysRent = daysRent;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
