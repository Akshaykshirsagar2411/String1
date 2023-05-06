class Sbuffer1 {
    public static void main(String args[]) {

        String str = "akshay";

        System.out.println(System.identityHashCode(str));

        str = str.concat("kshirsagar");

        System.out.println(System.identityHashCode(str));
    }
}
