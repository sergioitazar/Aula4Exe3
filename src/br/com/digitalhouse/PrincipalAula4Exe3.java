package br.com.digitalhouse;

public class PrincipalAula4Exe3 {


        /// exercicio 3
        public static boolean verifcaImparMaior10 ( int a){
            int i = 0;
            i = (a % 2);

            if (a % 2 > 0) {
                if (a > 10) {
                    return true;
                }
            }
            // public static void main (String[]args){
            //  System.out.println(verifcaImparMaior10(11));
            //       public static void main (String[]args){
            //  System.out.println(" Valores = ");

            //       }
            return false;
        }
    public static void main(String[] args) {
        System.out.println(verifcaImparMaior10(13));
    }
}