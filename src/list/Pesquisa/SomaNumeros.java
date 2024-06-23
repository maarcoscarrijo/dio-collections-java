package list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public  int encontrarMaiorNumero() {
        if (numeros.isEmpty()) {
            System.out.println("A lista está vazia");
        }
        return Collections.max(numeros);
    }

    public  int encontrarMenorNumero() {
        if (numeros.isEmpty()) {
            System.out.println("A lista está vazia");
        }
        return Collections.min(numeros);
    }

    public List<Integer> exibirNumeros() {
        return new ArrayList<>(numeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(8);

        System.out.println("Números na lista: " + somaNumeros.exibirNumeros());
        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
}
