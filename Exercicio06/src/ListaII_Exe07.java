import java.text.DecimalFormat;
import java.util.Scanner;

public class ListaII_Exe07 {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat fNota = new DecimalFormat("#0.0");

        //VARIÁVEIS
        int numMatricula=0, numAulas=0; contAprov=0; contReprov=0
        double nota=0, somaNota=0, media=0;
        String situacao;

        for (int aluno=0;aluno<3;aluno++){

            System.out.println("Digite o número de matrícula:");
            numMatricula= entrada.nextInt();

            //zerar variaveis
            somaNota=0;
            media=0;
            cont=0;

            //ESTRUTURA DE REPETIÇÃO DAS 3 NOTAS
            while(cont<3){
                cont++;
                System.out.println("Digite a nota da prova: "+cont+":");
                nota=entrada.nextDouble();
                somaNota+=nota;
            }//while
            media=somaNota/3;

            if(media<6){
                situacao="Reprovado";
                contRep++;
            }else{
                situacao="Aprovado";
                contAprov++;
            }

            System.out.println(numMatricula+" - Média"+fNota.format(media)+" - "+situacao);



        }//For
        System.out.println("Qtd Alunos aprovados:"+contAprov);
        System.out.println("Qtd Alunos reprovados:"+contRep);

    }
}
