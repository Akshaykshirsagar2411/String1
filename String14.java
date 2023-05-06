// toCharArray method

class String14 {

    public static void main(String args[]) {
        String str1 = "Akshaykshirsagar";

        System.out.println(str1);

        int len = mystrlen(str1);
        System.out.println(len);
    }

    static int mystrlen(String str1) {

        char arr[] = str1.toCharArray();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        return count;
    }

}
