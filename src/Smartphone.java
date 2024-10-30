import java.util.Objects;

public class Smartphone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batteryMah;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batteryMah, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batteryMah = batteryMah;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batteryMah=" + batteryMah +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batteryMah == that.batteryMah &&
                brandName.equals(that.brandName) &&
                modelName.equals(that.modelName) &&
                producerPrice.equals(that.producerPrice) &&
                retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryMah, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() {
        try {
            Smartphone clonedSmartphone = (Smartphone) super.clone();
            clonedSmartphone.producerPrice = producerPrice.clone();
            clonedSmartphone.retailPrice = retailPrice.clone();
            return clonedSmartphone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
