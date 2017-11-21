package data;

public class Invoice {
	
	private long invoiceId;
	private double amount;
	private String payor;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (invoiceId ^ (invoiceId >>> 32));
		result = prime * result + ((payor == null) ? 0 : payor.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		if (Double.doubleToLongBits(amount) != Double
				.doubleToLongBits(other.amount))
			return false;
		if (invoiceId != other.invoiceId)
			return false;
		if (payor == null) {
			if (other.payor != null)
				return false;
		} else if (!payor.equals(other.payor))
			return false;
		return true;
	}
	public Invoice(long invoiceId, double amount, String payor) {
		super();
		this.invoiceId = invoiceId;
		this.amount = amount;
		this.payor = payor;
	}
	public long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPayor() {
		return payor;
	}
	public void setPayor(String payor) {
		this.payor = payor;
	}

}
