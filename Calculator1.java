import java.util.Scanner;
public class Calculator1 {
    
    public static void main(String[] args) {

        double num1;
        double num2;
        String operacao;

        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.println("Inserir 1º número: ");
            num1 = input.nextInt();

            System.out.println("Inserir 2º número: ");
            num2 = input.nextInt();

            Scanner op = new Scanner(System.in);

            System.out.println("Inserir tipo de operação: (som/sub/mul/div)");
            operacao = op.next();

            if (operacao.equals("som"))
            {
                System.out.println("O resultado é: " + (num1 + num2));
            }
            else if  (operacao.equals("sub"))
            {
                System.out.println("O resultado é: " + (num1 - num2));
            }
            else if (operacao.equals("div"))
            {
                System.out.println("O resultado é: " + (num1 / num2));
            }
            else if (operacao.equals("mul"))
            {
                System.out.println("O resultado é: " + (num1 * num2));
            }
            else 
            {
                System.out.println("Erro");
            }
        }    
    }  
}