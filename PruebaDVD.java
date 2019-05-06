//esto es un comentario de una linea




import java.util.Scanner;
public class PruebaDVD
{
    public static void main(){
        DVD miDvd = new DVD(10);
        String autor, titulo;
        Scanner leer = new Scanner(System.in);
        Cancion nueva;
        
        for(int i=0; i < 2; i++)
        {
            System.out.println("Dame el titulo de la cancion: ");
            titulo = leer.nextLine();
            System.out.println("Dame el autor de la cancion: ");
            autor = leer.nextLine();
            
            nueva = new Cancion(titulo, autor);
            miDvd.agrega(nueva);
        }
        
        System.out.print("\n\n\n");
        
        for(int i=0; i < 2; i++)
        {
            nueva = miDvd.dameCancion(i);
            System.out.println("Titulo: "+nueva.dameTitulo());
            System.out.println("Autor: "+nueva.dameAutor());
        }
    }  
}                                                                                                                            