package com.claimservice.repository;

import com.claimservice.model.Claims;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimsRepository extends JpaRepository<Claims, String> {

    @Query("SELECT c FROM Claims c WHERE c.insuredId =:insuredId")
    public List<Claims> getReclamo(int userId);

    @Query("SELECT c FROM Claims c INNER JOIN Reserve a ON c.idClaim = a.claimId WHERE c.insuredId =:insuredId")
    public List<Claims> getReclamosByidAndReservaByUserId(int insuredId);

    @Query("SELECT c FROM Claims c WHERE c.analystId =:analystId")
    public List<Claims> getClaimsByAnalystId(int analystId);
}
