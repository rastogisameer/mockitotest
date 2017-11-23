package gfbo;

import data.Invoice;

public class Controller {
	public Invoice getInvoice(long id) {
		
		Service service = Service.getService();
		
		return service.getInvoice(id);
	}
}
