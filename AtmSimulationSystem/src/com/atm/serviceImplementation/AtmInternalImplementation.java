package com.atm.serviceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.atm.model.Account;
import com.atm.service.AtmServiceInterface;

public class AtmInternalImplementation implements AtmServiceInterface {

    Scanner sc = new Scanner(System.in);
    private static int accounter = 2026001;

    public List<Account> accounts = new ArrayList<>();

    // CREATE ACCOUNT
    @Override
    public void createAccount() {

        try {
            System.out.print("Enter Name: ");
            String name = sc.next();

            int accountNumber = accounter++;
            long atmCardNumber = generateAtmcardNumber();

            Account acc = new Account();
            acc.setAccountNo(accountNumber);
            acc.setAtmCardNumber(atmCardNumber);
            acc.setName(name);
            acc.setBalance(0);
            acc.setPin(0);

            accounts.add(acc);

            System.out.println("Account Created Successfully!");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("ATM Card Number: " + atmCardNumber);

        } catch (Exception e) {
            System.out.println("Error while creating account!");
            sc.next();
        }
    }

    private long generateAtmcardNumber() {
        return (long) (Math.random() * 9000000000000000L) + 1000000000000000L;
    }

    // FIND ACCOUNT
    private Account findAccount(long cardNumber) {
        for (Account acc : accounts) {
            if (acc.getAtmCardNumber() == cardNumber) {
                return acc;
            }
        }
        return null;
    }

    // PIN VERIFY
    private boolean verifyPin(Account acc) {

        try {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (acc.getPin() == pin) {
                return true;
            } else {
                System.out.println("Incorrect PIN! Transaction cancelled.");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Invalid PIN input!");
            sc.nextLine();
            return false;
        }
    }

    // 💰 DEPOSIT
    @Override
    public void deposit() {

        try {
           
            System.out.print("Enter ATM Card Number: ");
            long card = sc.nextLong();

            Account acc = findAccount(card);

            if (acc == null) {
                System.out.println("Invalid Card!");
                return;
            }

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid amount!");
                return;
            }

            acc.setBalance(acc.getBalance() + amount);
            System.out.println("Deposit Successful!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.next();
        }
    }

    // 💸 WITHDRAW
    @Override
    public void withdraw() {

        try {
           
            System.out.print("Enter ATM Card Number: ");
            long card = sc.nextLong();

            Account acc = findAccount(card);

            if (acc == null) {
                System.out.println("Invalid Card!");
                return;
            }

            if (!verifyPin(acc)) return;

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid amount!");
                return;
            }

            if (amount > acc.getBalance()) {
                System.out.println("Insufficient Balance!");
                return;
            }

            acc.setBalance(acc.getBalance() - amount);
            System.out.println("Withdrawal Successful!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.next();
        }
    }

    // 💼 CHECK BALANCE
    @Override
    public void checkBalance() {

        try {

            System.out.print("Enter ATM Card Number: ");
            long card = sc.nextLong();

            Account acc = findAccount(card);

            if (acc == null) {
                System.out.println("Invalid Card!");
                return;
            }

            if (!verifyPin(acc)) return;

            System.out.println("Current Balance: " + acc.getBalance());

        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.next();
        }
    }

    // 🔐 SET PIN
    @Override
    public void changePin() {

        try {
            if (accounts.isEmpty()) {
                System.out.println("Create account first!");
                return;
            }

            System.out.print("Enter ATM Card Number: ");
            long card = sc.nextLong();

            Account acc = findAccount(card);

            if (acc == null) {
                System.out.println("Invalid Card!");
                return;
            }

            if (acc.getPin() != 0) {
                System.out.println("PIN already set!");
                return;
            }

            System.out.print("Set 4-digit PIN: ");
            int pin = sc.nextInt();

            if (String.valueOf(pin).length() != 4) {
                System.out.println("PIN must be 4 digits!");
                return;
            }

            acc.setPin(pin);
            System.out.println("PIN set successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.next();
        }
    }
}