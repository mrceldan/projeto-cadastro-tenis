package PrimeiraAdo;

public class VetorTenis {
    public TenisMDS[] elementos;
    public int tamanho;

    public VetorTenis(int capacidade) {
        elementos = new TenisMDS[capacidade];
        tamanho = 0;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            TenisMDS [] elementosNovos = new TenisMDS[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }


    public void adicionar(TenisMDS cliente) {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = cliente;
        this.tamanho++;
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public Object buscar(int posicao) throws Exception {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new Exception("Posição inválida");
        }
        System.out.println("Cliente encontrado!");
        return this.elementos[posicao];
    }

    public void remover(int posicao) throws Exception{
        if(posicao >= posicao && posicao < tamanho){
            for(int i = posicao; i < this.tamanho - 1; i++){
                this.elementos[i] = this.elementos[i + 1];
            }
            this.elementos[tamanho] = null;
            this.tamanho--;
        }else{
            throw new Exception("Posição do cliente invalida!");
        }
    }

    public void listar() {
        if (this.tamanho == 0) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(this.elementos[i].toString());
            }
        }
    }
}