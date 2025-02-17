package VetorDeString;

//Manipulando vetor de texto

public class VetorString {
    
    public static void main(String[] args) {
        
        //declarando vetor
        String [] estado = new String[6];

        //inserindo valor
        estado[0] = "AC";
        estado[1] = "BA";
        estado[2] = "CE";

        //imprimindo todos
        for (int i = 0; i<estado.length; i++) { // o i vai andando em cada posicao do vetor, ele caminha pelo vetor.
            System.out.println("Estado: " + i + ": " + estado[i]);

        }

    }
}
