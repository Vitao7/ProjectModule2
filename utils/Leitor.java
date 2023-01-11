package utils;

import java.util.Scanner;

public class Leitor {
    Scanner scanner = new Scanner(System.in);

    public String lerString(String mensagem){
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    public int lerInteiro(String mensagem){
        while (true){
            try{
                String ler = lerString(mensagem);
                return Integer.parseInt(ler);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido");
            }
        }
    }

    public double lerDecimal(String mensagem){
        while (true){
            try{
                String ler = lerString(mensagem);
                return Double.parseDouble(ler);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido");
            }
        }
    }

}
