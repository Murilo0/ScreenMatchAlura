import java.util.Scanner;

public class TryCatchExercicios {

    private static double divisao(double v1, double v2){
        try{
            return v1 / v2;
        }catch (Exception e){
            System.out.println("Impossible to divide any number by 0");
            System.out.println(e.getMessage());
            return 0;
        }
    }

    private static String definirSenha(String senha){
        try{
            if (senha.length() < 8){
                throw new SenhaInvalidaException("Senha invalida");
            }else{
                String password = senha;
                return ("Senha definida com sucesso.");
            }
        }catch(SenhaInvalidaException e){
            return ("A senha nao foi definida por nao possuir 8 ou mais caracteres");
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois valores para divisao");
        System.out.println("Primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Segundo valor: ");
        double valor2 = scanner.nextDouble();

        double resultado = divisao(valor1,valor2);
        System.out.println("Resultado: " + resultado);

        System.out.println(definirSenha("Pinkfloyd"));
        System.out.println(definirSenha("Muffin"));
        System.out.println(definirSenha("LInking Park"));
    }
}
