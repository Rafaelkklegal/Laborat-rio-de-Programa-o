import java.util.Scanner;

public class ListaII_Exe06 {

    //clasee principal
    static void main() {

        //Classe que permite trabalhar com entradas e saídas
        Scanner entrada = new Scanner(System.in);

        //VARIÁVEIS
        int numCrianca=0, tempo=0, contF=0, contM=0, tempo24=0;
        char sexo;

        //sout TAB
        System.out.println("Digite o número de crianças nascidas no período:");
        numCrianca=entrada.nextInt();

        //ESTRUTURA DE REPETIÇÃO
        for(int cont=0;cont<numCrianca;cont++){

            System.out.println((cont+1)+" º Criança");

            System.out.println("Tempo de vida:");
            tempo=entrada.nextInt();

            System.out.println("Digite o sexo M/F:");
            sexo=entrada.next().toUpperCase().charAt(0);

            //validação de campo M/F
            //Operador lógico E
            while(!(sexo=='F') && !(sexo=='M')){
                System.out.println("Digite o sexo corretamente M/F:");
                sexo=entrada.next().toUpperCase().charAt(0);
            }//while

            //A)
            if(sexo=='F'){
                contF++; //contF <- contF + 1
            }

            //B)
            if(sexo=='M'){
                contM++; //contM <- contM + 1
            }

            //C)
            if(tempo<=24){
                tempo24++;
            }


        }//FOR
        //Saídas
        //(double) dividido de números inteiros
        System.out.println("Crianças femininas mortas no período:"+(double)contF/numCrianca*100);
        System.out.println("Crianças masculinas mortas no período:"+(double)contM/numCrianca*100);
        System.out.println("Crianças que viveram 24 meses ou menos:"+(double)tempo24/numCrianca*100);



    }

}
