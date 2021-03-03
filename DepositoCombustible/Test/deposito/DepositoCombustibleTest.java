package deposito;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,10.0);
		tank.fill(30);
		double res = tank.getDepositoNivel();
		assertEquals(40.0, res, 0);
	}

}
