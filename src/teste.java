import java.util.Scanner;

public class teste{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, mesNome;
        int ano, trimestre = 0, anoRestante;

        boolean habilitado, bissexto = false;
        nome = teclado.nextLine();
        mesNome = teclado.next();
        dia = teclado.nextInt();
        ano = teclado.nextInt();

        if ((ano % 400 == 0) || (!(ano % 400 == 0 ) && (ano % 4 == 0) && !(ano % 100 == 0)))
            bissexto = true;
        anoRestante = 2023 - ano;

        if (anoRestante >= 18)
            habilitado = true;
        else
            habilitado = false;
        
        if (bissexto)
            System.out.println(nome + " Nasceu no " + trimestre + " trimestre de um ano bissexto");
        else    
            System.out.println(nome + " Nasceu no " + trimestre + " trimestre de um ano normal");

        if (habilitado)
            System.out.println(nome + " já pode tirar carta");
        else
            System.out.println(nome + " não pode tirar carta");
    }


}