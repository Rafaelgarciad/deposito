package deposito;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		double res = tank.getDepositoNivel();
		
		assertEquals(20.0, res, 0);
	}

}
