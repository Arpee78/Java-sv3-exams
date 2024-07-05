package exam_sv2_part1_potpot.redlion;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RedLion {

    private String name;
    private List<Cup> cups = new ArrayList<>();
    private LocalTime openTime;
    private LocalTime closeTime;

    public RedLion(String name, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        cups.add(new Cup("Kamillavirágzat", 1256, Sort.HERBAL_TEA));
        cups.add(new Cup("Cseresznyés álom", 1745, Sort.FRUIT_TEA));
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public String getName() {
        return name;
    }

    public List<Cup> getTeas() {
        return new ArrayList<>(cups);
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void addCup(Cup cup) {
        cups.add(cup);
    }

    public void setActionPrices(Sort sort, int percent) {
        for (Cup cup : cups) {
            if (cup.getSort() == sort) {
                int newPrice = cup.getPrice() * (100 - percent) / 100;
                cup.setPrice(newPrice);
            }
        }
    }

    public double getAveragePrice() {
        double sum = 0;
        for (Cup cup : cups) {
            sum += cup.getPrice();
        }

        return sum / cups.size();
    }
}
