package model;

import factory.MoradorDeRepublicaFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TabelaRateioTest {

    /**
     * Deve retornar corretamente a porcentagem paga de cada morador
     */
    @Test
    void CT001() {
        MoradorDeRepublica moradorDeRepublica1 = MoradorDeRepublicaFactory.createMoradorDeRepublica();
        MoradorDeRepublica moradorDeRepublica2 = MoradorDeRepublicaFactory.createMoradorDeRepublica();
        MoradorDeRepublica moradorDeRepublica3 = MoradorDeRepublicaFactory.createMoradorDeRepublica();

        TabelaRateio tabelaRateio = new TabelaRateio();

        tabelaRateio.adicionarParticipante(moradorDeRepublica1, 20d);
        tabelaRateio.adicionarParticipante(moradorDeRepublica2, 50d);
        tabelaRateio.adicionarParticipante(moradorDeRepublica3, 30d);

        double porcentagemPaga1 = tabelaRateio.getPorcentagemPaga(moradorDeRepublica1.getPessoa());
        double porcentagemPaga2 = tabelaRateio.getPorcentagemPaga(moradorDeRepublica2.getPessoa());
        double porcentagemPaga3 = tabelaRateio.getPorcentagemPaga(moradorDeRepublica3.getPessoa());

        assertEquals(0.2d, porcentagemPaga1,  0.01);
        assertEquals(0.5d, porcentagemPaga2, 0.01);
        assertEquals(0.3d, porcentagemPaga3, 0.01);


    }
}