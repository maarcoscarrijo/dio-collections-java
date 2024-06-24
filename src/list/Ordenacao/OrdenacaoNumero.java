package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    private List<Integer> numeros;

    public OrdenacaoNumero() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(this.numeros);
    }

    public void ordenarDescendente() {
        Collections.sort(this.numeros, Collections.reverseOrder());
    }

    public List<Integer> getNumeros() {
        return this.numeros;
    }

    public static void main(String[] args) {
        OrdenacaoNumero on = new OrdenacaoNumero();

        on.adicionarNumero(5);
        on.adicionarNumero(3);
        on.adicionarNumero(8);
        on.adicionarNumero(1);

        on.ordenarAscendente();
        System.out.println("Ordem Ascendente: " + on.getNumeros());

        on.ordenarDescendente();
        System.out.println("Ordem Descendente: " + on.getNumeros());
    }
}
