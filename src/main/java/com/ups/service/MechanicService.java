package com.ups.service;

import com.ups.Model.Mechanic;
import com.ups.Model.MechanicVO;
import com.ups.Repository.MechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dbg1lnb on 10/16/2016.
 */
@Service("mechanicService")
public class MechanicService {

    @Autowired
    private MechanicRepository mechanicRepository ;

    public Mechanic saveMechanic(MechanicVO mechanicVo){
        Mechanic mechanic = new Mechanic();
        mechanic.setMechanicId(mechanicVo.getMechanicId());
        mechanic.setMechanicName(mechanicVo.getMechanicName());
        this.mechanicRepository.save(mechanic);
        return this.mechanicRepository.save(mechanic);
    }

    public List<Mechanic> getMechanics(){
        List<Mechanic> mechList = new ArrayList<>();
        mechList = this.mechanicRepository.findAllMechanics();
        return mechList;
    }

    public void deleteMechanics(String id){
        List<Mechanic> mechList = new ArrayList<>();
        this.mechanicRepository.delete(id);
    }

    public Mechanic getMechanic(String id){
        Mechanic mechanic = this.mechanicRepository.findOne(id);
        return mechanic;
    }
}
