package br.com.cielo.test.git;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random(new Date().getTime());
		List<Transaction> txs = new ArrayList<Transaction>();
		for (int i = 0; i < 100; i++) {
			txs.add(new Transaction(rnd.nextDouble()* 200, new Date(), "Some client"));
		}
		
		Authorizer authorizer = new Authorizer();
		for (Iterator<Transaction> iterator = txs.iterator(); iterator.hasNext();) {
			Transaction transaction = (Transaction) iterator.next();
			if (!authorizer.authorize(transaction)) {
				System.out.println("Transaction DENIED. Details " + transaction);
			} else {
				System.out.println("Transaction APPROVED. Details " + transaction);
			}
				
		}
	}

}
