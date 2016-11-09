package br.com.cielo.test.git;

import java.util.Date;

// R1 - fixed
public class Authorizer {
	public boolean authorize(Transaction t) {
		if (t.getValue() < 120 && t.getTimestamp().compareTo(new Date()) < 0) {
			return true;
		}
		
		return false;
	}
}
