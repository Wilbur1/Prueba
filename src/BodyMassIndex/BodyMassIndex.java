package BodyMassIndex;

public class BodyMassIndex {

    private String name;
    private double height;
    private double weight;
// Hola
    public BodyMassIndex(String newName, double newHeight, double newWeight) {
        name = newName;
        height = newHeight;
        weight = newWeight;
    }

    public double getBMI() {
        return weight / (height * height);
    }

    public String getCategory() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public void print() {
        System.out.printf("The BMI for %s is %2.2f his category is %s \n", name, getBMI(), getCategory());
    }

    public String toString() {
        return String.format("The BMI for %s is %2.2f his category is %s \n", name, getBMI(), getCategory());
    }
}
