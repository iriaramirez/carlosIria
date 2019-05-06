public class DVD
{
    //Definicion de la constante de clase
    private static final int tam=15;
    
    //Definicion de atributos
    private Cancion[] canciones;
    private int contador;
    
    //Definicion del constructor. Como el atributo canciones es un array, primero lo hemos declarado y ahora lo creamos
    //cuando lo declaramos solo se almacena en memoria el tamaño necesario para almacenar el puntero al array y lo inicializa a NULL
    //pero hasta que no lo creamos el array no tiene ningun elemento
    public DVD(int totCanciones)
    {
        //primero comprobamos que el total de canciones con las que se crea el DVD no excede el tamaño maximo que puede tener un DV
        if(totCanciones > 1 && totCanciones <= tam)
        {
            canciones=new Cancion[totCanciones];aaaaaaaaaaa
        }
        
        //si el total de canciones no es valido creamos el array con el tamño maximo
        else
        {
            canciones=new Cancion[tam];
        }
    }
    
    //Metodo que devuelve el contador de canciones
    public int numeroCanciones()
    {
        return this.contador;
    }
    
    //Metodo que devuelve la cancion que se encuentra en la posicion indicada en el atributo
    public Cancion dameCancion(int pos)
    {
        //comprobamos que el parametro pos es parte del array
        //Si es parte de la cancion devolvemos el objeto que se encuentra en la posicion indicada
        if(pos>=0 && pos<canciones.length)
        {
            return canciones[pos];
        }
        
        //Si la psosion no es correcta devolvemos null
        return null;
    }
    
    
    //Metodo que cambia la cancion que se encuentra en la psocición indicada por la nueva cancion proporcionada
    public void grabaCancion(int pos, Cancion otra)
    {
        //Comprobamos que el parametro pos es parte del array
        //Si es parte del array grabamos la canción
        if(pos>=0 && pos <canciones.length)
        {
            canciones[pos]=otra;
        }
        
        //Si pos no es parte de la cancion no hacemos nada
    }
    
    //Metodo que agrega una cancion al final del array
    public void agrega(Cancion otra)
    {
        //Primero comprobamos que el array no está lleno
        //Si hay espacio grabamos la cancion en la posicion indicada por el atributo contador
        contador=0;
        if(contador < canciones.length)
        {
            canciones[contador]=otra;
            contador++;
        }
        
        //Si el DVD esta completo no hacemos nada
    }
    
    //Metodo que elimina una cancion
    public void elimina(int pos)
    {
        //Comprobamos que la posicion pertenece al array
        //Si pertenece al array movemos todas las canciones hacia la izquierda
        if(pos >=0 && pos < canciones.length)
        {
            for(int i=pos; i < canciones.length-1; i++)
            {
                canciones[i]=canciones[i+1];
            }
            
            //Despues decrementamos el atributo contador porque hay una cancion menos
            contador--;
            
            //En la posicion que indica contador inroducimos un valor nulo. De esta forma cuando se agrege una nueva canción 
            //Lo hara en la ultima posicion
            canciones[contador]=null;
            
        }
    }
}
