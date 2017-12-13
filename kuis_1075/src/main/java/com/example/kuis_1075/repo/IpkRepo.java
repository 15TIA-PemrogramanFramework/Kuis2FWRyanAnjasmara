/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1075.repo;

import com.example.kuis_1075.entity.Ipk;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author PC24
 */
public interface IpkRepo extends CrudRepository<Ipk, Long> {
    @Query("select ip from Ipk ip")
    public List<Ipk> findAllIpk();
}
