package hackerrank;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        StringBuilder sb = new StringBuilder();
        String password = String.valueOf(sb.append("#Al"));

        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        String updString = password.toString();
        int ct = 0;
        int uppct = 0;
        int lowct = 0;
        int numct = 0;
        int specct = 0;
        for (int i = 0; i < updString.length(); i++) {
            char c = updString.charAt(i);
            String st = Character.toString(c);
            if (special_characters.contains(st)) {
                specct++;
            } else if (upper_case.contains(st)) {
                uppct++;
            } else if (lower_case.contains(st)) {
                lowct++;
            } else if (numbers.contains(st)) {
                numct++;
            }
        }
            if (uppct == 0) {
                ct++;
            }
            if (lowct == 0) {
                ct++;
            }
            if (numct == 0) {
                ct++;
            }
            if (specct == 0) {
                ct++;
            }
            int value =(ct+ password.length() < 6) ? 6 - password.length() : ct;
            ct = value;
            System.out.println("Minimum number of characters to add: " + ct);
        }
}