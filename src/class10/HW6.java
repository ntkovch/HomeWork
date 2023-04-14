package class10;

public class HW6 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries, south america countries, europe countries,
        asian countries, african countries. Then print all values from that array using 2 different loops
        and calculate how many total countries been stored.
         */
        String [][] countries={
                {"Canada", " U.S.", "Dominican Republic", "Bahamas"},
                {"Costa Rica", "Ecuador", "Colombia", "Argentina"},
                {"Germany", "Spain", "Ukraine", "Poland"},
                {"Japan", "Turkey", "India", "Uzbekistan"},
                {"Nigeria", "Egypt", "Angola", "Cameroon"}
        };
        int total=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
            total+= countries[i].length;
        }
        System.out.println("-----------------------------------------");
        System.out.println("The total amount of countries is "+total);
        System.out.println("-----------------------------------------");

        int tot=0;
        for (String[] country : countries) {
            for (String i : country) {
                System.out.print(i+" ");
                tot++;
            }
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("The total amount of countries is "+tot);
        System.out.println("-----------------------------------------");

    }
}
