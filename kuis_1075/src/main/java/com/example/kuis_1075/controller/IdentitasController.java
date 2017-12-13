/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1075.controller;

import com.example.kuis_1075.entity.Identitas;
import com.example.kuis_1075.service.IdentitasService;
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
@RequestMapping("/identitas")
public class IdentitasController {
    @Autowired
    private IdentitasService identitasService;

    @RequestMapping(method = RequestMethod.POST)
    public Identitas insert(@RequestBody Identitas identitas) {
        return identitasService.insert(identitas);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Identitas update(@RequestBody Identitas identitas) {
        return identitasService.update(identitas);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_identitas}")
    public boolean delete(@PathVariable("id_identitas") Long id_identitas) {
        return identitasService.delete(id_identitas);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_identitas}")
    public Identitas getById(@PathVariable("id_identitas") Long id_identitas){
        return identitasService.getById(id_identitas);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Identitas> getAll(){
        return identitasService.getAll();
    }
}
