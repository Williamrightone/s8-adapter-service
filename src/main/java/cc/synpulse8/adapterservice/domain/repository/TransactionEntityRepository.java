package cc.synpulse8.adapterservice.domain.repository;

import cc.synpulse8.adapterservice.domain.model.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionEntityRepository extends JpaRepository<TransactionEntity, String> {
}
