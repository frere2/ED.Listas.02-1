package br.edu.fateczl.thiago.lista;

public class No<T> {
    T dado;
    No<T> proximo;

    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }
}
