package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                palavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavrasUnicas, that.palavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavrasUnicas);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        for (String palavra : this.palavrasUnicas) {
            System.out.println(palavra);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("Olá");
        conjunto.adicionarPalavra("Mundo");
        conjunto.adicionarPalavra("Java");

        conjunto.adicionarPalavra("Hello");
        conjunto.adicionarPalavra("Word");
        conjunto.adicionarPalavra("Java");

        System.out.println("Palavras únicas no conjunto:");
        conjunto.exibirPalavrasUnicas();

        System.out.println("\nTentando remover uma palavra fora do conjunto");
        conjunto.removerPalavra("Oilá");

        System.out.println("\nA linguagem 'Java' está no conjunto? " + conjunto.verificarPalavra("Java"));
        System.out.println("\nA linguagem 'Python' está no conjunto? " + conjunto.verificarPalavra("Python"));

        System.out.println("\nRemovendo a palavra: Mundo");
        conjunto.removerPalavra("Mundo");



        conjunto.verificarPalavra("Mundo");

        System.out.println("\nPalavras únicas no conjunto após remoção:");
        conjunto.exibirPalavrasUnicas();
    }
}
