public class SmartphoneTest {
    public static void main(String[] args) {
        // Creating SmartphonePrice objects
        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 300.00);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 300.00);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 500.00);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 500.00);

        // Creating Smartphone objects
        Smartphone smartphone1 = new Smartphone("Samsung", "ModelX", 4000, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Nokia", "ModelX", 4000, producerPrice2, retailPrice2);

        // Printing details of the Smartphones
        System.out.println("Smartphone 1: " + smartphone1);
        System.out.println("Smartphone 2: " + smartphone2);

        // Checking equality
        if (smartphone1.equals(smartphone2)) {
            System.out.println("The two smartphones are equal.");
        } else {
            System.out.println("The two smartphones are not equal.");
        }

        // Cloning and testing the clone
        try {
            Smartphone clonedSmartphone = smartphone2.clone();
            System.out.println("Cloned Smartphone: " + clonedSmartphone);

            if (smartphone2.equals(clonedSmartphone)) {
                System.out.println("The cloned smartphone is equal to the second smartphone.");
            } else {
                System.out.println("The cloned smartphone is not equal to the second smartphone.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred while cloning the smartphone.");
        }
    }
}
