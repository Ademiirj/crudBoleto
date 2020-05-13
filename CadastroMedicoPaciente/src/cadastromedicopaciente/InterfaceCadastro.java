package cadastromedicopaciente;

import java.util.Scanner;

public interface InterfaceCadastro {
    Scanner leia = new Scanner(System.in);

    void entrada();
    void imprimir();
}
