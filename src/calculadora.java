import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class calculadora {

    private Scanner scanner = new Scanner(System.in);

    public void calcular() throws InterruptedException {
        System.out.println("\n\nBem-vindo à calculadora, siga as instruções abaixo para começar a calcular.\n");

        System.out.print("\nEscolha o operador: \n\n Somar (+)\n Subtrair (-)\n Multiplicar (x)\n Dividir (/)\n Sair (s)\n\n");
        String operador = scanner.nextLine();
        
        if (!operador.equals("+") && !operador.equals("-") && !operador.equals("x") && !operador.equals("/") && !operador.equals("s")) {  
            System.out.println("\nA Escolha " + "'" + operador + "'" + " é inválida. Por favor, tente novamente.");
            TimeUnit.SECONDS.sleep(1);
            calcular();
        }
        if (operador.equals("s")) {
        	System.out.println("\nVocê escolheu 's'. Você saiu da calculadora.");
            System.exit(0);
        }
        
       
        System.out.println("Você escolheu o operador: " + operador);

        System.out.print("\n\nDigite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Você digitou o número: " + numero1);

        System.out.print("\nDigite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Você digitou o número: " + numero2);

       
        scanner.nextLine();

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = somar(numero1, numero2);
                break;
            case "-":
                resultado = subtrair(numero1, numero2);
                break;
            case "x":
                resultado = multiplicar(numero1, numero2);
                break;
            case "/":
                resultado = dividir(numero1, numero2);
                break;
            default:
                System.out.println("\nO operador "+"'"+ operador+"'"+ " é inválido.");
                calcular();
        }

        System.out.println("\nO resultado da operação é: " + resultado);
        continua();
    }

    public void continua() throws InterruptedException {
        System.out.print("\nDeseja continuar usando a calculadora?\n\n Sim (y)\n Não (n)\n\n");
        String escolha = scanner.nextLine();
        System.out.println("Você escolheu: " + escolha);

        switch (escolha) {
            case "y":
                calcular();
                break;
            case "n":
                System.out.println("\nA calculadora será desligada em:\n\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\n5\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\n4\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\n3\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\n2\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\n1\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Calculadora desligada.");
                System.exit(0);
                break;
            default:
                System.out.println("\nEscolha inválida.");
                continua();
        }
    }

    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) throws InterruptedException {
        if (numero2 == 0) {
            System.out.println("\nNão pode dividir por 0, por favor, tente novamente.");
            TimeUnit.SECONDS.sleep(1);
            calcular();
            //return 0;
            	
        }
        return numero1 / numero2;
    }

    public static void main(String[] args) throws InterruptedException {
        calculadora calc = new calculadora();
        calc.calcular();
    }
}





































/*import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class calculadora {

    private Scanner scanner = new Scanner(System.in);

    public void calcular() throws InterruptedException {
        System.out.println("\n\nBem-vindo à calculadora, siga as instruções abaixo para começar a calcular.\n");

        
        System.out.print("\nEscolha o operador: \n\n Somar (+)\n Subtrair (-)\n Multiplicar (x)\n Dividir (/)\n Sair (s)\n\n");
        String operador = scanner.nextLine();
        System.out.println("Você escolheu o operador: " + operador);

        
        System.out.print("\n\nDigite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Você digitou o número: " + numero1);

        System.out.print("\nDigite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Você digitou o número: " + numero2);

        double resultado = 0;

        
        switch (operador) {
            case "+":
                resultado = somar(numero1, numero2);
                break;
            case "-":
                resultado = subtrair(numero1, numero2);
                break;
            case "x":
                resultado = multiplicar(numero1, numero2);
                break;
            case "/":
                resultado = dividir(numero1, numero2);
                break;
            case "s":
            	System.out.println("\nVocê saiu da calculadora.");
            	System.exit(0);
            default:
                System.out.println("\nOperador inválido.");
                calcular();
        }

        System.out.println("\nO resultado da operação é: " + resultado);
        continua();
        
}
    public void continua() throws InterruptedException {
    System.out.print("\nDeseja continuar usando a calculadora?\n\n Sim (y)\n Não (n)\n\n");
    String escolha = scanner.nextLine();
    System.out.println("Você escolheu: " + escolha);
    
    switch (escolha) {
    case "y":
    	calcular();
    	break;
    case "n":
    	System.out.println("\nA calculadora será desligada em:\n\n");
    	TimeUnit.SECONDS.sleep(1);
    	System.out.println("\n5\n");
    	TimeUnit.SECONDS.sleep(1);
    	System.out.println("\n4\n");
    	TimeUnit.SECONDS.sleep(1);
    	System.out.println("\n3\n");
    	TimeUnit.SECONDS.sleep(1);
    	System.out.println("\n2\n");
    	TimeUnit.SECONDS.sleep(1);
    	System.out.println("\n1\n");
    	TimeUnit.SECONDS.sleep(1);
    	System.out.println("Calculadora desligada.");
    	System.exit(0);
    	break;
    }
    
    if (!escolha.equals("y") | !escolha.equals("n")) {  
        System.out.println("\nEscolha inválida.");
        continua();
    };

    }
    
    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("\nNão pode dividir por 0, por favor, tente novamente.");
            return 0;
        }
        return numero1 / numero2;
    }

    public static void main(String[] args) throws InterruptedException {
        calculadora calc = new calculadora();
        calc.calcular();
    }
}*/

