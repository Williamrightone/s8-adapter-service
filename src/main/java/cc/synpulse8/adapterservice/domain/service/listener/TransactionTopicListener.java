package cc.synpulse8.adapterservice.domain.service.listener;

import cc.synpulse8.adapterservice.domain.model.vo.TransactionInfo;
import cc.synpulse8.adapterservice.domain.service.TransactionService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TransactionTopicListener {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private TransactionService transactionService;

    @KafkaListener(topics = {"transaction-topic"}, groupId = "transaction-group")
    public void consume(String transactions) throws JsonProcessingException {

        TransactionInfo transactionInfo = objectMapper.readValue(transactions, TransactionInfo.class);

        transactionService.receiveTransactionInfo(transactionInfo);

    }


}
