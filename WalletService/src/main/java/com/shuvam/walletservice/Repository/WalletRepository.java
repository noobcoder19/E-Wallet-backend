package com.shuvam.walletservice.Repository;

import com.shuvam.walletservice.Model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {

    @Query("SELECT w FROM Wallet w WHERE w.user_id = ?1")
    Wallet findWalletByUserId(int userId);
}