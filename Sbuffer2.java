class Sbuffer2 {

    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("Akshay");

        System.out.println(System.identityHashCode(sb));

        sb.append("kshirsagar");

        System.out.println(System.identityHashCode(sb));
    }
}
