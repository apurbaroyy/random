import java.util.Rana;

public class RandomNumberGenerator {

    private static Random random = new Random();

    // Overloaded method to generate a random integer
    public static int generateRandomNumber(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    // Overloaded method to generate a random double
    public static double generateRandomNumber(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }

    // Overloaded method to generate a random float
    public static float generateRandomNumber(float min, float max) {
        return min + (max - min) * random.nextFloat();
    }

    // Overloaded method to generate a mixed random number (int and double as a String)
    public static String generateRandomNumber(int intMin, int intMax, double doubleMin, double doubleMax) {
        int randomInt = generateRandomNumber(intMin, intMax);
        double randomDouble = generateRandomNumber(doubleMin, doubleMax);
        return "Random Int: " + randomInt + ", Random Double: " + randomDouble;
    }

    public static void main(String[] args) {
        // Examples of using the static methods
        System.out.println("Random Integer: " + RandomNumberGenerator.generateRandomNumber(1, 100));
        System.out.println("Random Double: " + RandomNumberGenerator.generateRandomNumber(1.0, 10.0));
        System.out.println("Random Float: " + RandomNumberGenerator.generateRandomNumber(1.0f, 10.0f));
        System.out.println("Mixed Random Numbers: " + RandomNumberGenerator.generateRandomNumber(1, 100, 1.0, 10.0));
    }
}
