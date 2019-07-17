package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.core.Profile;
import com.tw.apistackbase.reposiory.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyResource {

    @Autowired
    CompanyRepository companyRepository;
    
    @GetMapping(produces = {"application/json"})
    public List<Company> list() {
        return companyRepository.findAll();
    }
    
    @PostMapping(produces = {"application/json"})
    public void add(@RequestBody Company company) {
        companyRepository.save(company);
    }

    @PutMapping(produces = {"application/json"})
    public void update(@RequestBody Company company){
        companyRepository.save(company);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        companyRepository.deleteById((id));
    }

    @DeleteMapping(produces = {"application/json"})
    public void deleteAll(){
        companyRepository.deleteAll();
    }

}
