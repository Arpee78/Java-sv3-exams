package exam_sv2_part1_pot.teahouse;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeaHouse {

    private String name;
    private List<Tea> teas = new ArrayList<>();
    private LocalTime openTime;
    private LocalTime closeTime;

    public TeaHouse(String name, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        teas.add(new Tea("Kamillavirágzat", 1256, Sort.HERBAL_TEA));
        teas.add(new Tea("Cseresznyés álom", 1745, Sort.FRUIT_TEA));
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public void addTea(Tea tea) {
        teas.add(tea);
    }

    public String getName() {
        return name;
    }

    public List<Tea> getTeas() {
        return teas;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setActionPrices(Sort sort, int percent) {
        for (Tea tea : teas) {
            if (tea.getSort() == sort) {
                int newPrice = tea.getPrice() * (100 - percent) / 100;
                tea.setPrice(newPrice);
            }
        }
    }

    public double getAveragePrice() {

        double sum = 0;

        for (Tea tea : teas) {
            sum += tea.getPrice();
        }

        return sum / teas.size();
    }
}
