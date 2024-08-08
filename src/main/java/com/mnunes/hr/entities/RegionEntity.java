package com.mnunes.hr.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@ToString
@Table(name = "regions")
public class RegionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private Integer id;

    @Column(name = "region_name")
    private String name;
}
