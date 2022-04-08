package Builder;

public class JogadorValorantBuilder {

    private JogadorValorant jogadorValorant;

    public JogadorValorantBuilder() {
        jogadorValorant = new JogadorValorant();
    }

    public JogadorValorant build() {
        if (jogadorValorant.getIdade() <= 16) {
            throw new IllegalArgumentException("você não tem idade para jogar valorant");
        }
        if (jogadorValorant.getHorasJogadas() < 0) {
            throw new IllegalArgumentException("você nao tem horas minimas para jogar competitivo de valorant");
        }
        if (jogadorValorant.getNome().equals("")) {
            throw new IllegalArgumentException("por favor, insira um nome");
        }
        return jogadorValorant;
    }

    public JogadorValorantBuilder setNome(String nome) {
        jogadorValorant.setNome(nome);
        return this;
    }

    public JogadorValorantBuilder setNickname(String nickname) {
        jogadorValorant.setNickname(nickname);
        return this;
    }

    public JogadorValorantBuilder setNacionalidade(String nacionalidade) {
        jogadorValorant.setNacionalidade(nacionalidade);
        return this;
    }

    public JogadorValorantBuilder setNivel(String nivel) {
        jogadorValorant.setNivel(nivel);
        return this;
    }

    public JogadorValorantBuilder setIdade(int idade) {
        jogadorValorant.setIdade(idade);
        return this;
    }

    public JogadorValorantBuilder setHorasJogadas(int horasJogadas) {
        jogadorValorant.setHorasJogadas(horasJogadas);
        return this;
    }
}