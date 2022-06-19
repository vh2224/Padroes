import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class AtendimentoTest {

    @Test
    void deveRetornarAtendimentoUTI() {
        Atendimento atendimento = new Atendimento();
        assertEquals("Bem vindo ao Hospital Sta Maria\n"+
                        "Seu atestado de internação na UTI foi emitido com sucesso.\n" +
                        ">>Relatório: Paciente sofreu acidente de carro e apresenta múltiplas fraturas na costela.",
                atendimento.atendimentoUTI("Relatório: Paciente sofreu acidente de carro e apresenta múltiplas fraturas na costela."));
    }

    @Test
    void deveRetornarAtendimentoExames() {
        Atendimento atendimento = new Atendimento();
        assertEquals("Bem vindo ao Hospital Sta Maria\n"+
                        "Seu atestado de realização de exames foi emitido com sucesso.\n" +
                        ">>Relatório: Paciente encaminhado após consulta médica para realizar Radiografia Visto que apresentou quadro de covid.",
                atendimento.atendimentoExames("Relatório: Paciente encaminhado após consulta médica para realizar Radiografia Visto que apresentou quadro de covid."));
    }

}