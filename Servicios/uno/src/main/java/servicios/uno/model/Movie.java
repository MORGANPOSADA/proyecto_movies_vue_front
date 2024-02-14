package servicios.uno.model;
import jakarta.persistence.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {

    private @Id @GeneratedValue Long id;
    private String name;
    private String director;
    @Lob
    private byte[] imagen;
    @ElementCollection
    private List<String> categorias;

    public Movie() {
        categorias = new ArrayList<>();
        categorias.add("Terror");
        categorias.add("Fantasia");
        categorias.add("Romantico");
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public byte[] getImagen() {return imagen;}
    public void setImagen(byte[] imagen) {this.imagen = imagen;}
    public List<String> getCategorias() {return categorias;}
    public void setCategorias(List<String> categorias) {this.categorias = categorias;}

}