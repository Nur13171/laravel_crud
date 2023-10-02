package com.crud.crud.Controllers;

import com.crud.crud.Entities.DemoEntity;
import com.crud.crud.Servies.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/index")
    public List<DemoEntity> index(){
        return demoService.index();
    }

    @GetMapping("/search/{id}")
    public Optional store(@PathVariable Long id){
        return demoService.search(id);
    }

    @PostMapping("/store")
    public String store(@RequestBody DemoEntity dm){
        return demoService.store(dm);
    }
}
