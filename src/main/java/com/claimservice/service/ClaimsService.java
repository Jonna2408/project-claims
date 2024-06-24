package com.claimservice.service;

import com.claimservice.model.Claims;
import com.claimservice.repository.ClaimsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimsService {
    @Autowired
    ClaimsRepository reclamoRepository;

    /**
     * metodo para obtener reclamo por id
     * @param userId
     * @return
     */
    public List<Claims> getReclamoById(int userId){
        List<Claims> reclamo = reclamoRepository.getReclamo(userId);
        return reclamo;
    }

    /**
     * metodo con inner join
     * @param userId
     * @return
     */
    public List<Claims> getReclgetReclamosByidAndReservaByUserIdamoById(int userId){
        List<Claims> reclamo = reclamoRepository.getReclamosByidAndReservaByUserId(userId);
        return reclamo;
    }

    /**
     * metodo para guardar reclamo
     * @param reclamo
     * @return
     */
    public Claims saveReclamo(Claims reclamo){
        Claims response = reclamoRepository.save(reclamo);
        return response;
    }

    /**
     * metodo para obtener claimsByAnalystId
     * @param analystId
     * @return
     */
    public List<Claims> getClaimsByAnalystId(int analystId){
        List<Claims> getClaims = reclamoRepository.getClaimsByAnalystId(analystId);
        return getClaims;
    }
}
