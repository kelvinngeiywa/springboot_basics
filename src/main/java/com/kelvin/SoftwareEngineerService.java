package com.kelvin;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers(){
        return softwareEngineerRepository.findAll();
    }

    public String insertSoftwareEngineer(SoftwareEngineer newEngineer)
    {
        softwareEngineerRepository.save(newEngineer);
        return "Software Engineer added";
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id){
        return softwareEngineerRepository.findById(id).orElseThrow(()->new IllegalStateException(id + " not found"));
    }

    public String updateSoftwareEngineer(Integer id, SoftwareEngineer updatedEngineer){
        SoftwareEngineer existingEngineer= softwareEngineerRepository.findById(id).orElseThrow(()->new IllegalStateException(id + " not found"));

        existingEngineer.setName(updatedEngineer.getName());
        existingEngineer.setTechStack(updatedEngineer.getTechStack());

        softwareEngineerRepository.save(existingEngineer);
        return "Software Engineer updated successfully!!";

    }

    public String DeleteSoftwareEngineer(Integer id){
        if(!softwareEngineerRepository.existsById(id)){
            return "Product with id "+ id + " not found";

        }
        softwareEngineerRepository.deleteById(id);
        return "Software engineer with id " + id +" deleted successfully!!";
    }
}
