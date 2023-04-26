package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoloTest {

    @Test
    void deveRetornarBolo() {
        Camada camada1 = new Camada("Primeira Camada");
        Ingrediente ingrediente11 = new Ingrediente("Massa pronta", "Dona Benta");
        Ingrediente ingrediente12 = new Ingrediente("Suco Laranja", "Tang");
        camada1.addConteudo(ingrediente11);
        camada1.addConteudo(ingrediente12);

        Camada camada2 = new Camada("Segunda Camada");
        Ingrediente ingrediente21 = new Ingrediente("Leite Condensado", "Piracanjuba");
        Ingrediente ingrediente22 = new Ingrediente("Achocolatado", "Toddy");
        camada2.addConteudo(ingrediente21);
        camada2.addConteudo(ingrediente22);




        Camada insumo = new Camada("Bolo");
        insumo.addConteudo(camada1);
        insumo.addConteudo(camada2);


        Bolo bolo = new Bolo();
        bolo.setInsumo(insumo);

        assertEquals("Camada: Bolo\n" +
                "Camada: Primeira Camada\n" +
                "Ingrediente: Massa pronta - Dona Benta\n" +
                "Ingrediente: Suco Laranja - Tang\n" +
                "Camada: Segunda Camada\n" +
                "Ingrediente: Leite Condensado - Piracanjuba\n" +
                "Ingrediente: Achocolatado - Toddy\n", bolo.getInsumo());
    }

    @Test
    void deveRetornarExecacaoBoloSemInsumo() {
        try {
            Bolo bolo = new Bolo();
            bolo.getInsumo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Bolo sem insumos", e.getMessage());
        }
    }
}