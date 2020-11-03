package InheritanceDemo;

public class BaseCreditManager {
    private double numberOfMoney;
    private double monthInterest;
    private int maturityDay;

    public double getNumberOfMoney() {
        return numberOfMoney;
    }

    public void setNumberOfMoney(double numberOfMoney) {
        if (numberOfMoney >= 1000) {
            this.numberOfMoney = numberOfMoney;
        } else {
            System.out.println("Ana Para 1000 liradan az olamaz");

        }
    }

    public double getMonthInterest() {
        return monthInterest;
    }

    public void setMonthInterest(double monthInterest) {
        double maxInterest = 1.50;
        double minInterest = 0.90;
        if (monthInterest >= minInterest && monthInterest <= maxInterest) {
            this.monthInterest = monthInterest;
        } else {
            System.out.println("Aylık faiz oranı " + minInterest + " ve " + maxInterest + " arasında olmalıdır ");
        }
    }


    public int getMaturityDay() {

        return maturityDay;
    }

    public void setMaturityDay(int maturityDay) {
        int minDay = 30;
        int maxDay = 360;
        if (maturityDay >= minDay && maturityDay <= maxDay) {
            this.maturityDay = maturityDay;
        } else {
            System.out.println("Vade Gün sayısı 30 ile 360 günler arasında olmalıdır");
        }


    }

    public void calculate(double numberOfMoney, double monthInterest, int maturityDay) {
        int constant = 36500;
        setNumberOfMoney(numberOfMoney);
        setMonthInterest(monthInterest);
        setMaturityDay(maturityDay);
        double resultCalculate = getNumberOfMoney() * getMonthInterest() * getMaturityDay() / constant;
        if (resultCalculate > 0) {
            System.out.println(maturityDay + "Günlük vadeli Faiz getirisi = " + resultCalculate);
        } else {
            System.out.println("Faiz oranı Hesaplanmadı");
        }


    }
}
