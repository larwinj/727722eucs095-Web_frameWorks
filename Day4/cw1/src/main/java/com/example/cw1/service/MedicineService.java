package com.example.cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw1.model.Medicine;
import com.example.cw1.repository.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepo medicineRepository;

    public Medicine createMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }
    public List<Medicine> getAllMedicines() {
        return (List<Medicine>) medicineRepository.findAll();
    }
    public Medicine getMedicineById(int medicineId) {
        return medicineRepository.findById(medicineId).orElse(null);
    }
}
