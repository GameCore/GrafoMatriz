/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class ColaLista
{
protected Nodo frente;
protected Nodo fin;
// constructor: crea cola vacía
public ColaLista()
{
frente = fin = null;
}
// insertar: pone elemento por el final
public void insertar(int elemento)
{
Nodo a;
a = new Nodo(elemento);
if (colaVacia())
{
frente = a;
}
else
{
fin.siguiente = a;
}
fin = a;
}
// quitar: sale el elemento frente
public int quitar() throws Exception
{
int aux;
if (!colaVacia())
{
aux = frente.elemento;
frente = frente.siguiente;
}
else
throw new Exception("Eliminar de una cola vacía");
return aux;
}
// libera todos los nodos de la cola
public void borrarCola()
{
for (; frente != null;)
{
frente = frente.siguiente;
}
System.gc();
}
// acceso al primero de la cola
public int frenteCola() throws Exception
{
if (colaVacia())
{
throw new Exception("Error: cola vacía");
}
return (frente.elemento);
}
// verificación del estado de la cola
public boolean colaVacia()
{
return (frente == null);
}

public void mostrarCola(){

    Nodo x;
    x = frente;
    if(colaVacia()){
    System.out.println("La cola esta vacia");
    }
    else{
for(; x!=null; x = x.siguiente){
    System.out.println(x.elemento + " ");
}  
}

}

}
