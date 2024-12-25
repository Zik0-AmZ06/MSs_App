package org.sid.bankacc_service.repositories;

import org.sid.bankacc_service.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {

}
