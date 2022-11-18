package day1;

public class BankAccount {

    /*
    BankAccount has attributes: name and balance
    BankAccount has a constructor with name as parameter and default value of 0 for balance
    BankAccount has getters and setters for balance
    BankAccount has a withdraw() method that allows the user to withdraw money from their account
    BankAccount has a deposit() method that allows the user to deposit money into their account
    BankAccount has a toString() method that prints the name and balance like this:
       "Janice's bank account has a remaining balance of: 1500"
     */

    private String name;
   private double balance;

   public BankAccount (String name){
       this.name = name;
       this.balance = 0;
   }



   public void setBalance(double balance){
       this.balance = balance;

   }

   public double getBalance (){

       return balance;
   }


   public void withdraw(double withdraw){
       balance = balance - withdraw;

   }

   public void deposit(double deposit){
       balance = balance + deposit;
   }





    public String toString(){
        return name + "'s bank account has a balance of: " + balance;
    }





}




