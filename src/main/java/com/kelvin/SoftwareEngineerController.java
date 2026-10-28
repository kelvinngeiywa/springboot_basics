package com.kelvin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers()
    {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Kelvin",
                        "Java,springboot"
                ),
                new SoftwareEngineer(
                        2,
                        "Korir",
                        "C#,dotnet"
                ),
                new SoftwareEngineer(
                        3,
                        "Ngeiywa",
                        "Typescript,Angular, nodejs"
                )
        );
    }
}
