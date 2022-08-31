/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author ALEX
 */
public class Tablero {
    private int tamaño;
    private Ficha [][]Tablero2;
    private String TipoJuego;
    private String primerColor;
    private String segundoColor;
    private String descripcion;
    private Ficha oFicha;
    private ArrayList<Ficha> oListaFichasNegras;
    private ArrayList<Ficha> oListaFichasBlancas;

    public Tablero() {
        this.tamaño = 8;
        this.Tablero2 = new Ficha[tamaño][tamaño];
        this.oListaFichasBlancas = new ArrayList<>(16);
        this.oListaFichasNegras = new ArrayList<>(16);
        this.primerColor = "BLANCO";
        this.segundoColor = "NEGRO";
    
        crearTablero();
        crearFichas();
        colocarFichas();
    }

    public Tablero(String TipoJuego, String color, ArrayList<Ficha> oListaFichasNegras, ArrayList<Ficha> oListaFichasBlancas) {
        this.TipoJuego = TipoJuego;
        this.oListaFichasNegras = oListaFichasNegras;
        this.oListaFichasBlancas = oListaFichasBlancas;
        this.oListaFichasBlancas = new ArrayList<>(24);
        this.oListaFichasNegras = new ArrayList<>(24);
        
    }

    private void crearFichas(){
        String Reyna = "REYNA", Rey = "REY", Caballo = "CABALLO", Alfil = "ALFIL", Torre = "TORRE", Peon = "PEON";
        String abreviatura="";
        
        //CREANDO REYNAS
        oFicha = new Ficha(Reyna,abreviatura, "NEGRA", null, null);
        this.oListaFichasNegras.add(oFicha);
        oFicha = new Ficha(Reyna,abreviatura, "BLANCA", null, null);
        this.oListaFichasBlancas.add(oFicha);
        
        //CREANDO REYES
        oFicha = new Ficha(Rey, abreviatura, "NEGRO", null, null);
        this.oListaFichasNegras.add(oFicha);
        oFicha = new Ficha(Rey, abreviatura, "BLANCO", null, null);
        this.oListaFichasBlancas.add(oFicha);
        
        for (int i = 0; i < 2; i++) {
            //CREANDO TORRES
            oFicha = new Ficha(Torre, abreviatura, "NEGRA", null, null);
            this.oListaFichasNegras.add(oFicha);
            oFicha = new Ficha(Torre,abreviatura, "BLANCA", null, null);
            this.oListaFichasBlancas.add(oFicha);
            
            //CREANDO CABALLOS
            oFicha = new Ficha(Caballo, abreviatura, "NEGRO", null, null);
            this.oListaFichasNegras.add(oFicha);
            oFicha = new Ficha(Caballo, abreviatura, "BLANCO", null, null);
            this.oListaFichasBlancas.add(oFicha);
            
            //CREANDO ALFILS
            oFicha = new Ficha(Alfil, abreviatura, "NEGRO", null, null);
            this.oListaFichasNegras.add(oFicha);
            oFicha = new Ficha(Alfil, abreviatura, "BLANCO", null, null);
            this.oListaFichasBlancas.add(oFicha);
        }

        for (int i = 0; i < 8; i++) {
            //CREANDO PEONES
            oFicha = new Ficha(Peon, abreviatura, "NEGRO", null, null);
            this.oListaFichasNegras.add(oFicha);
            oFicha = new Ficha(Peon, abreviatura, "BLANCO", null, null);
            this.oListaFichasBlancas.add(oFicha);
        }
        
        agregarAbreviaturas();
        agregarPosiciones();
    }
    
