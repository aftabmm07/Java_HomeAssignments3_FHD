class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("ICE Vehicle - Manufacture: " + manufacture.getName() +
                ", Location: " + manufacture.getLocation() +
                ", Engine: " + engine.getType());
    }
}
