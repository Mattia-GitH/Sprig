package com.PhoneReport.Sprig.service;


import com.PhoneReport.Sprig.model.TestModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {

    TestModel createTest (TestModel testModel);

    List<TestModel> listTests();

    TestModel testByImei(Long imei);

    TestModel updateTest (TestModel testModel, Long imei);

    String delete (long imei);
}
