import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String OIB = input.substring(input.indexOf('<') - 11, input.indexOf('<'));

        input = br.readLine();
        String year = input.substring(0, 2);
        year = Integer.parseInt(year) <= 24 ? "20" + year : "19" + year;
        String month = input.substring(2, 4);
        String day = input.substring(4, 6);

        input = br.readLine();
        String firstName = input.substring(0, input.indexOf('<'));
        firstName = firstName.toLowerCase();
        firstName = (char) (firstName.charAt(0) - 32) + firstName.substring(1);

        input = input.substring(input.indexOf('<'));
        String lastName = input.replaceAll("<", "");
        lastName = lastName.toLowerCase();
        lastName = (char) (lastName.charAt(0) - 32) + lastName.substring(1);

        bw.write("Ime: " + firstName + "\n");
        bw.write("Prezime: " + lastName + "\n");
        bw.write("Datum rodjenja: " + day + "-" + month + "-" + year + "\n");
        bw.write("OIB: " + OIB);

        bw.flush();
        bw.close();
        br.close();

    }

}
