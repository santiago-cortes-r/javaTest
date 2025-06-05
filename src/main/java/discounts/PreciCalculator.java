package discounts;


import java.util.ArrayList;
import java.util.List;

public class PreciCalculator {

    List<Double> precies = new ArrayList<>();
    private double discount = 0.0;
    double total = 0.0;
    public double getTotal() {


        for (Double price : precies ) {
            total += price;

        }
        return total*(1-(discount/100));
    }

    public void addPrecie(double v) {
        precies.add(v);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void deleteLastPrice() {
        total -= precies.get(precies.size() - 1);
    }
}
