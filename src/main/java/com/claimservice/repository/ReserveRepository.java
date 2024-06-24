package com.claimservice.repository;

import com.claimservice.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, String> {

    @Query("SELECT c FROM Reserve c WHERE c.claimId =:claimId")
    public Reserve getReservesByClaimId(int claimId);
}
