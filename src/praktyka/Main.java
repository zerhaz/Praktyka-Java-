package praktyka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        double a, b, pole;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza pole prostokąta.");
        System.out.println("Podaj bok A:");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj bok B:");
        b = Double.parseDouble((br.readLine()));

        pole = a * b;

        System.out.println("Pole prostokąta o bokach " + a + " i " + b + " wynosi: " + pole + ".");

    }

}

