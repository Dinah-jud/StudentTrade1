package za.ac.cput.repository;


import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Transaction;

import java.util.List;

public interface ITransactionRepository extends IRepository<Transaction, Integer>{
    List<Transaction> getAll();
}
