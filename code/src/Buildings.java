public class Buildings {
    private String name;
    private double cost;
    public String effect;
    public String information;
    Buildings(String x, int y, String z) {
        this.name = x;
        this.cost = y;
        this.effect = z;
    }
    public String getName() {
        return name;
    }
    public  double getCost() {
        return cost;
    }
   public String getEffect() {
        return effect;
   }
   public String Information() {
        return  information;
   }
}
