package ru.itis.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.demo.dto.TechDTO;
import ru.itis.demo.services.interfaces.TechService;

import java.util.List;

@RestController
@RequestMapping("api/tech")
@CrossOrigin(origins = "http://localhost:3000")
public class TechRestController {
    @Autowired
    public TechService techService;

    @GetMapping
    public List<TechDTO> list() {
        return techService.getList();
    }
}
