import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (InputMismatchException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            ParametrosInvalidosException.retornarParametroInvalido();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            ParametrosInvalidosException.retornarParametroInvalido();
        }
        
        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int parametro = 0; parametro < contagem; parametro++) {
            System.out.println("Parametro : " + (parametro + 1));
        }

    }
}