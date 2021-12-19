import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura em centímetros: ");

        double cm = sc.nextDouble();

        double metros;

        metros = cm/100;

        System.out.println("A altura em metros é: " + metros);


    }
}
