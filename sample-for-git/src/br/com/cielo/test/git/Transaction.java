package br.com.cielo.test.git;

import java.util.Date;

public class Transaction {
	public Transaction(double value, Date timestamp, String clientId) {
		super();
		this.value = value;
		this.timestamp = timestamp;
		this.clientId = clientId;
	}

	private double value;
	private Date timestamp;
	private String clientId;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String toString() {
		return "Tx value = " + Double.toString(this.value) + " | timestamp = " + timestamp + " | client = " + clientId;
	}
}
