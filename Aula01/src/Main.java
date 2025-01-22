import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {


        int valor;
        System.out.println("Digite um valor inteiro: ");
        Scanner teclado = new Scanner(System.in);
        valor = teclado.nextInt();
        valor /= 2;
        System.out.println(valor);

        valor++;
        System.out.println(valor);

        System.out.println(valor >= 7);//valor é igual ou igual a 7?
        

    }
}