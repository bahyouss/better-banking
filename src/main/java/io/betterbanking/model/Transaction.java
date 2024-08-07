package io.betterbanking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
      private String type;
      private LocalDate date;
      private Integer accountNumber;
      private String currency;
      private double amount;
      private String merchantName;
      private String merchantLogo;
}
