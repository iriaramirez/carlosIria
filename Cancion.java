//HolaKtal


public class Cancion
{
    //Definicion de atributos
    public String titulo;
    private String autor;
    
    //Constructor por defecto
    public Cancion()
    {
    }
    
    //Constuctor con todos los parametros
    public Cancion(String titulo, String autor)
    {
        this.titulo=titulo;
        this.autor=autor;
    }
    
    
    //Metodo que devuelve el titulo de la cancion
    public String dameTitulo()
    {
        return titulo;
    }
    
    //Metodo que que devuelve el autor de la cancion
    public String dameAutora()
    {
        return autor;
    }
    
    //Metodo que establece el titulo de la cancion
    public void ponTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    
    //Metodo que establece el autor de la cancion
    public void ponAutor(String autor)
    {
        this.autor=autora;
    }
}
