import java.util.Scanner;

class String15 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        String str2 = sc.nextLine();

        int len1 = strlen1(str1);
        int len2 = strlen1(str2);

        if (len1 == len2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }

    static int strlen1(String str) {

        char arr[] = str.toCharArray();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            count++;
        }
        return count;
    }
}
