package com.cs.project.uber.uberApp.services;

import com.cs.project.uber.uberApp.dto.WalletTransactionDto;
import com.cs.project.uber.uberApp.entities.WalletTransaction;

public interface WalletTransactionService {

    void createNewWalletTransaction(WalletTransaction walletTransaction);

}
