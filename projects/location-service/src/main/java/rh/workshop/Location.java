package rh.workshop;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Location extends PanacheEntity {

    public Long id;
    public String name, type, lat, lng;
    public Integer status;

    public static List<Location> findByType(String type){
        return find("type", type).list();
    }


}

