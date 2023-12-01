package cc.synpulse8.adapterservice.domain.service;

import cc.synpulse8.adapterservice.domain.model.vo.TransactionInfo;

public interface TransactionService {

    void receiveTransactionInfo(TransactionInfo transactionInfo);

}
