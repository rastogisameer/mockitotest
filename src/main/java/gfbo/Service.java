package gfbo;

import data.Invoice;

public class Service {

	private static Service service;
	
	private Service() {
		
	}
	public static Service getService() {
		
		if(service == null) {
			service = new Service();
		}
		return service;
	}
	public Invoice getInvoice(long id) {
		
		Invoice inv = new Invoice(id, 500, "sameer");
		int a = 1, b = 0, c = a/b;
		return inv;
	}
}
