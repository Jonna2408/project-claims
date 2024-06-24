package com.claimservice.rest;

import com.claimservice.model.Reserve;
import com.claimservice.service.ReserveService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name ="Api Reserva", description = "endpoint para reservas")
@RestController
@RequestMapping("/api/v1.0")
@CrossOrigin("*")
public class ReserveRest {

    @Autowired
    ReserveService reservaService;

    @Operation(summary = "reservas", description = "para guardar reservas", responses = {
            @ApiResponse(responseCode = "200", description = "guardar reservas"),
            @ApiResponse(responseCode = "204", description = "no se ha obtenido datos"),
            @ApiResponse(responseCode = "400", description = "datos incorrectos")})
    @PostMapping("reserva/save")
    public ResponseEntity<?> saveReserva(@RequestBody Reserve reserva){
        Reserve saveReserva = reservaService.saveReserva(reserva);
        return new ResponseEntity<>(saveReserva, HttpStatus.OK);
    }

    @Operation(summary = "reservas", description = "para obtener reservas por claimId", responses = {
            @ApiResponse(responseCode = "200", description = "obtener reservas por claimId"),
            @ApiResponse(responseCode = "204", description = "no se ha obtenido datos"),
            @ApiResponse(responseCode = "400", description = "datos incorrectos")})
    @GetMapping("reserva/claim-id/{claimId}")
    public ResponseEntity<?> getReservaByClaimId(@PathVariable("claimId") int claimId){
        System.out.println("mi claimId: "+claimId );
        Reserve getReserva = reservaService.getReserveByClaimId(claimId);
        System.out.println("getReserva: "+getReserva);
        if(getReserva != null){
            return new ResponseEntity<>(getReserva, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("no existe reclamo con ese id", HttpStatus.NO_CONTENT);
        }

    }
}
