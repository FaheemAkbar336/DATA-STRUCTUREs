public class DecimalToBinaryConverter {

    public static String DecimalToBinary(int num) {
        if (num == 0) {
            return "";
        }
        return DecimalToBinary(num / 2) + (num % 2);
    }

    public static void main(String[] args) {
        int number = 13;
        String binary = DecimalToBinary(number);

        if (binary.equals("")) {
            binary = "0";
        }

        System.out.println("The binary equivalent of " + number + " is: " + binary);
    }
}
