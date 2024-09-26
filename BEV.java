class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("BEV Vehicle - Manufacture: " + manufacture.getName() +
                ", Location: " + manufacture.getLocation() +
                ", Engine: " + engine.getType());
    }
}
