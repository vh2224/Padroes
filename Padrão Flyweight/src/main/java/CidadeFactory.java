package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CidadeFactory {
    private static Map<String, Cidade> cidades = new HashMap<>();

    public static Cidade getCidade(String nome, String UF) {
        Cidade cidade = cidades.get(nome);
        if (cidade == null) {
            cidade = new Cidade(nome, UF);
            cidades.put(nome, cidade);
        }
        return cidade;
    }

    public static int getTotalCidades() {
        return cidades.size();
    }

}
