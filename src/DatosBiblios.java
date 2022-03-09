/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RANDY
 */
public class DatosBiblios {
    private String Autor;
    private String Titulo;
    private String Año;
    private String PalabrasClave;
    private String Descripcion;
    private String Temas;
    private String Edicion;
    private String Area;
    private String Copias;
    private String Categoria;
    private String Disponibles;
    private String ISBN; 
    private String tipo;
    
    
    public DatosBiblios(String Autor, String Titulo, String Año, String PalabrasClave, String Descripcion, 
            String Temas, String Edicion, String Area, String Copias, String Categoria, String Disponibles, String ISBN, String tipo ){
           
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Año = Año;
        this.PalabrasClave = PalabrasClave;
        this.Descripcion = Descripcion;
        this.Temas = Temas;
        this.Edicion = Edicion;
        this.Area = Area;
        this.Copias = Copias;
        this.Categoria = Categoria;
        this.Disponibles = Disponibles;
        this.ISBN = ISBN;
        this.tipo= tipo;
        
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Año
     */
    public String getAño() {
        return Año;
    }

    /**
     * @param Año the Año to set
     */
    public void setAño(String Año) {
        this.Año = Año;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Edicion
     */
    public String getEdicion() {
        return Edicion;
    }

    /**
     * @param Edicion the Edicion to set
     */
    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    /**
     * @return the PalabrasClave
     */
    public String getPalabrasClave() {
        return PalabrasClave;
    }

    /**
     * @param PalabrasClave the PalabrasClave to set
     */
    public void setPalabrasClave(String PalabrasClave) {
        this.PalabrasClave = PalabrasClave;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Temas
     */
    public String getTemas() {
        return Temas;
    }

    /**
     * @param Temas the Temas to set
     */
    public void setTemas(String Temas) {
        this.Temas = Temas;
    }

    /**
     * @return the Copias
     */
    public String getCopias() {
        return Copias;
    }

    /**
     * @param Copias the Copias to set
     */
    public void setCopias(String Copias) {
        this.Copias = Copias;
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return the Area
     */
    public String getArea() {
        return Area;
    }

    /**
     * @param Area the Area to set
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * @return the Disponibles
     */
    public String getDisponibles() {
        return Disponibles;
    }

    /**
     * @param Disponibles the Disponibles to set
     */
    public void setDisponibles(String Disponibles) {
        this.Disponibles = Disponibles;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
