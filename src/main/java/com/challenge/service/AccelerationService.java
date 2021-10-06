package com.challenge.service;

import com.challenge.entity.Acceleration;
import com.challenge.repository.AccelerationRepository;
import com.challenge.service.interfaces.AccelerationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AccelerationService implements AccelerationServiceInterface {

    @Autowired
    AccelerationRepository repository;

    @Override
    public Optional<Acceleration> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public List<Acceleration> findByCompanyId(Long companyId) {
        return this.repository.findByCompanyId(companyId);
    }

    @Override
    public Acceleration save(Acceleration object) {
        return this.repository.save(object);
    }

    @Override
    public  Optional<Acceleration> findAccelerationByName(String name) { return this.repository.findByCandidatesIdAccelerationName(name); }
    // public List<Acceleration> findAccelerationByName(String name) { return this.repository.findByAccelerationName(name); }

}
