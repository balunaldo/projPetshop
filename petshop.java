public class petshop {
    String nomeCliente;
    long telefoneCliente;
    String servico;
    String nomePet;

    public void imprimeInfo(){
        System.out.println(this.nomeCliente + " - " + this.telefoneCliente + " - " + this.servico + " - " + this.nomePet);
    }
}
