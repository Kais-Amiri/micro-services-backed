package com.pm.patient_service.controller;

import com.pm.patient_service.dto.PatientResponseDto;
import com.pm.patient_service.service.PatientService;
import com.pm.patient_service.service.PatientServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientServiceImpl patientService) {
        this.patientService= patientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PatientResponseDto>> getPatients(){
        List<PatientResponseDto> patients= patientService.getPatients();
        return ResponseEntity.ok().body(patients);
    }
}
