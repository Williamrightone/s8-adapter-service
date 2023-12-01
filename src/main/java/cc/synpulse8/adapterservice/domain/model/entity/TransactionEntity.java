package cc.synpulse8.adapterservice.domain.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "TRANSACTION_INFO")
@AllArgsConstructor
@NoArgsConstructor
public class TransactionEntity implements Serializable {

    @Id
    @Column(name = "UNIQUE_IDENTIFIER", nullable = false)
    private String uniqueIdentifier;

    @Column(name = "CURRENCY_CODE", nullable = false)
    private String currencyCode;

    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    @Column(name = "ACCOUNT_IBAN", nullable = false)
    private String accountIBAN;

    @Column(name = "VALUE_DATE", nullable = false)
    private LocalDate valueDate;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

}
