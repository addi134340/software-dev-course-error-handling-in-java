package org.example;

/**
 * Custom exception for dividing by zero.
 */
public class CustomDivideByZeroException extends Exception {
    /**
     * The numerator of the failed division operation.
     */
    private final double a;

    /**
     * The denominator of the failed division operation.
     */
    private final double b;

    /**
     * Get the numerator of the failed division operation.
     *
     * @return The numerator of the failed division operation.
     */
    public double getA() {
        return a;
    }

    /**
     * Get the denominator of the failed division operation.
     *
     * @return The denominator of the failed division operation.
     */
    public double getB() {
        return b;
    }

    /**
     * Constructor for the CustomDivideByZeroException.
     *
     * @param a The numerator.
     * @param b The denominator (should be zero).
     */
    public CustomDivideByZeroException(double a, double b) {
        super("Attempted to divide " + a + " by zero");
        this.a = a;
        this.b = b;
    }
}

