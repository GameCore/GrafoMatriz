/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */   
    public class GrafoMatriz
{
private int numVerts;
private static int MaxVerts;
private Vertice [] verts;
private int [][] matAd;
private int CLAVE =-1;

public GrafoMatriz()
{
    MaxVerts=20;
}
public GrafoMatriz(int mx)
{
matAd = new int [mx][mx];
verts = new Vertice[mx];
for (int i = 0; i < mx; i++)
for (int j = 0; i < mx; i++)
matAd[i][j] = 0;
numVerts = 0;
}

public int numeroDeVertices(){
return numVerts;
}

public void nuevoVertice (String nom)
{
boolean esta = numVertice(nom) >= 0;
if (!esta)
{
Vertice v = new Vertice(nom);
v.asigVert(numVerts);
verts[numVerts++] = v;
}
}

public int numVertice(String vs)
{
Vertice v = new Vertice(vs);
boolean encontrado = false;
int i = 0;
for (; (i < numVerts) && !encontrado;)
{
encontrado = verts[i].equals(v);
if (!encontrado) i++ ;
}
return (i < numVerts) ? i : -1 ;
}

public void nuevoArco(String a, String b)throws Exception
{
int va, vb;
va = numVertice(a);
vb = numVertice(b);
if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
matAd[va][vb] = 1;
}


//Arco con peso
public void nuevoArco(String a, String b,int c)throws Exception
{
    
int va, vb, peso;
va = numVertice(a);
vb = numVertice(b);
peso=c;
if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
matAd[va][vb] = peso;
}



public void nuevoArco(int va, int vb)throws Exception
{
if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
matAd[va][vb] = 1;
}

public boolean adyacente(String a, String b)throws Exception
{
int va, vb;
va = numVertice(a);
vb = numVertice(b);
if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
return matAd[va][vb] == 1;
}

//Adyacencia con peso
public boolean adyacente(String a, String b,int p)throws Exception
{
int va, vb,peso;
va = numVertice(a);
vb = numVertice(b);
peso=p;
if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
return matAd[va][vb] == peso;
}

public boolean adyacente(int va, int vb)throws Exception
{
if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
return matAd[va][vb] == 1;
}

public 
int[]recorrerAnchura(GrafoMatriz g, String org) throws Exception
{
int w, v;
int [] m;
v = g.numVertice(org);
if (v < 0) throw new Exception("Vértice origen no existe");
ColaLista cola = new ColaLista();
m = new int[g.numeroDeVertices()];
// inicializa los vértices como no marcados
for (int i = 0; i < g.numeroDeVertices(); i++)
m[i] = g.CLAVE;
m[v] = 0; // vértice origen queda marcado
cola.insertar(new Integer(v));
while (! cola.colaVacia())
{
Integer cw;
cw = (Integer) cola.quitar();
w = cw.intValue();
System.out.println("Vértice " + g.verts[w] + "visitado");
// inserta en la cola los adyacentes de w no marcados
for (int u = 0; u < g.numeroDeVertices(); u++)
if ((g.matAd[w][u] == 1) && (m[u] == CLAVE))
{
// se marca vertice u con número de arcos hasta el
m[u] = m[w] + 1;
cola.insertar(new Integer(u));
}
}
return m;
}

public void mostrarGrafo(){
    for(int x=0;x<matAd.length;x++ ){
        for(int y=0;y<matAd[x].length;y++)
    System.out.print("\t " + matAd[x][y]);
    System.out.print("\n");
    
    }

}

    
}
