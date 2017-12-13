/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1075.service;

import com.example.kuis_1075.entity.Ipk;
import com.example.kuis_1075.repo.IpkRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC24
 */
@Service("IpkService")
@Transactional
public class IpkService {
    @Autowired
    private IpkRepo repo;

    public Ipk insert(Ipk ipk) {
        return repo.save(ipk);
    }
    
    public Ipk update(Ipk ipk) {
        return repo.save(ipk);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Ipk getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Ipk> getAll(){
        return repo.findAllIpk();
    }
}
