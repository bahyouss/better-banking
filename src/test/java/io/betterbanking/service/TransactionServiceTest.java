package io.betterbanking.service;

import io.betterbanking.model.Transaction;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionServiceTest {

      @Test
      void findAllByAccountNumber_shouldReturnTransactions() {
            TransactionService service = new TransactionService();
            List<Transaction> transactions = service.findAllByAccountNumber(12345);

            assertEquals(3, transactions.size());
      }
}
