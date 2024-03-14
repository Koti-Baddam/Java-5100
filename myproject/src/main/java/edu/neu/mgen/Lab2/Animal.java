package edu.neu.mgen.Lab2;
public class Animal {
    protected String name;
    protected double typicalSize;
    protected double typicalWeight;
    protected boolean isPredator;
    protected String dietType;

    public Animal(String name, double typicalSize, double typicalWeight, boolean isPredator) {
        this.name = name;
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.isPredator = isPredator;
        this.dietType = isPredator ? "Predator" : "Vegetarian";
    }

    public void describe() {
        // Implementation can be overridden by subclasses
    }

    public static void main(String[] args) {
        Bird eagle = new Bird("Eagle", 100, 6.5, true, 220);
        Bird sparrow = new Bird("House Sparrow ", 20, 0.7, false, 180);
        LandAnimal tiger = new LandAnimal("Tiger", 300, 400, true, 4);
        LandAnimal panda = new LandAnimal("Panda", 150, 200, false, 4);
        Fish shark = new Fish("Shark", 500, 1100, true, 5);

        eagle.describe();
        sparrow.describe();
        tiger.describe();
        panda.describe();
        shark.describe();
    }

    static class Bird extends Animal {
        private double wingspan;

        public Bird(String name, double typicalSize, double typicalWeight, boolean isPredator, double wingspan) {
            super(name, typicalSize, typicalWeight, isPredator);
            this.wingspan = wingspan;
        }

        @Override
        public void describe() {
            System.out.println("Bird Name: " + name + "\n Size: " + typicalSize + "cm Weight: " + typicalWeight + "kg\n Diet: " + dietType + "\n Wingspan: " + wingspan + "cm");
        }
    }

    static class LandAnimal extends Animal {
        private int numberOfLegs;

        public LandAnimal(String name, double typicalSize, double typicalWeight, boolean isPredator, int numberOfLegs) {
            super(name, typicalSize, typicalWeight, isPredator);
            this.numberOfLegs = numberOfLegs;
        }

        @Override
        public void describe() {
            System.out.println("Land Animal Name: " + name + "\n Size: " + typicalSize + "cm\n Weight: " + typicalWeight + "kg\n Diet: " + dietType + "\n Number of Legs: " + numberOfLegs);
        }
    }

    static class Fish extends Animal {
        private int numberOfFins;

        public Fish(String name, double typicalSize, double typicalWeight, boolean isPredator, int numberOfFins) {
            super(name, typicalSize, typicalWeight, isPredator);
            this.numberOfFins = numberOfFins;
        }

        @Override
        public void describe() {
            System.out.println("Fish Name: " + name + "\n Size: " + typicalSize + "cm\n Weight: " + typicalWeight + "kg\n Diet: " + dietType + "\n Number of Fins: " + numberOfFins);
        }
    }
}

