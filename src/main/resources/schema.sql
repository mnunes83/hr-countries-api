drop table if exists regions;
drop table if exists countries;

create table regions (
  region_id INT NOT NULL AUTO_INCREMENT,
  region_name varchar(25) not null,
  PRIMARY KEY ( region_id )
);

CREATE TABLE countries (
  country_id  CHAR(2)  NOT NULL ,
  country_name VARCHAR(40) NOT NULL,
  region_id INT NOT NULL,
  PRIMARY KEY (country_id),

  CONSTRAINT countries_regions_region_id
      FOREIGN KEY (region_id)
      REFERENCES regions(region_id)
);

