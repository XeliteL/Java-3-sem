package Prak3.Num2.bikeproject.src.bikeproject;

public class Bike implements BikeParts {

    private String handleBars, frame, tyres, seatType;
    private int NumGears;

    public Bike() {
        // Используем константу из интерфейса
    }

    public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        NumGears = numGears;
    }

    // Реализация методов интерфейса BikeParts
    @Override
    public String getHandleBars() {
        return handleBars;
    }

    @Override
    public void setHandleBars(String newValue) {
        this.handleBars = newValue;
    }

    @Override
    public String getTyres() {
        return tyres;
    }

    @Override
    public void setTyres(String newValue) {
        this.tyres = newValue;
    }

    @Override
    public String getSeatType() {
        return seatType;
    }

    @Override
    public void setSeatType(String newValue) {
        this.seatType = newValue;
    }

    protected void printDescription() {
        System.out.println("\n" + BikeParts.companyCreated + "\n"
                + "This bike has " + this.handleBars + " handlebars on a "
                + this.frame + " frame with " + this.NumGears + " gears."
                + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
    }
}