package com.ups.controller;

import com.ups.Model.Mechanic;
import com.ups.Model.MechanicVO;
import com.ups.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by dbg1lnb on 10/15/2016.
 */

@Controller
public class MechanicController extends BaseController {

    @Autowired
    private MechanicService mechanicService ;

    @RequestMapping(value="/addMechanic", method = RequestMethod.GET)
    public String addMechanic() {
        return "addMechanic";
    }

    @RequestMapping(value="/saveMechanic", method = RequestMethod.POST)
    public @ResponseBody String saveMechanic(@RequestBody MechanicVO mechanicVO) {
        HashMap<String, Object> jsonForstratup = new HashMap<String, Object>();
        mechanicService.saveMechanic(mechanicVO);
        jsonForstratup.put("success", true);
        return getResponse(jsonForstratup);
    }

    @RequestMapping(value="/allMechanic", method = RequestMethod.GET)
    public ModelAndView allMechanic() {
        List<Mechanic> mechanic = mechanicService.getMechanics();
        ModelAndView model = new ModelAndView("allMechanics");
        model.addObject("mechanicList", mechanic);
        return model;
    }

    @RequestMapping(value="/deleteMechanic/{id}", method = RequestMethod.GET)
    public @ResponseBody String deleteMechanic(@PathVariable String id) {
        mechanicService.deleteMechanics(id);
        return "Mechanic having Id "+id+ " deleted successfully";
    }

    @RequestMapping(value="/getMechanic/{id}", method = RequestMethod.GET)
    public @ResponseBody String getMechanic(@PathVariable String id) {
        Mechanic mechanic = mechanicService.getMechanic(id);
        return getResponse(mechanic);
    }


}
