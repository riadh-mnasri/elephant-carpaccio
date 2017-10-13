package coding.dojo.elephantcarpaccio;

import java.util.Arrays;

public class CommandCalculator {

    public double calculate(int quantity, double unitPriceHt, TvaState tvaState) {
        double v = quantity * unitPriceHt * (1 + tvaState.value / 100);
        if (v >= 1000 && v < 5000) {
            return 0.97 * v;
        } else if (v >= 5000 && v < 7000) {
            return 0.95 * v;
        } else if (v >= 7000 && v < 10000) {
            return 0.93 * v;
        } else if (v >= 10000 && v < 50000) {
            return 0.90 * v;
        } else if (v >= 50000) {
            return 0.85 * v;
        } else {
            return v;
        }
    }

    public static enum TvaState {
        UT(6.85),
        TX(6.25),
        AL(4),
        CA(8.25),
        NV(8),
        NONE(0);

        TvaState(double value) {
            this.value = value;
        }

        final double value;

        public static TvaState parse(String input) {
            return Arrays.stream(values()).filter(s -> input.equalsIgnoreCase(s.name())).findFirst().orElse(NONE);
        }

    }
}
