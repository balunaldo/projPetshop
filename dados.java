import java.util.Scanner;

public class dados {
    public static void main(String args[]){
        final int qtdPets = 1;
        Scanner entrada = new Scanner(System.in);
        petshop listPets[] = new petshop[qtdPets];

        for(int i = 0; i < qtdPets; i++){
            listPets[i] = new petshop();
            System.out.println("Nome cliente: ");
            listPets[i].nomeCliente = entrada.nextLine();
            System.out.println("Tipo serviço: ");
            listPets[i].servico = entrada.nextLine();
            System.out.println("Nome do pet: ");
            listPets[i].nomePet = entrada.nextLine();
            System.out.println("Telefone: ");
            listPets[i].telefoneCliente = entrada.nextLong();
            entrada.nextLine();
        }
        entrada.close();

        gerarLista(listPets);
        System.out.println("Ganhos totais: R$ " + somarValores(listPets));
    }

    public static void gerarLista(petshop[] listPets){
        System.out.println("Pets: ");
        if(listPets == null) return;
        for(petshop p : listPets){
            if(p != null){
                p.imprimeInfo();
            }
        }
    }

    public static double somarValores(petshop[] listPets){
        double total = 0.00;
        double valorTosa = 100.00;
        double valorBanho = 60.00;

        if(listPets == null) return total;
        for(petshop p : listPets){
            if(p != null){
                if(p.servico.equalsIgnoreCase("banho")){
                    total += valorBanho;
                }else if(p.servico.equalsIgnoreCase("tosa")){
                    total += valorTosa;
                }
            }
        }
        return total;
    }
}
