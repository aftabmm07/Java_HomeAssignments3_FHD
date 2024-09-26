class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Hybrid Vehicle - Manufacture: " + manufacture.getName() +
                ", Location: " + manufacture.getLocation() +
                ", Engine: " + engine.getType());
    }
}
