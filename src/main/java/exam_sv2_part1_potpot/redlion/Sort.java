package exam_sv2_part1_potpot.redlion;

public enum Sort {

    BLACK_TEA("élénkítő hatású"),
    GREEN_TEA("méregtelenít"),
    ROOIBOS("tele van antioxidánsokkal"),
    HERBAL_TEA("sok különféle gyógyhatása van"),
    FRUIT_TEA("");

    private String additionalInfo;

    Sort(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }
}
