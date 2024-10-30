import java.util.Objects;

public class SmartphonePrice implements Cloneable {
    private String priceType;
    private double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public String toString() {
        return "SmartphonePrice{priceType='" + priceType + "', priceInEuros=" + priceInEuros + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 &&
                priceType.equals(that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    @Override
    public SmartphonePrice clone() {
        try {
            return (SmartphonePrice) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
