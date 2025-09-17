package PrimeiraAdo;

//declarando a classe
public class TenisMDS{
    //declaracao dos atributos privados -> cada caracteristica do cliente
    private String nome;
    private String telefone;
    private String modeloRaquete;
    private String corda;
    private String libragem;
    private String entrega;

//metodo construtor -> cliente ja preenchido
public TenisMDS(String nome, String telefone, String modeloRaquete, String corda, String libragem, String entrega) {
    this.nome = nome;
    this.telefone = telefone;
    this.modeloRaquete = modeloRaquete;
    this.corda = corda;
    this.libragem = libragem;
    this.entrega = entrega;
}

//metodos de acesso (get -> pega o valor do nome e set -> altera o valor do nome
//servem para os atributos privados que nao podem ser acessados

    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //telefone
    public String getTelefone() {

        return telefone;
    }
    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    //modelo da raquete
    public String getModeloRaquete() {

        return modeloRaquete;
    }

    public void setModeloRaquete(String modeloRaquete) {
        this.modeloRaquete = modeloRaquete;
    }

    //corda
    public String getCorda() {

        return corda;
    }
    public void setCorda(String corda) {

        this.corda = corda;
    }

    //libragem
    public String getLibragem() {

        return libragem;
    }
    public void setLibragem(String libragem) {

        this.libragem = libragem;
    }

    //data de entrega
    public String getEntrega() {

        return entrega;
    }
    public void setEntrega(String dataEntrega) {

        this.entrega = dataEntrega;
    }

    //impressao do objeto
    @Override
    public String toString(){
        return "Cliente: " + nome + " | Telefone: " + telefone + " | Raquete: " + modeloRaquete + " | Corda: " + corda +
                " | Libragem: " + libragem + " | Data de Entrega: " + entrega;

    }

}


