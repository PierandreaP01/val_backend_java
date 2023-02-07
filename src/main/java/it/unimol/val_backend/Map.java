package it.unimol.val_backend;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Entity
public class Map {
    @Id @GeneratedValue
    private Integer id;
    private String name;
    private String imgUrl;

    public Map() { };

    public Map(Integer id, String name, String imgUrl) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
    }
}

