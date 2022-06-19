import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CarroTest {
    Carro carro;
    @BeforeEach
    public void setUp(){
        carro = new Carro();
    }
    @Test
    public void deveRetornarCarroLigado() {
        carro.setEstado(CarroLigado.getInstance());
        assertEquals("Ligado", carro.ligado());
    }
    @Test
    public void deveRetornarCarroLigadoDesligado() {
        carro.setEstado(CarroLigado.getInstance());
        assertEquals("Carro Desligado", carro.desligado());
    }
    @Test
    public void deveRetornarCarroLigadoEmMovimento() {
        carro.setEstado(CarroLigado.getInstance());
        assertEquals("Carro Parado", carro.emMovimento());
    }
    @Test
    public void deveRetornarCarroDesligado() {
        carro.setEstado(CarroDesligado.getInstance());
        assertEquals("Desligado", carro.ligado());
    }
    @Test
    public void deveRetornarCarroDesligadoLigado() {
        carro.setEstado(CarroDesligado.getInstance());
        assertEquals("Desligado", carro.desligado());
    }
    @Test
    public void deveRetornarCarroDesligadoEmMovimento() {
        carro.setEstado(CarroDesligado.getInstance());
        assertEquals("Carro Parado", carro.emMovimento());
    }
    @Test
    public void deveRetornarCarroEmMovimentoLigado() {
        carro.setEstado(CarroEmMovimento.getInstance());
        assertEquals("Ligado", carro.ligado());
    }
    @Test
    public void deveRetornarCarroEmMovimentoDesligado() {
        carro.setEstado(CarroEmMovimento.getInstance());
        assertEquals("Desligado", carro.desligado());
    }
    @Test
    public void deveRetornarCarroEmMovimento() {
        carro.setEstado(CarroEmMovimento.getInstance());
        assertEquals("Carro em Movimento", carro.emMovimento());
    }
}