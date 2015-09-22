import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account c;
	
	@Before
	public void setUp() throws Exception 
	{
		c = new Account(1122, 20000);
	}
	
	@After
	public void tearDown() throws Exception 
	{
		c = null;
	}
	
	@Test
	public final void testDeposit() 
	{
		c.deposit(3000);
		assertEquals(c.getBalance(), 23000, 0);
	}
	
	@Test
	public final void testWithdraw() throws InsufficientFundsException
	{
		c.withdraw(3000);
		assertEquals(c.getBalance(), 17000, 0);
			}
	
	
	
}

