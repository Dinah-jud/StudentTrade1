package za.ac.cput.repository;

import za.ac.cput.domain.Transaction;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository implements ITransactionRepository {

    private static ITransactionRepository repository = null;

    private final List<Transaction> transactionList;

    private TransactionRepository() {
        transactionList = new ArrayList<Transaction>();
    }

    public static ITransactionRepository getRepository() {
        if (repository == null) {
            repository = new TransactionRepository();
        }
        return repository;
    }

    @Override
    public Transaction create(Transaction transaction) {
        boolean success = transactionList.add(transaction);
        if (success) {
            return transaction;
        }
        return null;
    }

    @Override
    public Transaction read(Integer transactionID) {
        if (transactionID == null) {
            return null;
        }
        for (Transaction t : transactionList) {
            if (t.getId() == transactionID) {
                return t;
            }
        }
        return null;
    }

    @Override
    public Transaction update(Transaction transaction) {
        Integer transactionID = transaction.getId();
        Transaction existingTransaction = read(transactionID);
        if (existingTransaction == null) {
            return null;
        }

        boolean success = delete(transactionID);
        if (success) {
            if (transactionList.add(transaction)) {
                return transaction;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Integer transactionID) {
        Transaction transactionToDelete = read(transactionID);
        if (transactionToDelete == null) {
            return false;
        }

        return transactionList.remove(transactionToDelete);
    }

    @Override
    public List<Transaction> getAll() {
        return transactionList;
    }
}
