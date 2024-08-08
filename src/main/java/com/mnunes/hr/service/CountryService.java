package com.mnunes.hr.service;

import com.mnunes.hr.entities.CountryEntity;
import com.mnunes.hr.entities.RegionEntity;
import com.mnunes.hr.exception.NotFoundException;
import com.mnunes.hr.repository.CountryRepository;
import com.mnunes.hr.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional(readOnly = true)
    public CountryEntity getById(String countryId) {

        return countryRepository.findById(countryId).orElseThrow(() ->
                new NotFoundException("País não encontrado com o id " + countryId));
    }

    @Transactional(readOnly = true)
    public List<CountryEntity> list() {
        return countryRepository.findAll();
    }

}
