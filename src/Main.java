
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float number = 3.14f;
        double number1 = 2.0;

        float floatMaxValue = Float.MAX_VALUE;
        float floatMinValue = Float.MIN_VALUE;
        System.out.println("Float max Value = "+ floatMaxValue); // 3.4028235E38
        System.out.println("Float min Value = "+ floatMinValue); // 1.4E-45

        double doubleMaxValue = Double.MAX_VALUE;
        double doubleMinValue = Double.MIN_VALUE;
        System.out.println("Double Max Value = " + doubleMaxValue); // 1.7976931348623157E308
        System.out.println("Double Min Value = " + doubleMinValue); // 4.9E-324
    }
}