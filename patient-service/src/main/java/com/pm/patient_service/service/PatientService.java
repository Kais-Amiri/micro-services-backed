package com.pm.patient_service.service;

import com.pm.patient_service.dto.PatientResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PatientService {

    List<PatientResponseDto> getPatients();
}
