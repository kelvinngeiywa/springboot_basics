package com.kelvin;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/software-engineers")
public class SoftwareEngineerController {
    private final SoftwareEngineerService softwareEngineerServices;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerServices){
        this.softwareEngineerServices=softwareEngineerServices;
    }

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers()
    {
       return softwareEngineerServices.getAllSoftwareEngineers();
    }

    @PostMapping
    public String addNewSoftwareEngineer(@RequestBody SoftwareEngineer engineer)
    {
        return softwareEngineerServices.insertSoftwareEngineer(engineer);

    }
    @GetMapping("{id}")
    public SoftwareEngineer getSoftwareEngineerById(@PathVariable Integer id){
        return softwareEngineerServices.getSoftwareEngineerById(id);
    }

    @PutMapping("{id}")
    public String updatedSoftwareEngineer(@PathVariable Integer id, @RequestBody SoftwareEngineer updatedEngineer){
        return softwareEngineerServices.updateSoftwareEngineer(id,updatedEngineer);

    }

    @DeleteMapping("{id}")
    public String deleteSoftwareEngineer(@PathVariable Integer id){
        return softwareEngineerServices.DeleteSoftwareEngineer(id);
    }
}
