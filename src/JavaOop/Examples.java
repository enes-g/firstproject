package JavaOop;

public class Examples {

    private String model;
    private String color;
    private int productionYear;
    private static int gear = 5; //(Class variable or static variable declare)

    public Examples (){

    }
    public Examples (String model, String color, int productionYear, int gear){
        this.model=model;
        this.color=color;
        this.productionYear=productionYear;
        Examples.gear=gear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;

    }


    public static   int getGear() {
        return gear;
    }

    public static void setGear(int gear) {



        Examples.gear = gear;

    }

    public static int increaseGear() {
        return
                gear++;
    }


    @Override
    public String toString() {
        return "Examples{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", Gear='" + gear + '\'' +


                '}';
    }


    public static void main(String[] args) {

        Examples examples = new Examples("Passat","White",2020,6);

        System.out.println("Example nesnesi\n" + " "  + '\'' + examples.toString());

        Examples examples1 = new Examples("Focus","Blue",2019,gear);

        System.out.println("Example1 nesnesi\n" + " "  + '\'' + examples1.toString());

        Examples examples2 = new Examples("Clio","Black",2020,gear);

        System.out.println("Example2 nesneni\n" + "  "  + '\'' + examples2.toString());

        Examples examples3 = new Examples("Leon","Red",2018,7);

        System.out.println("Example3 nesneni\n" + "  "  + '\'' + examples3.toString());

        Examples examples4 = new Examples("Cıvıc","Navy Blue", 2017,gear);

        System.out.println("Example4 nesneni\n" + "  " + '\'' + examples4.toString());


    }


}
