package crudboleto.utilitarios;
import java.util.Scanner;

public interface InterfaceBoleto {
    Scanner leia = new Scanner(System.in);

    void entrada();
    void imprimir();
}

