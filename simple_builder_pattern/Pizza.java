package org.design_pattern.simple_builder_pattern;

public class Pizza {

    private Pizza(Builder builder) {
        this.shouldAddPeperoni = builder.shouldAddPeperoni;
        this.shouldAddTomatoes = builder.shouldAddTomatoes;
        this.shouldAddCapsicums = builder.shouldAddCapsicums;
        this.shouldAddOlives = builder.shouldAddOlives;
        this.shouldAddChicken = builder.shouldAddChicken;
    }

    private final boolean shouldAddPeperoni;
    private final boolean shouldAddTomatoes;
    private final boolean shouldAddCapsicums;
    private final boolean shouldAddOlives;
    private final boolean shouldAddChicken;

    public static class Builder {

        private boolean shouldAddPeperoni;
        private boolean shouldAddTomatoes;
        private boolean shouldAddCapsicums;
        private boolean shouldAddOlives;
        private boolean shouldAddChicken;

        public Builder() {}

        public Builder setShouldAddPeperoni() {
            this.shouldAddPeperoni = true;
            return this;
        }

        public Builder setShouldAddTomatoes() {
            this.shouldAddTomatoes = true;
            return this;
        }

        public Builder setShouldAddCapsicums() {
            this.shouldAddCapsicums = true;
            return this;
        }

        public Builder setShouldAddOlives() {
            this.shouldAddOlives = true;
            return this;
        }

        public Builder setShouldAddChicken() {
            this.shouldAddChicken = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "shouldAddPeperoni=" + shouldAddPeperoni +
                ", shouldAddTomatoes=" + shouldAddTomatoes +
                ", shouldAddCapsicums=" + shouldAddCapsicums +
                ", shouldAddOlives=" + shouldAddOlives +
                ", shouldAddChicken=" + shouldAddChicken +
                '}';
    }
}
