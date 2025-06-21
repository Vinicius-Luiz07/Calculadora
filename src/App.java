import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n1, n2, resultado;
        String operadores [] = {"+", "-", "*", "/"};

        System.out.println("Digite um numero: " );
        n1 = ler.nextInt();
        
        System.out.println("Digite outro numero: " );
        n2 = ler.nextInt();
        
        System.out.println("escolha um operador logico: 0 = + \n"+
        "1 = - \n "+
        "2 = * \n "+
        "3 = / ");
        int operadoresEscolhido = ler.nextInt();

        switch (operadoresEscolhido == 0 ? "+" : 
                operadoresEscolhido == 1 ? "-" : 
                operadoresEscolhido == 2 ? "*" :
                operadoresEscolhido == 3 ? "/" : "") {
            case  "+":
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;
            case  "-":
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;
            case  "*":
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;
            case  "/":
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                break;
        }
    }
}
