/**
 * The countries class contains all the needed functions for countries in the game.
 */
public class Countries {
    private String name;
    private double GDP;
    private double treasury;
    private String region;
    Countries(String x,double y, String z) {
        this.name = x;
        this.GDP = y;
        this.region = z;
    }
    public String getCountryname() {
        return name;
    }
    public double getGDP() {
        return GDP;
    }
    public String getRegion() {
        return region;
    }
    public void setGDP(double GDP) {
       this.GDP = GDP;
    }
}
