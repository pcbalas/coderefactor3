
package com.example.demo;

public class Class1 {
    public float calculate(float amount, int type, int years) {
        float result = 0;
        float disc = (years > 5) ? 5 / 100f : years / 100f;

        if (type == 1) {
            result = amount;
        } else if (type == 2) {
            result = (amount - (0.1f * amount)) - disc * (amount - (0.1f * amount));
        } else if (type == 3) {
            result = (0.7f * amount) - disc * (0.7f * amount);
        } else if (type == 4) {
            result = (amount - (0.5f * amount)) - disc * (amount - (0.5f * amount));
        }

        return result;
    }
}