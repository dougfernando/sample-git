package br.com.cielo.test.git;

public class Authorizer {
	public boolean authorize(Transaction t) {
		if (t.getValue() < 100) {
			return true;
		}
		
		return false;
	}
}
