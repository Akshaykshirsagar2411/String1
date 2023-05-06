class String5 {
    public static void main(String args[]) {

        String str1 = "Akshay";
        String str2 = new String("Akshay");

        String str3 = "Akshay";

        String str4 = new String("Akshay");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

    }
}
