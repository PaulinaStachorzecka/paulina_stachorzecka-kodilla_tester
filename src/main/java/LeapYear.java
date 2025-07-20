public class LeapYear {
    public static void main(String[] args) {
        int year = 2025;

        if ( year % 400 == 0) {
            System.out.println(year + " Jest rokiem przestępnym.");
        } else if ( year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " Jest rokiem przestępnym.");
        } else {
            System.out.println(year + " Nie jest rokiem przestępnym.");
        }
    }
}