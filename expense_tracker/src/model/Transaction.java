package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public final class Transaction {

  private final double amount;
  private final String category;
  private final String timestamp;


  public Transaction(double amount, String category) {
    this.amount = amount;
    this.category = category;
    this.timestamp = generateTimestamp();
  }

  public double getAmount() {
    return amount;
  }
  // removing the set methods so that once a Transaction object is created, its data cannot be changed externally
  // public void setAmount(double amount) {
  //   this.amount = amount;
  // }

  public String getCategory() {
    return category;
  }

  // public void setCategory(String category) {
  //   this.category = category; 
  // }
  
  public String getTimestamp() {
    return timestamp;
  }

  private String generateTimestamp() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");  
    return sdf.format(new Date());
  }

}