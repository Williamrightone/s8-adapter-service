package cc.synpulse8.adapterservice.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionInfo {

    private String uniqueIdentifier;
    private String currencyAmount;
    private String accountIBAN;
    private LocalDate valueDate;
    private String description;

}