    private void agregarPosiciones(){
        //AGREGANDO POSICIONES A LAS FICHAS NEGRAS
        oListaFichasNegras.get(0).setoPosicion(new Posicion(0, 3, true));   //REYNA NEGRA
        oListaFichasNegras.get(1).setoPosicion(new Posicion(0, 4, true));   //REY NEGRO
        oListaFichasNegras.get(2).setoPosicion(new Posicion(0, 0, true));   //TORRE NEGRA 1
        oListaFichasNegras.get(3).setoPosicion(new Posicion(0, 1, true));   //CABALLO NEGRO 1
        oListaFichasNegras.get(4).setoPosicion(new Posicion(0, 2, true));   //ALFIL NEGRO 1 
        oListaFichasNegras.get(5).setoPosicion(new Posicion(0, 7, true));   //TORRE NEGRO 2
        oListaFichasNegras.get(6).setoPosicion(new Posicion(0, 6, true));   //CABALLO NEGRO 2
        oListaFichasNegras.get(7).setoPosicion(new Posicion(0, 5, true));   //ALFIL NEGRO 2
        oListaFichasNegras.get(8).setoPosicion(new Posicion(1, 0, true));   //PEON NEGRO 1
        oListaFichasNegras.get(9).setoPosicion(new Posicion(1, 1, true));   //PEON NEGRO 2
        oListaFichasNegras.get(10).setoPosicion(new Posicion(1, 2, true));  //PEON NEGRO 3
        oListaFichasNegras.get(11).setoPosicion(new Posicion(1, 3, true));  //PEON NEGRO 4
        oListaFichasNegras.get(12).setoPosicion(new Posicion(1, 4, true));  //PEON NEGRO 5
        oListaFichasNegras.get(13).setoPosicion(new Posicion(1, 5, true));  //PEON NEGRO 6
        oListaFichasNegras.get(14).setoPosicion(new Posicion(1, 6, true));  //PEON NEGRO 7
        oListaFichasNegras.get(15).setoPosicion(new Posicion(1, 7, true));  //PEON NEGRO 8

        //AGREGANDO POSICIONES A LAS FICHAS BLANCAS        
        oListaFichasBlancas.get(0).setoPosicion(new Posicion(7, 3, true));   //REYNA BLANCO
        oListaFichasBlancas.get(1).setoPosicion(new Posicion(7, 4, true));   //REY BLANCO
        oListaFichasBlancas.get(2).setoPosicion(new Posicion(7, 0, true));   //TORRE BLANCO 1
        oListaFichasBlancas.get(3).setoPosicion(new Posicion(7, 1, true));   //CABALLO BLANCO 1
        oListaFichasBlancas.get(4).setoPosicion(new Posicion(7, 2, true));   //ALFIL BLANCO 1 
        oListaFichasBlancas.get(5).setoPosicion(new Posicion(7, 7, true));   //TORRE BLANCO 2
        oListaFichasBlancas.get(5).setoPosicion(new Posicion(7, 7, true));   //TORRE BLANCO 2
        oListaFichasBlancas.get(6).setoPosicion(new Posicion(7, 6, true));   //CABALLO BLANCO 2
        oListaFichasBlancas.get(7).setoPosicion(new Posicion(4, 5, true));   //ALFIL BLANCO 2
        oListaFichasBlancas.get(8).setoPosicion(new Posicion(6, 0, true));   //PEON BLANCO 1
        oListaFichasBlancas.get(9).setoPosicion(new Posicion(6, 1, true));   //PEON BLANCO 2
        oListaFichasBlancas.get(10).setoPosicion(new Posicion(6, 2, true));  //PEON BLANCO 3
        oListaFichasBlancas.get(11).setoPosicion(new Posicion(6, 3, true));  //PEON BLANCO 4
        oListaFichasBlancas.get(12).setoPosicion(new Posicion(6, 4, true));  //PEON BLANCO 5
        oListaFichasBlancas.get(13).setoPosicion(new Posicion(6, 5, true));  //PEON BLANCO 6
        oListaFichasBlancas.get(14).setoPosicion(new Posicion(6, 6, true));  //PEON BLANCO 7
        oListaFichasBlancas.get(15).setoPosicion(new Posicion(6, 7, true));  //PEON BLANCO 8
    }
    
    private void agregarAbreviaturas(){
        //AGREGANDO ABREVIATURAS A LAS FICHAS NEGRAS
        oListaFichasNegras.get(0).setAbreviatura("RAN");   //REYNA NEGRA
        oListaFichasNegras.get(1).setAbreviatura("REN");   //REY NEGRO
        oListaFichasNegras.get(2).setAbreviatura("TN1");   //TORRE NEGRA 1
        oListaFichasNegras.get(3).setAbreviatura("CN1");   //CABALLO NEGRO 1
        oListaFichasNegras.get(4).setAbreviatura("AN1");   //ALFIL NEGRO 1 
        oListaFichasNegras.get(5).setAbreviatura("TN2");   //TORRE NEGRO 2
        oListaFichasNegras.get(6).setAbreviatura("CN2");   //CABALLO NEGRO 2
        oListaFichasNegras.get(7).setAbreviatura("AN2");   //ALFIL NEGRO 2
        oListaFichasNegras.get(8).setAbreviatura("PN1");   //PEON NEGRO 1
        oListaFichasNegras.get(9).setAbreviatura("PN2");   //PEON NEGRO 2
        oListaFichasNegras.get(10).setAbreviatura("PN3");  //PEON NEGRO 3
        oListaFichasNegras.get(11).setAbreviatura("PN4");  //PEON NEGRO 4
        oListaFichasNegras.get(12).setAbreviatura("PN5");  //PEON NEGRO 5
        oListaFichasNegras.get(13).setAbreviatura("PN6");  //PEON NEGRO 6
        oListaFichasNegras.get(14).setAbreviatura("PN7");  //PEON NEGRO 7
        oListaFichasNegras.get(15).setAbreviatura("PN8");  //PEON NEGRO 8

        //AGREGANDO ABREVIATURAS A LAS FICHAS BLANCAS        
        oListaFichasBlancas.get(0).setAbreviatura("RAB");   //REYNA BLANCO
        oListaFichasBlancas.get(1).setAbreviatura("REB");   //REY BLANCO
        oListaFichasBlancas.get(2).setAbreviatura("TB1");   //TORRE BLANCO 1
        oListaFichasBlancas.get(3).setAbreviatura("CB1");   //CABALLO BLANCO 1
        oListaFichasBlancas.get(4).setAbreviatura("AB1");   //ALFIL BLANCO 1 
        oListaFichasBlancas.get(5).setAbreviatura("TB2");   //TORRE BLANCO 2
        oListaFichasBlancas.get(6).setAbreviatura("CB2");   //CABALLO BLANCO 2
        oListaFichasBlancas.get(7).setAbreviatura("AB2");   //ALFIL BLANCO 2
        oListaFichasBlancas.get(8).setAbreviatura("PB1");   //PEON BLANCO 1
        oListaFichasBlancas.get(9).setAbreviatura("PB2");   //PEON BLANCO 2
        oListaFichasBlancas.get(10).setAbreviatura("PB3");  //PEON BLANCO 3
        oListaFichasBlancas.get(11).setAbreviatura("PB4");  //PEON BLANCO 4
        oListaFichasBlancas.get(12).setAbreviatura("PB5");  //PEON BLANCO 5
        oListaFichasBlancas.get(13).setAbreviatura("PB6");  //PEON BLANCO 6
        oListaFichasBlancas.get(14).setAbreviatura("PB7");  //PEON BLANCO 7
        oListaFichasBlancas.get(15).setAbreviatura("PB8");  //PEON BLANCO 8
    }
    
