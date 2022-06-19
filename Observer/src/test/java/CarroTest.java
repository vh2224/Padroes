import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CarroTest {


    @Test
    void deveRetornarNotificacao() {
        Concessionaria concessionaria = new Concessionaria(5, "Barra Mansa", "Irmaos Mercedes");
        Carro carroA = new Carro("Ford EcoSport");
        Carro carroB = new Carro("Honda HR-v");
        carroA.cadastrar(concessionaria);
        carroB.cadastrar(concessionaria);
        concessionaria.cadastrarCarro();
        assertEquals("Ford EcoSport, carro cadastrado na Concessionaria{unidade=5, cidade='Barra Mansa', concessionaria='Irmaos Mercedes'}", carroA.notificar());
        assertEquals("Honda HR-v, carro cadastrado na Concessionaria{unidade=5, cidade='Barra Mansa', concessionaria='Irmaos Mercedes'}", carroB.notificar());
    }

    @Test
    void naoDeveNotificar() {
        Concessionaria concessionaria = new Concessionaria(1, "Volta Redonda", "Quatro Rodas");
        Carro carro = new Carro("Chevrolet Camaro");
        concessionaria.cadastrarCarro();
        assertEquals(null, carro.notificar());
    }
}