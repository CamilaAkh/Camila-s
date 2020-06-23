package homework17;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

public class Book implements Serializable {

    private String name;
    private String autor;
    private int year;

    public Book(){
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "autor")
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @XmlElement(name = "year")
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

}

