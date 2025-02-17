package ArrayLoianeYoutube;

public class VetorArrayLista {

    private String [] elementos; //vetor

    public VetorArrayLista (int capacidade){ //construtor
        
        this.elementos = new String[capacidade];
    }

    // metodo para adicionar valor no array
    public void adicionar(String elemento){
        for(int i =0; i<this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break; //freia o loop do for para parar assim que encontrar um lugar vazio
            }
        }
    }
}