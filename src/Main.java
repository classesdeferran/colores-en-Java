import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lista de colores");
        System.out.println("¿Cuantos colores quieres introducir?");
        int numColores = input.nextInt();

        ArrayList<String> colores = new ArrayList<String>();

        for (int i = 1; i <= numColores; i++){
            System.out.println("Introduce el color nº" + i + ":");
            String color = input.next();
            colores.add(color);
        }

        System.out.println("Has introducido los siguientes colores:");

        for (int i = 0; i < colores.size(); i++) {
            System.out.printf("\t" +colores.get(i));
        }

        System.out.println("\n" + colores.toString());




        input.close();

    }
}