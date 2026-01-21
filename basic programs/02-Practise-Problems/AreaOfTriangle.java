import java.util.Scanner;

public class 	 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, height, area;
        String unit;

        
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();

        System.out.print("Enter the unit (inches or cm): ");
        unit = scanner.next().toLowerCase(); // Read unit and convert to lowercase

        
        area = 0.5 * base * height;

        System.out.println("\n--- Results ---");
        System.out.println("Base: " + base + " " + unit);
        System.out.println("Height: " + height + " " + unit);

        if (unit.equals("inches") || unit.equals("in")) {
            System.out.println("Area: " + area + " square inches");
            // Convert to square cm (1 inch = 2.54 cm, so 1 sq inch = 2.54*2.54 sq cm)
            double areaInSqCm = area * 2.54 * 2.54;
            System.out.println("Area: " + areaInSqCm + " square centimeters");
        } else if (unit.equals("cm") || unit.equals("centimeters")) {
            System.out.println("Area: " + area + " square centimeters");
            // Convert to square inches (1 cm = 1/2.54 inches, so 1 sq cm = (1/2.54)^2 sq inch)
            double areaInSqInches = area / (2.54 * 2.54);
            System.out.println("Area: " + areaInSqInches + " square inches");
        } else {
            System.out.println("Invalid unit entered. Area calculated as: " + area + " " + unit + " squared.");
        }

        scanner.close();
    }
}
