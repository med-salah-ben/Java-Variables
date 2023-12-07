
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num = 0 ;
        num += 5 ;
        System.out.println(num); // 5
        num -= 3 ;
        System.out.println(num); // 2
        num *= 3;
        System.out.println(num); // 6
        num /= 2 ;
        System.out.println(num); // 3
        num %= 2 ;
        System.out.println(num); // 1
        num = 0 ;
        System.out.println(num); // 0
        num++;
        System.out.println(num); // 1
        ++num ;
        System.out.println(num); // 2
        num--;
        System.out.println(num); // 1 // minus 1

        System.out.println(num++); // 1 => Prefix incrementation :  add 1 after the print
        System.out.println(num); // 2
        System.out.println(++num); // 3 Postfix incrementation : add 1 and print

    }
}