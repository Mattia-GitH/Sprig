package com.PhoneReport.Sprig.service;

import com.PhoneReport.Sprig.model.PhoneModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PhoneService {

    PhoneModel createPhone (PhoneModel phoneModel);

    List<PhoneModel> listPhones();

    PhoneModel phoneByImei(Long imei);

    PhoneModel updatePhone (PhoneModel phoneModel, Long imei);

    String delete (long imei);
}
