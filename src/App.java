import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        UF estado = new UF("PA", "Pará");
        Cidade cid = new Cidade(estado,"Belém");

        Cliente cli = new Cliente(cid, "José");
        Cliente cli1 = new Cliente(cid, "Maria");
        Cliente cli2 = new Cliente(cid, "Luis");
        Cliente cli3 = new Cliente(cid, "Paulo");

        ArrayList listaClientes = new ArrayList();

        listaClientes.add(cli);
        listaClientes.add(cli1);
        listaClientes.add(cli2);
        listaClientes.add(cli3);

        System.out.println("Estado cliente: " + cli.getCid().getEstado().getDescricao());
        System.out.println("Estado cliente: " + cli.getNome());

        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println("------------");
            System.out.println(listaClientes.get(i));
        }


    }
}
