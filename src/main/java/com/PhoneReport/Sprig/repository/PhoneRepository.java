package com.PhoneReport.Sprig.repository;


import com.PhoneReport.Sprig.entity.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneEntity, Long> {
}
