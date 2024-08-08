package com.mnunes.hr.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Table(name = "countries")
public class CountryEntity {

    @Id
    @Column(name = "country_id")
    private String id;

    @Column(name = "country_name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "region_id")
    private RegionEntity region;
}
