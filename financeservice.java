package com.finance.services;

import com.finance.models.Transaction;
import com.finance.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceService {
    private final TransactionRepository transactionRepository;

    @Autowired
    public FinanceService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.getAllTransactions();
    }

    public Transaction getTransactionById(int id) {
        return transactionRepository.getTransactionById(id);
    }

    public void addTransaction(Transaction transaction) {
        transactionRepository.addTransaction(transaction);
    }

    public void updateTransaction(Transaction transaction) {
        transactionRepository.updateTransaction(transaction);
    }

    public void deleteTransaction(int id) {
        transactionRepository.deleteTransaction(id);
    }
}