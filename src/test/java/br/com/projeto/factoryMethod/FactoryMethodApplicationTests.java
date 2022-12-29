package br.com.projeto.factoryMethod;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projeto.factoryMethod.funcionario.Funcionario;
import br.com.projeto.factoryMethod.horista.Horista;
import br.com.projeto.factoryMethod.mensalista.Mensalista;

@SpringBootTest
class FactoryMethodApplicationTests {

	@Test
	void calcularSalarioLiquidoEBrutoMensalista_quandoSucesso() {

		Mensalista mensalista = new Mensalista();
		mensalista.setNome("Ronaldo - Mensalista");
		mensalista.setQuantidadeHorasExtras(2);
		mensalista.setValorSalario(1000);

		Funcionario funcionario = mensalista;

		assertAll("funcionario", () -> assertEquals("Ronaldo - Mensalista", funcionario.getNome()),
									() -> assertEquals(1020.0, funcionario.salarioBruto()),
									() -> assertEquals(918.0, funcionario.salarioLiquido()));
	}

	@Test
	void calcularSalarioLiquidoEBrutoHorista_quandoSucesso() {

		Horista horista = new Horista();
		horista.setNome("Ricardo - Horista");
		horista.setQuantidadeHoras(100);
		horista.setValorHora(10);

		Funcionario funcionario = horista;

		assertAll("funcionario", () -> assertEquals("Ricardo - Horista", funcionario.getNome()),
									() -> assertEquals(1000.0, funcionario.salarioBruto()),
									() -> assertEquals(900.0, funcionario.salarioLiquido()));

	}
}