    private void crearTablero(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Tablero2[i][j] = new Ficha("VACIO", "   ", new Posicion(i, j, false));
            }
        }
    }
    
    private void colocarFichas(){
        for (int i = 0; i < oListaFichasNegras.size(); i++) {
               int x = oListaFichasNegras.get(i).getoPosicion().getX();
               int y = oListaFichasNegras.get(i).getoPosicion().getY();

               for (int j = 0; j < 8; j++) {
                   for (int k = 0; k < 8; k++) {
                       if (x==j && y == k) {
                           Tablero2[x][y] = oListaFichasNegras.get(i);
                       }
                   }
               }
           }

           for (int i = 0; i < oListaFichasBlancas.size(); i++) {
               int x = oListaFichasBlancas.get(i).getoPosicion().getX();
               int y = oListaFichasBlancas.get(i).getoPosicion().getY();

               for (int j = 0; j < 8; j++) {
                   for (int k = 0; k < 8; k++) {
                       if (x==j && y == k) {
                           Tablero2[x][y] = oListaFichasBlancas.get(i);
                       }
                   }
               }
           }
    }
    
    public void mostrarTablero(){
        System.out.println("");
        System.out.println(" ------------  TABLERO DE AJEDREZ  ----------------");
        System.out.println("");
        System.out.println("   __A__ __B__ __C__ __D__ __E__ __F__ __G__ __H__ ");
        
        for (int i = 0; i < 8; i++) {
            System.out.println("");
            System.out.print((i+1) + " | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(Tablero2[i][j].getAbreviatura()+ " | ");
            }
            System.out.println("");
            System.out.println("   _____ _____ _____ _____ _____ _____ _____ _____");
        }
        System.out.println("");
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Ficha[][] getTablero2() {
        return Tablero2;
    }

    public void setTablero2(Ficha[][] Tablero2) {
        this.Tablero2 = Tablero2;
    }

    public String getTipoJuego() {
        return TipoJuego;
    }

    public void setTipoJuego(String TipoJuego) {
        this.TipoJuego = TipoJuego;
    }

    public String getPrimerColor() {
        return primerColor;
    }

    public void setPrimerColor(String primerColor) {
        this.primerColor = primerColor;
    }

    public String getSegundoColor() {
        return segundoColor;
    }

    public void setSegundoColor(String segundoColor) {
        this.segundoColor = segundoColor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Ficha getoFicha() {
        return oFicha;
    }

    public void setoFicha(Ficha oFicha) {
        this.oFicha = oFicha;
    }

    public ArrayList<Ficha> getoListaFichasNegras() {
        return oListaFichasNegras;
    }

    public void setoListaFichasNegras(ArrayList<Ficha> oListaFichasNegras) {
        this.oListaFichasNegras = oListaFichasNegras;
    }

    public ArrayList<Ficha> getoListaFichasBlancas() {
        return oListaFichasBlancas;
    }

    public void setoListaFichasBlancas(ArrayList<Ficha> oListaFichasBlancas) {
        this.oListaFichasBlancas = oListaFichasBlancas;
    }
   
}
