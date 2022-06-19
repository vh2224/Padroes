public interface CarroEstado {

    String getEstado();
    String ligado(Carro usuario);
    String desligado(Carro usuario);
    String emMovimento(Carro usuario);

}
