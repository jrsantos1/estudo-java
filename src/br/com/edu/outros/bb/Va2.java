package br.com.edu.outros.bb;

public class Va2 extends Va1 {
    public static String getStr() {
        return "0123456789ABCDEF";
    }
    public String ini(String s, int cpr) {
        return s.substring(s.length()-cpr, s.length());
    }

    public static void main(String[] args) {
        Va1 o = new Va2();

        //System.out.println(o.getStr());

        System.out.println(o.fin(o.getStr(), 5));
    }

}
