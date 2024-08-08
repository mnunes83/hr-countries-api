package com.mnunes.hr.controller;

import com.mnunes.hr.entities.CountryEntity;
import com.mnunes.hr.entities.RegionEntity;
import com.mnunes.hr.service.CountryService;
import com.mnunes.hr.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ResponseEntity<List<CountryEntity>> list() {

        List<CountryEntity> countries = countryService.list();

        return ResponseEntity.ok(countries);
    }

    @GetMapping("/{countryId}")
    public ResponseEntity<CountryEntity> getCountryById(@PathVariable("countryId") String countryId) {

        CountryEntity country = countryService.getById(countryId);

        return ResponseEntity.ok(country);
    }

    @GetMapping("/{countryId}/regions")
    public ResponseEntity<CountryEntity> getCountryWithRegionByCountryId(@PathVariable("countryId") String countryId) {

        CountryEntity country = countryService.getById(countryId);

        return ResponseEntity.ok(country);
    }

}
