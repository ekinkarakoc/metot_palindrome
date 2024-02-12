public class Main {
    static boolean isPalindrome(int number) {
        int temp = number;
        int reverseNumber = 0;
        int lastNum;
        while (temp != 0) {
            lastNum = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNum;
            temp /= 10;
        }
        if (reverseNumber == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(233));
    }
}