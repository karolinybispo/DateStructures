package VetorLeguarino;

public class Vetor {
    
    public static void main(String[] args) {
        //No java ao iniciar um vetor do tipo inteiro ele ja insere 0 automaticamente em todos ate ser colocado um valor desejado. 
        int [] vetorzao = new int[10]; // o [] identifica que é um vetor. 
                                       // O 10 dentro do [] é tamanho do vetor

        //colocando valor dentro de uma posicao:
        vetorzao[3] = 40;
        vetorzao[0] = 32;
        vetorzao[1] = 00;

        //mostra a referencia na memoria.
        System.out.println(vetorzao); 
        //mostra valor de um indice especifico
        System.out.println(vetorzao[3]);   

        //mostrando todos os valores de uma vez:
        for (int i = 0; i <=9; i++){ // i comeca em 0, ele é menor ou igual a 9? (se sim, continua verificando. Se nao, parou), soma o valor que esta em i mais 1 (estava em 0, 0 + 1 = 1). Agora vai para linhas que estao dentro do for, acabou tudo, volta do inicio. Agora i é 1, 1 é menor ou igual a 9? Sim. Soma 1 + 1 = 2, passa para linhas dentro do for. Isso continua ate o i ser igual a 9.  
            // i++ => i = i + 1;
            System.out.println(vetorzao[i]);

        }

        //imprime o array inteiro pois o length informa o comprimento do vetor
        for (int o = 0; o < vetorzao.length; o++){
            System.out.println(vetorzao[o]);
        }
    }
}
