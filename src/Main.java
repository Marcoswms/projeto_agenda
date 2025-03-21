import controller.ClienteControle;
import model.Cliente;

import java.sql.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date data = Date.valueOf("1992-06-29");
        Cliente cliente = new Cliente();

        cliente.setNome("Marcos");
        cliente.setCpf("38489006654");
        cliente.setData_nascimento(data);
        cliente.setEndereco("Rua dos Testes, n.144 - Jd Primavera - São Paulo/SP");

        new ClienteControle().cadastraCliente(cliente);
    }
}