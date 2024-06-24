package com.claimservice.rest;

import com.claimservice.model.Claims;
import com.claimservice.service.ClaimsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name ="Api Reclamo", description = "endpoint para reclamos")
@RestController
@RequestMapping("/api/v1.0")
@CrossOrigin("*")
public class ClaimsRest {

    @Autowired
    ClaimsService reclamoService;

    @Operation(summary = "reclamos", description = "para obtener reclamos por id", responses = {
            @ApiResponse(responseCode = "200", description = "obtener reclamos por Id"),
            @ApiResponse(responseCode = "204", description = "no se ha obtenido datos"),
            @ApiResponse(responseCode = "400", description = "datos incorrectos")})
    @GetMapping("reclamo/user-id/{userId}")
    public ResponseEntity<?> getReclamoById(@PathVariable("userId") int userId){
        List<Claims> reclamo = reclamoService.getReclamoById(userId);
        if(reclamo != null){
            return new ResponseEntity<>(reclamo, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("no existe reclamo con ese id", HttpStatus.NO_CONTENT);
        }
    }

    @Operation(summary = "guardar reclamo", description = "para guardar reclamos ", responses = {
            @ApiResponse(responseCode = "200", description = "reclamo guardado"),
            @ApiResponse(responseCode = "204", description = "no se ha guardado los datos"),
            @ApiResponse(responseCode = "400", description = "datos incorrectos")})
    @PostMapping("reclamo/save")
    public ResponseEntity<?> saveReclamo(@RequestBody Claims reclamo){
        Claims saveReclamo = reclamoService.saveReclamo(reclamo);
        return new ResponseEntity<>(saveReclamo, HttpStatus.OK);
    }

    @Operation(summary = "reclamos inner join", description = "para obtener reclamos por user_id", responses = {
            @ApiResponse(responseCode = "200", description = "obtener reclamos por user_Id"),
            @ApiResponse(responseCode = "204", description = "no se ha obtenido datos"),
            @ApiResponse(responseCode = "400", description = "datos incorrectos")})
    @GetMapping("claims/user-id/inner-join/{userId}")
    public ResponseEntity<?> getReclgetReclamosByidAndReservaByUserIdamoById(@PathVariable("userId") int userId){
        List<Claims> reclamo = reclamoService.getReclgetReclamosByidAndReservaByUserIdamoById(userId);
        if(reclamo != null){
            return new ResponseEntity<>(reclamo, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("no existe reclamo con ese id", HttpStatus.NO_CONTENT);
        }
    }

    @Operation(summary = "reclamos por analystId", description = "para obtener reclamos por analyst_id", responses = {
            @ApiResponse(responseCode = "200", description = "obtener reclamos por analyts_Id"),
            @ApiResponse(responseCode = "204", description = "no se ha obtenido datos"),
            @ApiResponse(responseCode = "400", description = "datos incorrectos")})
    @GetMapping("claims/analyst-id/{analystId}")
    public ResponseEntity<?> getClaimByAnalystId(@PathVariable("analystId") int analystId){
        List<Claims> reclamo = reclamoService.getReclgetReclamosByidAndReservaByUserIdamoById(analystId);
        if(reclamo != null){
            return new ResponseEntity<>(reclamo, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("no existe reclamo con ese id", HttpStatus.NO_CONTENT);
        }
    }
}
