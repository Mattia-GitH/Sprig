package com.PhoneReport.Sprig.controller;

import com.PhoneReport.Sprig.model.PhoneModel;
import com.PhoneReport.Sprig.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PhoneController {

    private final PhoneService phoneService;

    @Autowired
    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @RequestMapping("phones")
    public String phoneList(Model model){
        List<PhoneModel> phoneModels = phoneService.listPhones();
        model.addAttribute("phoneList", phoneModels);

        return "redirect:/phones";
    }

    @RequestMapping("/create_phone")
    public String addPhone(Model model){
        PhoneModel phoneModel = new PhoneModel();
        model.addAttribute("phone",phoneModel);

        return "newPhone";
    }

    @RequestMapping(value = "/save_phone", method = RequestMethod.POST)
    public String savePhone(@ModelAttribute("phone") PhoneModel phoneModel){
        phoneService.createPhone(phoneModel);

        return "redirect:/phones";
    }

    @RequestMapping("phone/edit/{imei}")
    public String editPhone(Model model, @PathVariable(name = "imei") Long imei) {
        PhoneModel phoneModel = phoneService.phoneByImei(imei);
        model.addAttribute("phone", phoneModel);

        return "editPhone";
    }

    @RequestMapping(value = "phone/update/{imei}", method = RequestMethod.POST)
    public String updatePhone(@PathVariable(name = "imei") Long imei, @ModelAttribute("phone") PhoneModel phoneModel) {
        phoneService.updatePhone(phoneModel, imei);

        return "redirect:/phones";
    }

    @RequestMapping(value="phone/delete/{imei}",method = RequestMethod.GET)
    public String delete(@PathVariable Long imei){
        phoneService.delete(imei);
        return "redirect:/phones";
    }

}
