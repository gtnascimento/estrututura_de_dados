package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncoesPrincipaisTest {

	@Test
	void test() {
		Arranjo a = new Arranjo();
		
		assertEquals(510, a.menor(), "O menor deve ser 440");
		
		assertEquals(940, a.maior(), "O maior é 940");

		assertEquals(7540, a.soma(), "A soma é 7040");
		
		assertEquals(0, a.repeticoes(3), "940 aparece 2 vezes");

		assertEquals(1, a.repeticoes(790), "940 aparece 2 vezes");

		assertEquals(2, a.repeticoes(940), "940 aparece 2 vezes");
	}

}
