package com.PhoneReport.Sprig.controller;

import com.PhoneReport.Sprig.model.TestModel;
import com.PhoneReport.Sprig.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("test")
    public String phoneList(Model model){
        List<TestModel> testModels = testService.listTests();
        model.addAttribute("testList", testModels);

        return "test";
    }

    @RequestMapping("/create_test")
    public String addPhone(Model model){
        TestModel testModel = new TestModel();
        model.addAttribute("test",testModel);

        return "newTest";
    }

    @RequestMapping(value = "/save_test", method = RequestMethod.POST)
    public String savePhone(@ModelAttribute("test") TestModel testModel){
        Date date = new Date(System.currentTimeMillis());
        testModel.setDate(date);
        testService.createTest(testModel);

        return "redirect:/test";
    }

    @RequestMapping("test/edit/{imei}")
    public String editPhone(Model model, @PathVariable(name = "imei") Long imei) {
        TestModel testModel = testService.testByImei(imei);
        model.addAttribute("test", testModel);

        return "editTest";
    }

    @RequestMapping(value = "test/update/{imei}", method = RequestMethod.POST)
    public String updatePhone(@PathVariable(name = "imei") Long imei, @ModelAttribute("test") TestModel testModel) {
        testService.updateTest(testModel, imei);

        return "redirect:/test";
    }

}
