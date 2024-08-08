package com.mnunes.hr.service;

import com.mnunes.hr.entities.RegionEntity;
import com.mnunes.hr.exception.NotFoundException;
import com.mnunes.hr.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Transactional(readOnly = true)
    public RegionEntity getById(Integer id) {

       return regionRepository.findById(id).orElseThrow(() ->
               new NotFoundException("Região não encontrada com o id " +id));
    }

    @Transactional(readOnly = true)
    public List<RegionEntity> list() {
        return regionRepository.findAll();
    }

}
