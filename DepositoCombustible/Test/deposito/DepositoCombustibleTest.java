package deposito;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible(40.0, 10.0);
		tank.consumir(10);
		double res = tank.getDepositoNivel();
		assertEquals(0.0, res, 0);
	}

}
