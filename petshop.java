public class petshop {
    String nomeCliente;
    long telefoneCliente;
    String servico;
    String nomePet;

    public void imprimeInfo(){
        System.out.println("Cliente: "+ this.nomeCliente + "\nTelefone: " + this.telefoneCliente + "\nTipo serviço: " + this.servico + "\nNome do Pet: " + this.nomePet);
    }
}