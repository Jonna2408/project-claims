package com.claimservice.service;

import com.claimservice.model.Reserve;
import com.claimservice.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveService {

    @Autowired
    ReserveRepository reserveRepository;

    /**
     * metodo para obtener ReserveByClaimId
     * @param claimId
     * @return
     */
    public Reserve getReserveByClaimId(int claimId){
        System.out.println("mi service: "+claimId);
        Reserve reserve = reserveRepository.getReservesByClaimId(claimId);
        return reserve;
    }

    /**
     * metodo que guarda reservas
     * @param reserva
     * @return
     */
    public Reserve saveReserva(Reserve reserva){
        Reserve response = reserveRepository.save(reserva);
        return response;
    }
}
