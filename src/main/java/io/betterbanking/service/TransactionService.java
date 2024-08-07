package io.betterbanking.service;

import io.betterbanking.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TransactionService {

      private List<Transaction> transactions = new ArrayList<>(Arrays.asList(
            new Transaction("Debit", LocalDate.now(), 12345, "USD", 100.0, "Amazon", "amazon_logo.png"),
            new Transaction("Credit", LocalDate.now().minusDays(1), 12345, "USD", 50.0, "Starbucks", "starbucks_logo.png"),
            new Transaction("Debit", LocalDate.now().minusDays(2), 12345, "USD", 20.0, "Uber", "uber_logo.png")
      ));

      public List<Transaction> findAllByAccountNumber(int accountNumber) {
            List<Transaction> result = new ArrayList<>();
            for (Transaction transaction : transactions) {
                  if (transaction.getAccountNumber() == accountNumber) {
                        result.add(transaction);
                  }
            }
            return result;
      }

      public Transaction createTransaction(Transaction transaction) {
            transactions.add(transaction);
            return transaction;
      }


      public List<Transaction> getAllTransactions() {
            return transactions;
      }


}
