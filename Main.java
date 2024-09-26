public class Main {
    public static void main(String[] args) {
        Manufacture toyota = new Manufacture();
        toyota.setName("Toyota");
        toyota.setLocation("Japan");

        Manufacture tesla = new Manufacture();
        tesla.setName("Tesla");
        tesla.setLocation("USA");

        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new ICEV(toyota, new CombustionEngine());
        vehicles[1] = new BEV(tesla, new ElectricEngine());
        vehicles[2] = new HybridV(toyota, new HybridEngine());
        vehicles[3] = new ICEV(toyota, new CombustionEngine());
        vehicles[4] = new BEV(tesla, new ElectricEngine());

        // Display characteristics of each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
        }
    }
}
