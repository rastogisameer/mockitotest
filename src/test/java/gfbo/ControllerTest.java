package gfbo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import data.Invoice;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Service.class)
public class ControllerTest {
	
	@Test
	public void testGetInvoice() {
		
		long id = 1;
		Invoice invoice = new Invoice(id, 500, "sameer");
		
		PowerMockito.mockStatic(Service.class); // mock static methods of this class
		
		Service mockService = Mockito.mock(Service.class); // create a mock object
		
		Mockito.when(Service.getService()).thenReturn(mockService); // return the mock object when the static method is called using byte code manipulation
		
		Mockito.when(mockService.getInvoice(id)).thenReturn(invoice); // mock the method call
		
		Controller controller = new Controller();
		Invoice result = controller.getInvoice(1);
		
		assertEquals(invoice, result);
	}
}
