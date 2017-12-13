/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1075.controller;

import com.example.kuis_1075.entity.Ipk;
import com.example.kuis_1075.service.IpkService;
import com.example.kuis_1075.service.IpkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC24
 */
@RestController
@RequestMapping("/ipk")
public class IpkController {
    @Autowired
    private IpkService ipkService;

    @RequestMapping(method = RequestMethod.POST)
    public Ipk insert(@RequestBody Ipk ipk) {
        return ipkService.insert(ipk);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Ipk update(@RequestBody Ipk ipk) {
        return ipkService.update(ipk);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_ipk}")
    public boolean delete(@PathVariable("id_ipk") Long id_ipk) {
        return ipkService.delete(id_ipk);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_ipk}")
    public Ipk getById(@PathVariable("id_ipk") Long id_ipk){
        return ipkService.getById(id_ipk);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Ipk> getAll(){
        return ipkService.getAll();
    }
}
