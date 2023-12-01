package cc.synpulse8.adapterservice.domain.service.impl;

import cc.synpulse8.adapterservice.domain.model.entity.TransactionEntity;
import cc.synpulse8.adapterservice.domain.model.vo.TransactionInfo;
import cc.synpulse8.adapterservice.domain.repository.TransactionEntityRepository;
import cc.synpulse8.adapterservice.domain.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionEntityRepository transactionEntityRepository;

    @Override
    public void receiveTransactionInfo(TransactionInfo transactionInfo) {

        TransactionEntity transactionEntity = new TransactionEntity();

        String[] currencyCodeParts = transactionInfo.getCurrencyAmount().split("\\s+");
        if (currencyCodeParts.length != 2) {
            throw new IllegalArgumentException("Invalid currency string: " + transactionInfo.getCurrencyAmount());
        }

        transactionEntity.setUniqueIdentifier(transactionInfo.getUniqueIdentifier());
        transactionEntity.setCurrencyCode(currencyCodeParts[0]);
        transactionEntity.setAmount(new BigDecimal(currencyCodeParts[1]));
        transactionEntity.setAccountIBAN(transactionInfo.getAccountIBAN());
        transactionEntity.setValueDate(LocalDate.parse(transactionInfo.getValueDate()));
        transactionEntity.setDescription(transactionInfo.getDescription());

        transactionEntityRepository.save(transactionEntity);

    }


}
