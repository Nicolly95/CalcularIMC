import java.util.Locale;        //Importa a Classe Locale para usar os caracteres americanos
import java.util.Scanner;       //Importa a Classe Scanner para receber entradas

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);  //Invoca a classe Scanner e a instancia com o nome "entrada" para dentro do método main, 
                                                    // para armazenar as entradas do usuário com o método .in em "entradas".   

        entradas.useLocale(Locale.US);              //Invoca o método .useLocale para utilizar o padrão de números americanos(ele não aceitava a altura com decimais)

        System.out.println("CÁLCULO DO IMC - ÍNDICE DE MASSA CORPORAL \n");
        System.out.println("IMC = PESO / (ALTURA)² \n\n");

        System.out.println(" IMC < 20 : Abaixo do peso");
        System.out.println(" IMC entre 20-25 : Peso ideal");
        System.out.println(" IMC entre 25-30 : Sobrepeso");
        System.out.println(" IMC entre 30-35 : Obesidade Moderada");
        System.out.println(" IMC entre 35-40 : Obesidade Severa");
        System.out.println(" IMC entre 40-50 : Obesidade Mórbida");
        System.out.println(" IMC > 50 : Super-Obesidade \n");

        // Captura a altura
        System.out.print("Digite a sua altura (em metros): ");
        double altura = entradas.nextDouble();      //Método que recupera o valor da entrada do usuário armazenada no Scanner "entradas"
                                                    // e armazena na variável "altura", para podermos usá-la no calculo a seguir. 
        
        // Captura o peso
        System.out.print("Digite o seu peso (em kg): ");
        double peso = entradas.nextDouble();        //Método que recupera o valor da entrada do usuário armazenada no Scanner "entradas"
                                                    // e armazena na variável "peso", para podermos usá-la no calculo a baixo.        
        
        // Calcula o IMC
        double imc = peso / (altura * altura);

        if (imc < 20) {
            System.out.println("IMC < 20 : Abaixo do peso");
        } 
        else if (imc >= 20 && imc <= 25) {
            System.out.println("IMC entre 20-25 : Peso ideal");
        } 
        else if (imc > 25 && imc <= 30) {
            System.out.println("IMC entre 25-30 : Sobrepeso");
        } 
        else if (imc > 30 && imc <= 35) {
            System.out.println("IMC entre 30-35 : Obesidade Moderada");
        } 
        else if (imc > 35 && imc <= 40) {
            System.out.println("IMC entre 35-40 : Obesidade Severa");
        } 
        else if (imc > 40 && imc <= 50) {
            System.out.println("IMC entre 40-50 : Obesidade Mórbida");
        } 
        else {
            System.out.println("IMC > 50 : Super-Obesidade");
        }
        entradas.close();                       //Encerra o Scanner
    }
}

