package deposito;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.getDepositoMax();
		double res = tank.getDepositoMax();
		
		assertEquals(40.0, res, 0);

	}

}
