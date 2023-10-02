package com.crud.crud.Servies;

import com.crud.crud.Entities.DemoEntity;
import com.crud.crud.Repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemoService {

    @Autowired
    DemoRepository demoRepository;

    public List<DemoEntity> index() {
        return demoRepository.findAll();
    }

    public Optional search(Long id) {
        return demoRepository.findById(id);
    }

    public String store(DemoEntity dm) {
//        System.out.println("dm : "+ dm.getName());
        demoRepository.save(dm);
        return "Success";
    }
}
