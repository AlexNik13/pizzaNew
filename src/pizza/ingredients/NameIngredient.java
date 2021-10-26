package pizza.ingredients;

public enum NameIngredient {
    DOUGH {
        public double getCost() {
            return 100;
        }
    },
    CHEESE {
        public double getCost() {
            return 300;
        }
    },
    SAUSE {
        public double getCost() {
            return 150;
        }
    },
    TOMATO {
        public double getCost() {
            return 40;
        }
    },
    MEAT {
        public double getCost() {
            return 150;
        }
    },
    BACON {
        public double getCost() {
            return 125;
        }
    },
    MUSHROOMS {
        public double getCost() {
            return 48;
        }
    },
    ONION {
        public double getCost() {
            return 40;
        }
    },
    HAM {
        public double getCost() {
            return 450;
        }
    },
    SAUSAGE {
        public double getCost() {
            return 250;
        }
    },
    BELLPEPPER {
        public double getCost() {
            return 100;
        }
    },
    BROCCOLI {
        public double getCost() {
            return 110;
        }
    },
    OLIVES {
        public double getCost() {
            return 300;
        }
    };
    public abstract double getCost();
}
