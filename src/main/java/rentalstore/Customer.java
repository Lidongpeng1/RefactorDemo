package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String htmlStatement(){
        String result = getHtmlHeader();
        for (Rental each : this.rentals){
            double thisAmout = each.getThisAmount();
        }
//        result += "<P>You owe<EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
//        result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints()) +
//                "</EM> frequent renter points<P>";
//        return result;
        return null;
    }

    public String statement() {
        double totalAmount = 0; //总数量
        int frequentRenterPoints = 0;  //积分

        String result = getHeader();  //获取打印条的头
        for (Rental each : this.rentals) {
            double thisAmount = each.getThisAmount(); //获取当前电影租赁的价格
            frequentRenterPoints = getFrequentRenterPoints(frequentRenterPoints, each); //获取当前电影租赁所获得的积分
            //show figures for this rental
            result += getBodyItem(thisAmount,each);

            totalAmount += thisAmount;
        }

        //add footer lines
        result = getFooter(totalAmount, frequentRenterPoints, result);  //获取打印条的脚

        return result;
    }

    private int getFrequentRenterPoints(int frequentRenterPoints, Rental each) {
        //add frequent renter points
        frequentRenterPoints++;
        //add bonus for a two day new release rental
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private String getFooter(double totalAmount, int frequentRenterPoints, String result) {
        String totalAmountByString = String.valueOf(totalAmount);
        result += "Amount owed is " + totalAmountByString + "\n";
        String frequentRenterPointsByString = String.valueOf(frequentRenterPoints);
        result += "You earned " + frequentRenterPointsByString + " frequent renter points";
        return result;
    }

    private String getHtmlHeader() {
        return "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
    }

    private String getHeader() {
        return "Rental Record for " + getName() + "\n";
    }

    private String getBodyItem(double thisAmount,Rental each) {
        String result = "";
        String thisAmountByString = String.valueOf(thisAmount);  //把当前电影租赁的价格转换成String类型
        result = "\t" + each.getMovie().getTitle() + "\t" + thisAmountByString + "\n";
        return result;
    }
}
