package com.shaik.banking_Application.repo;

import com.shaik.banking_Application.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
