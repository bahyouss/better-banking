package com.betterbanking.controller;

import com.betterbanking.model.Transaction;
import com.betterbanking.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class TransactionController {

      @Autowired
      private TransactionService transactionService;

      @PostMapping("/create")
      public Transaction createTransaction(@RequestBody Transaction account) {
            return transactionService.createTransaction(account);
      }

      @GetMapping("/transactions")
      public List<Transaction> getAllTransactions() {
            return transactionService.getAllTransactions();
      }

      @GetMapping("/transactions/{accountNumber}")
      public List<Transaction> getTransactions(@PathVariable("accountNumber")int accountNumber) {
            return transactionService.findAllByAccountNumber(accountNumber);
      }
}
