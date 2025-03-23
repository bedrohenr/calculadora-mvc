import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual operação deseja fazer?");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int escolha = scan.nextInt();
        double n1, n2;

        System.out.print("Digite o primeiro número da operação: ");
        n1 = scan.nextDouble();

        System.out.print("Digite o segundo número da operação: ");
        n2 = scan.nextDouble();

        double resultado;

        switch (escolha) {
            case 1:
                resultado =  n1 + n2;
                break;

            case 2:
                resultado = n1 - n2;
                break;

            case 3:
                resultado = n1 * n2;
                break;

            case 4:
                resultado = n1 / n2;
                break;
                
            default:
                System.out.println("Operação inválida. Não foi possível concluir a operação.");
                resultado = 0;
                System.exit(1);
                break;
        }
        System.out.println("Resultado da operação: " + resultado);
    }
}
