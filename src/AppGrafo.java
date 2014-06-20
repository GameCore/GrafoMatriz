
public class AppGrafo {
    
    public static void main(String [] tumama){
    
        GrafoMatriz grafo = new GrafoMatriz(7);
        
        grafo.nuevoVertice("a");
        grafo.nuevoVertice("b");
        grafo.nuevoVertice("c");       
        grafo.nuevoVertice("d");
        grafo.nuevoVertice("h");
        grafo.nuevoVertice("r");
        grafo.nuevoVertice("t");
    

        try{
;
        grafo.nuevoArco("b", "h");
        grafo.nuevoArco("c", "r");
        grafo.nuevoArco("d", "b");
        grafo.nuevoArco("d", "c");
        grafo.nuevoArco("h", "a");
        grafo.nuevoArco("h", "d");
        grafo.nuevoArco("h", "t");
        grafo.recorrerAnchura(grafo, "d");
        
        }        
        catch(Exception e){
        System.out.println(e.getMessage());
        }
        
        grafo.mostrarGrafo();
        
        GrafoMatriz grafo2 = new GrafoMatriz(5);
        grafo2.nuevoVertice("Alicante");
        grafo2.nuevoVertice("Barcelona");
        grafo2.nuevoVertice("Cartajena");       
        grafo2.nuevoVertice("Murcia");
        grafo2.nuevoVertice("Reus");
     
       try{ 
        grafo2.nuevoArco("Murcia", "Alicante", 5);
        grafo2.nuevoArco("Alicante", "Barcelona", 4);
        grafo2.nuevoArco("Alicante", "Cartajena", 5);
        grafo2.nuevoArco("Barcelona", "Cartajena", 3);
        grafo2.nuevoArco("Barcelona", "Murcia", 6);
        grafo2.nuevoArco("Barcelona", "Reus", 3);
        grafo2.nuevoArco("Cartajena", "Alicante", 3);
        grafo2.nuevoArco("Murcia", "Barcelona", 2);
        grafo2.nuevoArco("Reus", "Barcelona", 1);
        grafo2.recorrerAnchura(grafo2, "Reus");
       }catch(Exception e){
       System.out.println(e.getMessage());
       }
       
       grafo2.mostrarGrafo();
       

        
        
        
        
    }
    
}
