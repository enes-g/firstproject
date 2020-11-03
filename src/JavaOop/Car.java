package JavaOop;


public class Car {
    private String model;
    private int productionYear;
    private String color;
    int n = 7;

    public static void main(String[] args) {
        Car car = new Car(" Mercedes", 2012, "Blue");
        Car car1 = new Car();
        sedan sedan = new sedan("Seat", 2020, "NightBlue", "Cam Tavan", "Yes", 200);
        System.out.println(sedan);
        System.out.println(car);
        gasoline(2);
        car.changeNumber(car);
        int number = 5;
        change(number);
        System.out.println("Number=" + number);
        System.out.println("previous static  variable \n" + number);
        int[] array = new int[]{17, 28, 3, 4};

        for (int i = 0; i < array.length; i++) {
            System.out.println("i = " + array[i]);
            if (array[i] == 3) {
                int a[] = {array[3]};
                array[2] = a[0];
                System.out.println("array 2.index = " + array[2] + "\narray 3.index  = " + array[3]);
            }
        }
        int[] a = {44, 52, 6, 74, 18, 2};
        min(a);
        max(a);


    /*    int array2[] = arttir(12);
        for (int i = 0; i < array2.length; i++) {
            System.out.println("array2 = " + array2[i]);
        }
*/
    }


    public static void min(int[] arr) {
        int min = arr[0];
        for (int sayi : arr) {
            if (min > sayi) {
                min = sayi;
                System.out.println("arr = " + min);
            }
        }

    }

    public static void max(int[] array) {
        int max = array[0];
        for (int maxNumber : array) {
            if (max < maxNumber) {
                max = maxNumber;
                System.out.println("max = " + max);
            }

        }

    }

/*
    public static int[] arttir(int baslangic) {
        int elemanSayisi = ((100 - baslangic) / 2) + 1;
        int[] dizi = new int[elemanSayisi];
        for (int i = baslangic, j = 0; i <= 100; i += 2, j++) {
            dizi[j] = i;
        }
        return dizi;
    }
*/


    public static void change(int number) { //manin metodu içinde tanımlanan number static değişkeni (static olarak belirtmesekte statci methodun içinde olduğu için tanımlanan değişkende static kabul edilir) methoda parametre olarak geçiriliyor
        number = number + 8;
        // number = 10;
        System.out.println("local variable \n" + number);
        number = number + 5;
        System.out.println("New static variable Number\n" + number);

    }

    public void changeNumber(Car car) {
        // car.n=car.n+10;
        int a; //Local Variable
        System.out.println("first value\n" + car.n);
        car = new Car();
        a = 10;
        System.out.println("a is value\n" + a);
        System.out.println("car = " + car);
        car.n = 20;
        System.out.println("new object refer \n" + n);
        car.n = 15;
        System.out.println("new car number\n" + n);

    }


    public Car() {
        this("Lenovo", 2020, "White");
    }

    public Car(String model, int productionYear, String color) {
        setProductionYear(productionYear);
        setModel(model);
        setColor(color);

    }

    public String getColor() {
        return color;

    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", n=" + n +
                '}';
    }
    /*
        public double gasolineLiterPrice() {


        }
    */

    public static double totalAmount(int amount) {
        double gasolineLiterPrice = 5.6;
        return amount * gasolineLiterPrice;

    }

    public static double gasolineAmount() {
        return totalAmount(10);
    }

    public static void gasoline(int gasolineLiter) {
        boolean buyGasoline = true;

        if (gasolineLiter < 10) {
            System.out.println("Benzin miktarınız azaldı.");
            if (buyGasoline) {
                System.out.println("Ödemeniz Gereken Tutar\n" + gasolineAmount() + "Tl'dir");
            }
        } else {
            System.out.println("Marşa Bas");
        }


    }

    public void giveSignal() {
        System.out.println("Sinyal ver");

    }

    static class sedan extends Car {
        private String property;
        private String sportsSeat;
        private int finishSpeed;

        public sedan() {

        }

        public sedan(String model, int productionYear, String color, String property, String sportsSeat, int finishSpeed) {
            super(model, productionYear, color);
            setProperty(property);
            setSportsSeat(sportsSeat);
            setFinishSpeed(finishSpeed);
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public String getSportsSeat() {
            return sportsSeat;
        }

        public void setSportsSeat(String sportsSeat) {
            this.sportsSeat = sportsSeat;
        }

        public int getFinishSpeed() {
            return finishSpeed;
        }

        public void setFinishSpeed(int finishSpeed) {
            this.finishSpeed = finishSpeed;
        }

        @Override
        public String toString() {

            return "sedan{" +
                    "property='" + property + '\'' +
                    ", sportsSeat='" + sportsSeat + '\'' +
                    ", finishSpeed=" + finishSpeed +
                    '}';
        }
    }
}

