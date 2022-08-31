
package Entidades;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author ALEX
 */
public class GameAjedrez {
// Creando jugadores
    String Player1, Player2;

// Lista de fichas aun en juego
    ArrayList<Ficha> fichasVivasN, fichasVivasB;
    
// Lista de fichas comidas    
    ArrayList<Ficha> fichasComidasB, fichasComidasN;

// Tablero    
    Tablero oTablero; Ficha[][] Tablero; Posicion oPosicion;
    
// Listas de posibles movimientos    
    ArrayList<Posicion> listaMovimientosB = new ArrayList<>();
    ArrayList<Posicion> listaMovimientosN = new ArrayList<>();
    ArrayList<Posicion> posiblesPeon = new ArrayList<>();
    ArrayList<Posicion> posiblesRey = new ArrayList<>();
    ArrayList<Posicion> posiblesTorre = new ArrayList<>();
    ArrayList<Posicion> posiblesAlfil = new ArrayList<>();
    ArrayList<Posicion> posiblesReyna = new ArrayList<>();
    ArrayList<Posicion> posiblesCaballo = new ArrayList<>();
    
//Constructores
    public GameAjedrez(String Player1,String Player2) {
        oTablero = new Tablero();
        this.Player1 = Player1;
        this.Player2 = Player2;
    }
    
// Funciones y Metodos
    public void asignarFichas(){
        this.fichasVivasB = oTablero.getoListaFichasBlancas();
        this.fichasVivasN = oTablero.getoListaFichasNegras();
        Tablero = oTablero.getTablero2();
    }
    
    private void limpiarListas(String Player){
        if (Player1.equals(Player)) {
            listaMovimientosB.clear();
        }else{
            listaMovimientosN.clear();
        }
        posiblesPeon.clear();
        posiblesRey.clear();
        posiblesTorre.clear();
        posiblesAlfil.clear();
        posiblesReyna.clear();
        posiblesCaballo.clear();
    }
    
    public void Movimientos(String Player){
        mostrarTablero();
        limpiarListas(Player);
        
        if (Player1.equals(Player)) {
            for (int i = 0; i < fichasVivasB.size(); i++) {
                switch(fichasVivasB.get(i).getNombre()){
                    case "REY"      :   posiblesMovimientosRey(fichasVivasB.get(i));
                        break;
                    case "REYNA"    :   posiblesMovimientosReyna(fichasVivasB.get(i));
                        break;
                    case "TORRE"    :   posiblesMovimientosTorre(fichasVivasB.get(i));
                        break;
                    case "ALFIL"    :   posiblesMovimientosAlfil(fichasVivasB.get(i));
                        break;
                    case "CABALLO"  :   posiblesMovimientosCaballo(fichasVivasB.get(i));
                        break;
                    case "PEON"     :   posiblesMovimientosPeon(fichasVivasB.get(i));
                        break;
                    default:
                        break;
                }
            }
        }else{
            for (int i = 0; i < fichasVivasN.size(); i++) {
                switch(fichasVivasN.get(i).getNombre()){
                    case "REY"      :   posiblesMovimientosRey(fichasVivasN.get(i));
                        break;
                    case "REYNA"    :   posiblesMovimientosReyna(fichasVivasN.get(i));
                        break;
                    case "TORRE"    :   posiblesMovimientosTorre(fichasVivasN.get(i));
                        break;
                    case "ALFIL"    :   posiblesMovimientosAlfil(fichasVivasN.get(i));
                        break;
                    case "CABALLO"  :   posiblesMovimientosCaballo(fichasVivasN.get(i));
                        break;
                    case "PEON"     :   posiblesMovimientosPeon(fichasVivasN.get(i));
                        break;
                    default:
                        break;
                }
            }
        }
        
        if (Player1.equals(Player)) {
            System.out.println(fichasVivasB);
            System.out.println("PEON");
            for (int i = 0; i < posiblesPeon.size(); i++) {
                System.out.print("[ ");
                System.out.print(posiblesPeon.get(i).getX());
                System.out.print(posiblesPeon.get(i).getY());
                System.out.print(posiblesPeon.get(i).getX1());
                System.out.print(posiblesPeon.get(i).getY1());
                System.out.print(" ] ");
                listaMovimientosB.add(posiblesPeon.get(i));
            }
            System.out.println("");
            System.out.println("REY");
            for (int i = 0; i < posiblesRey.size(); i++) {
                System.out.print("[ ");
                System.out.print(posiblesRey.get(i).getX());
                System.out.print(posiblesRey.get(i).getY());
                System.out.print(posiblesRey.get(i).getX1());
                System.out.print(posiblesRey.get(i).getY1());
                System.out.print(" ] ");
                listaMovimientosB.add(posiblesRey.get(i));
            }
            System.out.println("");
            System.out.println("TORRE");
            for (int i = 0; i < posiblesTorre.size(); i++) {
                System.out.print("[ ");
                System.out.print(posiblesTorre.get(i).getX());
                System.out.print(posiblesTorre.get(i).getY());
                System.out.print(posiblesTorre.get(i).getX1());
                System.out.print(posiblesTorre.get(i).getY1());
                System.out.print(" ] ");
                listaMovimientosB.add(posiblesTorre.get(i));
            }
            System.out.println("");
            System.out.println("ALFIL");
            for (int i = 0; i < posiblesAlfil.size(); i++) {
                System.out.print("[ ");
                System.out.print(posiblesAlfil.get(i).getX());
                System.out.print(posiblesAlfil.get(i).getY());
                System.out.print(posiblesAlfil.get(i).getX1());
                System.out.print(posiblesAlfil.get(i).getY1());
                System.out.print(" ] ");
                listaMovimientosB.add(posiblesAlfil.get(i));
            }
            System.out.println("");
            System.out.println("CABALLO");
            for (int i = 0; i < posiblesCaballo.size(); i++) {
                System.out.print("[ ");
                System.out.print(posiblesCaballo.get(i).getX());
                System.out.print(posiblesCaballo.get(i).getY());
                System.out.print(posiblesCaballo.get(i).getX1());
                System.out.print(posiblesCaballo.get(i).getY1());
                System.out.print(" ] ");
                listaMovimientosB.add(posiblesCaballo.get(i));
            }
            System.out.println("");
            System.out.println("REYNA");
            for (int i = 0; i < posiblesReyna.size(); i++) {
                System.out.print("[ ");
                System.out.print(posiblesReyna.get(i).getX());
                System.out.print(posiblesReyna.get(i).getY());
                System.out.print(posiblesReyna.get(i).getX1());
                System.out.print(posiblesReyna.get(i).getY1());
                System.out.print(" ] ");
                listaMovimientosB.add(posiblesReyna.get(i));
            }
            System.out.println("");
        }else{
            System.out.println(fichasVivasN);
            System.out.println("PEON");
            for (int i = 0; i < posiblesPeon.size(); i++) {
                System.out.print(posiblesPeon.get(i).getX());
                System.out.print(posiblesPeon.get(i).getY());
                System.out.print(posiblesPeon.get(i).getX1());
                System.out.print(posiblesPeon.get(i).getY1());
                System.out.print(" - ");
                listaMovimientosN.add(posiblesPeon.get(i));
            }
            System.out.println("REY");
            for (int i = 0; i < posiblesRey.size(); i++) {
                System.out.print(posiblesRey.get(i).getX());
                System.out.print(posiblesRey.get(i).getY());
                System.out.print(posiblesRey.get(i).getX1());
                System.out.print(posiblesRey.get(i).getY1());
                System.out.println("");
                listaMovimientosN.add(posiblesRey.get(i));
            }
            System.out.println("TORRE");
            for (int i = 0; i < posiblesTorre.size(); i++) {
                System.out.print(posiblesTorre.get(i).getX());
                System.out.print(posiblesTorre.get(i).getY());
                System.out.print(posiblesTorre.get(i).getX1());
                System.out.print(posiblesTorre.get(i).getY1());
                System.out.println("");
                listaMovimientosN.add(posiblesTorre.get(i));
            }
            System.out.println("ALFIL");
            for (int i = 0; i < posiblesAlfil.size(); i++) {
                System.out.print(posiblesAlfil.get(i).getX());
                System.out.print(posiblesAlfil.get(i).getY());
                System.out.print(posiblesAlfil.get(i).getX1());
                System.out.print(posiblesAlfil.get(i).getY1());
                System.out.println("");
                listaMovimientosN.add(posiblesAlfil.get(i));
            }
            System.out.println("CABALLO");
            for (int i = 0; i < posiblesCaballo.size(); i++) {
                System.out.print(posiblesCaballo.get(i).getX());
                System.out.print(posiblesCaballo.get(i).getY());
                System.out.print(posiblesCaballo.get(i).getX1());
                System.out.print(posiblesCaballo.get(i).getY1());
                System.out.println("");
                listaMovimientosN.add(posiblesCaballo.get(i));
            }
            System.out.println("REYNA");
            for (int i = 0; i < posiblesReyna.size(); i++) {
                System.out.print(posiblesReyna.get(i).getX());
                System.out.print(posiblesReyna.get(i).getY());
                System.out.print(posiblesReyna.get(i).getX1());
                System.out.print(posiblesReyna.get(i).getY1());
                System.out.println("");
                listaMovimientosN.add(posiblesReyna.get(i));
            }
        }
    }
    
    public void posiblesMovimientosPeon(Ficha oFicha){
        int x = oFicha.getoPosicion().getX();
        int y = oFicha.getoPosicion().getY();

        if ((x==6)) {
            movimientoPeon(1, x-1, y, oFicha);
            movimientoPeon(2, x-2, y, oFicha);

            if (y>=1 && y<=6) {
                movimientoPeon(3, x-1, y-1, oFicha);
                movimientoPeon(3, x-1, y+1, oFicha);
            }
            if (y==0) {
                movimientoPeon(3, x-1, y+1, oFicha);
            }
            if (y==7) {
                movimientoPeon(3, x-1, y-1, oFicha);
            }          
        }else
        if(x>=1){
            movimientoPeon(1, x-1, y, oFicha);
            if (y>=1 && y<=6) {
                movimientoPeon(3, x-1, y-1, oFicha);
                movimientoPeon(3, x-1, y+1, oFicha);
            }
            if (y==0) {
                movimientoPeon(3, x-1, y+1, oFicha);
            }
            if (y==7) {
                movimientoPeon(3, x-1, y+1, oFicha);
            }
        }
    }
    
    public void posiblesMovimientosRey(Ficha oFicha){
        int x = oFicha.getoPosicion().getX();
        int y = oFicha.getoPosicion().getY();
        
        if (x==0) {
            if (y>=1 && y<=6) {
                movimientoRey(1, x+1, y, oFicha);
                movimientoRey(1, x, y-1, oFicha);
                movimientoRey(1, x, y+1, oFicha);
                movimientoRey(1, x+1, y-1, oFicha);
                movimientoRey(1, x+1, y+1, oFicha);
            }
            if (y==0) {
                movimientoRey(1, x+1, y, oFicha);
                movimientoRey(1, x, y+1, oFicha);
                movimientoRey(1, x+1, y+1, oFicha);
            }
            if (y==7) {
                movimientoRey(1, x+1, y, oFicha);
                movimientoRey(1, x, y-1, oFicha);
                movimientoRey(1, x+1, y-1, oFicha);
            }
        }

        if (x==7) {
            if (y>=1 && y<=6) {
                movimientoRey(1, x-1, y, oFicha);
                movimientoRey(1, x-1, y-1, oFicha);
                movimientoRey(1, x-1, y+1, oFicha);
                movimientoRey(1, x, y-1, oFicha);
                movimientoRey(1, x, y+1, oFicha);
            }
            if (y==0) {
                movimientoRey(1, x-1, y, oFicha);
                movimientoRey(1, x-1, y+1, oFicha);
                movimientoRey(1, x, y+1, oFicha);
            }
            if (y==7) {
                movimientoRey(1, x-1, y, oFicha);
                movimientoRey(1, x-1, y-1, oFicha);
                movimientoRey(1, x, y-1, oFicha);
            }
        }
        
        if(x>=1 && x<=6){
            if (y>=1 && y<=6) {
                movimientoRey(1, x-1, y, oFicha);
                movimientoRey(1, x+1, y, oFicha);
                movimientoRey(1, x-1, y-1, oFicha);
                movimientoRey(1, x-1, y+1, oFicha);
                movimientoRey(1, x, y-1, oFicha);
                movimientoRey(1, x, y+1, oFicha);
                movimientoRey(1, x+1, y-1, oFicha);
                movimientoRey(1, x+1, y+1, oFicha);
            }
            if (y==0) {
                movimientoRey(1, x-1, y, oFicha);
                movimientoRey(1, x+1, y, oFicha);
                movimientoRey(1, x-1, y+1, oFicha);
                movimientoRey(1, x, y+1, oFicha);
                movimientoRey(1, x+1, y+1, oFicha);
            }
            if (y==7) {
                movimientoRey(1, x-1, y, oFicha);
                movimientoRey(1, x+1, y, oFicha);
                movimientoRey(1, x-1, y-1, oFicha);
                movimientoRey(1, x, y-1, oFicha);
                movimientoRey(1, x+1, y-1, oFicha);
            }
        }    
    }
    
    public void posiblesMovimientosTorre(Ficha oFicha){
        int x = oFicha.getoPosicion().getX();
        int y = oFicha.getoPosicion().getY();
        
        if (x==0) {
            if (y>=1 && y<=6) {
                movimientoTorre(2, x+1, y, oFicha);
                movimientoTorre(3, x, y-1, oFicha);
                movimientoTorre(4, x, y+1, oFicha);
            }
            if (y==0){
                movimientoTorre(2, x+1, y, oFicha);
                movimientoTorre(4, x, y+1, oFicha);
            }
            if (y==7){
                movimientoTorre(1, x-1, y, oFicha);
                movimientoTorre(4, x, y-1, oFicha);
            }
        }
        
        if (x==7) {
            if (y>=1 && y<=6) {
                movimientoTorre(1, x-1, y, oFicha);
                movimientoTorre(3, x, y-1, oFicha);
                movimientoTorre(4, x, y+1, oFicha);
            }
            if (y==0){
                movimientoTorre(2, x+1, y, oFicha);
                movimientoTorre(4, x, y+1, oFicha);
            }
            if (y==7){
                movimientoTorre(1, x-1, y, oFicha);
                movimientoTorre(2, x+1, y, oFicha);
                movimientoTorre(4, x, y-1, oFicha);
            }
        }

        if (x>=1 && x<=6) {
            if (y>=1 && y<=6) {
                movimientoTorre(1, x-1, y, oFicha);
                movimientoTorre(2, x+1, y, oFicha);
                movimientoTorre(3, x, y-1, oFicha);
                movimientoTorre(4, x, y+1, oFicha);
            }
            if (y==0){
                movimientoTorre(1, x-1, y, oFicha);
                movimientoTorre(2, x+1, y, oFicha);
                movimientoTorre(4, x, y+1, oFicha);
            }
            if (y==7){
                movimientoTorre(1, x-1, y, oFicha);
                movimientoTorre(2, x+1, y, oFicha);
                movimientoTorre(4, x, y-1, oFicha);
            }
        }
    }

    public void posiblesMovimientosAlfil(Ficha oFicha){
        int x = oFicha.getoPosicion().getX();
        int y = oFicha.getoPosicion().getY();
        
        if (x==0) {
            if (y==0){
                movimientoAlfil(1, x+1, y+1, oFicha);
            }
            if (y==7){
                movimientoAlfil(2, x+1, y-1, oFicha);
            }
            if (y>=1 && y<=6) {
                movimientoAlfil(3, x-1, y-1, oFicha);
                movimientoAlfil(4, x-1, y+1, oFicha);
                movimientoAlfil(2, x+1, y-1, oFicha);
                movimientoAlfil(1, x+1, y+1, oFicha);
            }
        }
        
        if (x==7) {
            if (y==0){
                movimientoAlfil(4, x-1, y+1, oFicha);
            }
            if (y==7){
                movimientoAlfil(3, x-1, y-1, oFicha);
            }
            if (y>=1 && y<=6) {
                movimientoAlfil(3, x-1, y-1, oFicha);
                movimientoAlfil(4, x-1, y+1, oFicha);
            }
        }

        if (x>=1 && x<=6) {
            if (y>=1 && y<=6) {
                movimientoAlfil(3, x-1, y-1, oFicha);
                movimientoAlfil(4, x-1, y+1, oFicha);
                movimientoAlfil(2, x+1, y-1, oFicha);
                movimientoAlfil(1, x+1, y+1, oFicha);
            }
            if (y==0){
                movimientoAlfil(4, x-1, y+1, oFicha);
                movimientoAlfil(1, x+1, y+1, oFicha);
            }
            if (y==7){
                movimientoAlfil(3, x-1, y-1, oFicha);
                movimientoAlfil(2, x+1, y-1, oFicha);
            }
        }
    }
    
    public void posiblesMovimientosCaballo(Ficha oFicha){
        int x = oFicha.getoPosicion().getX();
        int y = oFicha.getoPosicion().getY();
        
        if (x==0) {
            if (y==0){
                movimientoCaballo(1, x+1, y+2, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
            }
            if (y==7){
                movimientoCaballo(1, x+1, y-2, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
            }
            if (y==1){
                movimientoCaballo(1, x+1, y+2, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
            }
            if (y==6){
                movimientoCaballo(1, x+1, y-2, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
            }
            if (y>=2 && y<=5) {
                movimientoCaballo(1, x+1, y-2, oFicha);
                movimientoCaballo(1, x+1, y+2, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
            }
        }
        
        if (x==7) {
            if (y==0){
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x-1, y+2, oFicha);
            }
            if (y==7){
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-1, y-2, oFicha);
            }
            if (y==1){
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x-1, y+2, oFicha);
            }
            if (y==6){
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x-1, y-2, oFicha);
            }
            if (y>=2 && y<=5) {
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x-1, y-2, oFicha);
                movimientoCaballo(1, x-1, y+2, oFicha);
            }
        }
        
        if (x==1) {
            if (y==0){
                movimientoCaballo(1, x-1, y+2, oFicha);
                movimientoCaballo(1, x+1, y+2, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
            }
            if (y==7){
                movimientoCaballo(1, x-1, y-2, oFicha);
                movimientoCaballo(1, x+1, y-2, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
            }
            if (y==1){
                movimientoCaballo(1, x-1, y+2, oFicha);
                movimientoCaballo(1, x+1, y+2, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
            }
            if (y==6){
                movimientoCaballo(1, x-1, y-2, oFicha);
                movimientoCaballo(1, x+1, y-2, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
            }
            if (y>=2 && y<=5) {
                movimientoCaballo(1, x-1, y-2, oFicha);
                movimientoCaballo(1, x-1, y+2, oFicha);
                movimientoCaballo(1, x+1, y-2, oFicha);
                movimientoCaballo(1, x+1, y+2, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
            }
        }

        if (x==6) {
            if (y==0){
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x-1, y+2, oFicha);
                movimientoCaballo(1, x+1, y+2, oFicha);
            }
            if (y==7){
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-1, y-2, oFicha);
                movimientoCaballo(1, x+1, y-2, oFicha);
            }
            if (y==1){
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x-1, y+2, oFicha);
                movimientoCaballo(1, x+1, y+2, oFicha);
            }
            if (y==6){
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x-1, y-2, oFicha);
                movimientoCaballo(1, x+1, y-2, oFicha);
            }
            if (y>=2 && y<=5) {
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x-1, y-2, oFicha);
                movimientoCaballo(1, x-1, y+2, oFicha);
                movimientoCaballo(1, x+1, y-2, oFicha);
                movimientoCaballo(1, x+1, y+2, oFicha);
            }
        }

        if (x>=2 && x<=5) {
            if (y==0){
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
                movimientoCaballo(1, x-1, y+2, oFicha);
                movimientoCaballo(1, x+1, y+2, oFicha);
            }
            if (y==7){
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
                movimientoCaballo(1, x-1, y-2, oFicha);
                movimientoCaballo(1, x+1, y-2, oFicha);
            }
            if (y==1){
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
                movimientoCaballo(1, x-1, y+2, oFicha);
                movimientoCaballo(1, x+1, y+2, oFicha);
            }
            if (y==6){
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
                movimientoCaballo(1, x-1, y-2, oFicha);
                movimientoCaballo(1, x+1, y-2, oFicha);
            }
            if (y>=2 && y<=5) {
                movimientoCaballo(1, x-2, y-1, oFicha);
                movimientoCaballo(1, x-2, y+1, oFicha);
                movimientoCaballo(1, x+2, y-1, oFicha);
                movimientoCaballo(1, x+2, y+1, oFicha);
                movimientoCaballo(1, x-1, y-2, oFicha);
                movimientoCaballo(1, x+1, y-2, oFicha);
                movimientoCaballo(1, x-1, y+2, oFicha);
                movimientoCaballo(1, x+1, y+2, oFicha);
            }
        }
    }

    public void posiblesMovimientosReyna(Ficha oFicha){
        int x = oFicha.getoPosicion().getX();
        int y = oFicha.getoPosicion().getY();
        
        posiblesMovimientosTorre(oFicha);
        posiblesMovimientosAlfil(oFicha);
        
    }

//CONDICIONES PARA LOS MOVIMIENTOS DE LAS FICHAS    
    public void movimientoPeon(int opcion,int x, int y, Ficha oFicha){
        int iniX = oFicha.getoPosicion().getX();
        int iniY = oFicha.getoPosicion().getY();   
        
        switch(opcion){
            case 1:
                if(!Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    posiblesPeon.add(new Posicion(iniX, iniY, x, y));
                }
                break;
            case 2:
                if(!Tablero[x+1][y].getoPosicion().isOcupado() && !Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    posiblesPeon.add(new Posicion(iniX, iniY, x, y));
                }
                break;
            case 3:
                if(Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha) && isEnemiga(x,y,oFicha)){
                    posiblesPeon.add(new Posicion(iniX, iniY, x, y));
                }
                break;
            default:
                break;
        }
    }    

    public void movimientoRey(int opcion,int x, int y, Ficha oFicha){
        int iniX = oFicha.getoPosicion().getX();
        int iniY = oFicha.getoPosicion().getY();   

        switch(opcion){
            case 1:
                if(!Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    posiblesRey.add(new Posicion(iniX, iniY, x, y));
                }else if(Tablero[x][y].getoPosicion().isOcupado() && isEnemiga(x,y,oFicha) && !isJaque(oFicha)){
                    posiblesRey.add(new Posicion(iniX, iniY, x, y));
                }
                break;
            default:
                break;
        }
    }    

    public void movimientoTorre(int opcion,int x, int y, Ficha oFicha){
        int iniX = oFicha.getoPosicion().getX();
        int iniY = oFicha.getoPosicion().getY();
        
        switch(opcion){
            case 1:
                while(x>=0 && !Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesTorre.add(new Posicion(iniX, iniY, x, y));
                    }
                    x--;
                }
                if(x>=0 && Tablero[x][y].getoPosicion().isOcupado() && isEnemiga(x,y,oFicha) && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesTorre.add(new Posicion(iniX, iniY, x, y));
                    }
                }
                break;
            case 2:
                while(x<=7 && !Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesTorre.add(new Posicion(iniX, iniY, x, y));
                    }
                    x++;
                }
                if(x<=7 && Tablero[x][y].getoPosicion().isOcupado() && isEnemiga(x,y,oFicha) && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesTorre.add(new Posicion(iniX, iniY, x, y));
                    }
                }
                break;
            case 3:
                while(y>=0 && !Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesTorre.add(new Posicion(iniX, iniY, x, y));
                    }
                    y--;
                }
                if(y>=0 && Tablero[x][y].getoPosicion().isOcupado() && isEnemiga(x,y,oFicha) && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesTorre.add(new Posicion(iniX, iniY, x, y));
                    }
                }
                break;
            case 4:
                while(y<=7 && !Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesTorre.add(new Posicion(iniX, iniY, x, y));
                    }
                    y++;
                }
                if(y<=7 && Tablero[x][y].getoPosicion().isOcupado() && isEnemiga(x,y,oFicha) && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesTorre.add(new Posicion(iniX, iniY, x, y));
                    }
                }
                break;
            default:
                break;
        }
    }    
    
    public void movimientoAlfil(int opcion,int x, int y, Ficha oFicha){
        int iniX = oFicha.getoPosicion().getX();
        int iniY = oFicha.getoPosicion().getY();
        
        switch(opcion){
            case 1:
                while(x<=7 && y<=7 && !Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesAlfil.add(new Posicion(iniX, iniY, x, y));
                    }
                    x++;
                    y++;
                }
                if(x<=7 && y<=7 && Tablero[x][y].getoPosicion().isOcupado() && isEnemiga(x,y,oFicha) && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesAlfil.add(new Posicion(iniX, iniY, x, y));
                    }
                }
                break;
            case 2:
                while(x<=7 && y>=0 && !Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesAlfil.add(new Posicion(iniX, iniY, x, y));
                    }
                    x++;
                    y--;
                }
                if(x<=7 && y>=0 && Tablero[x][y].getoPosicion().isOcupado() && isEnemiga(x,y,oFicha) && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesAlfil.add(new Posicion(iniX, iniY, x, y));
                    }
                }
                break;
            case 3:
                while(x>=0 && y>=0 && !Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesAlfil.add(new Posicion(iniX, iniY, x, y));
                    }
                    x--;
                    y--;
                }
                if(x>=0 && y>=0 && Tablero[x][y].getoPosicion().isOcupado() && isEnemiga(x,y,oFicha) && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesAlfil.add(new Posicion(iniX, iniY, x, y));
                    }
                }
                break;
            case 4:
                while(x>=0 && y<=7 && !Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesAlfil.add(new Posicion(iniX, iniY, x, y));
                    }
                    x--;
                    y++;
                }
                if(x>=0 && y<=7 && Tablero[x][y].getoPosicion().isOcupado() && isEnemiga(x,y,oFicha) && !isJaque(oFicha)){
                    if (oFicha.getNombre().equals("REYNA")) {
                        posiblesReyna.add(new Posicion(iniX, iniY, x, y));
                    }else{
                        posiblesAlfil.add(new Posicion(iniX, iniY, x, y));
                    }
                }
                break;
            default:
                break;
        }
    }    
    
    public void movimientoCaballo(int opcion,int x, int y, Ficha oFicha){
        int iniX = oFicha.getoPosicion().getX();
        int iniY = oFicha.getoPosicion().getY();
        
        switch(opcion){
            case 1:
                if(!Tablero[x][y].getoPosicion().isOcupado() && !isJaque(oFicha)){
                    posiblesCaballo.add(new Posicion(iniX, iniY, x, y));
                }else if(Tablero[x][y].getoPosicion().isOcupado() && isEnemiga(x,y,oFicha) && !isJaque(oFicha)){
                    posiblesCaballo.add(new Posicion(iniX, iniY, x, y));
                }                
                break;
            default:
                break;
        }
    }    
    
    public boolean isJaque(Ficha oFicha){
        
        if (oFicha.getColor().equals("BLANCO") || oFicha.getColor().equals("BLANCA")) {
            for (int i = 0; i < listaMovimientosN.size(); i++) {
                if (fichasVivasB.get(1).getoPosicion().equals(listaMovimientosN.get(i))) {
                    return true;
                }
            }
        }else{
            for (int i = 0; i < listaMovimientosB.size(); i++) {
                if (fichasVivasN.get(1).getoPosicion().equals(listaMovimientosB.get(i))) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean isEnemiga(int x, int y, Ficha oFicha){
        if (oFicha.getColor().equals("BLANCO") || oFicha.getColor().equals("BLANCA")) {
            for (int i = 0; i < fichasVivasN.size(); i++) {
                if (Tablero[x][y].getoPosicion().equals(fichasVivasN.get(i).getoPosicion())) {
                    return true;
                }
            }
        }else {
            for (int i = 0; i < fichasVivasB.size(); i++) {
                if (Tablero[x][y].getoPosicion().equals(fichasVivasB.get(i).getoPosicion())) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public void hacerEnroque(String Player){
        //
        if (Player1.equals(Player)) {
            if (Tablero[7][4].getNombre().equals("REY") && Tablero[7][7].getNombre().equals("TORRE") && Tablero[7][5].getNombre().equals("VACIO") && Tablero[7][6].getNombre().equals("VACIO")) {
                Tablero[7][6]=Tablero[7][4];
                oPosicion = Tablero[7][4].getoPosicion();
                oPosicion.setX(7);
                oPosicion.setY(6);
                oPosicion.setOcupado(true);
                
                Tablero[7][5]=Tablero[7][7];
                oPosicion = Tablero[7][7].getoPosicion();
                oPosicion.setX(7);
                oPosicion.setY(5);
                oPosicion.setOcupado(true);
                
                Tablero[7][4] = new Ficha("VACIO", "   ", new Posicion(7, 4, false));
                Tablero[7][7] = new Ficha("VACIO", "   ", new Posicion(7, 4, false));
                
                mostrarTablero();
            }
        } else {
            if (Tablero[7][4].getNombre().equals("REY") && Tablero[7][7].getNombre().equals("TORRE") && Tablero[7][5].getNombre().equals("VACIO") && Tablero[7][6].getNombre().equals("VACIO")) {
                Tablero[7][6]=Tablero[7][4];
                oPosicion = Tablero[7][4].getoPosicion();
                oPosicion.setX(7);
                oPosicion.setY(6);
                oPosicion.setOcupado(true);
                
                Tablero[7][5]=Tablero[7][7];
                oPosicion = Tablero[7][7].getoPosicion();
                oPosicion.setX(7);
                oPosicion.setY(5);
                oPosicion.setOcupado(true);
                
                Tablero[7][4] = new Ficha("VACIO", "   ", new Posicion(7, 4, false));
                Tablero[7][7] = new Ficha("VACIO", "   ", new Posicion(7, 4, false));
                mostrarTablero();
            }
        }
    }
    
    public void moverFicha(String Player,String movimiento) {
        String mover;
        String Nueva="";
        int x,y,x1,y1;
        
        if (Player1.equals(Player)) {
            for (int i = 0; i < listaMovimientosB.size(); i++) {
                mover = ""+listaMovimientosB.get(i).getX();
                mover += listaMovimientosB.get(i).getY();
                mover += listaMovimientosB.get(i).getX1();
                mover += listaMovimientosB.get(i).getY1();
                x = listaMovimientosB.get(i).getX();
                y = listaMovimientosB.get(i).getY();
                x1 = listaMovimientosB.get(i).getX1();
                y1 = listaMovimientosB.get(i).getY1();
                
                if (mover.equals(movimiento)) {
                    for (int j = 0; j < fichasVivasB.size(); j++) {
                        if (fichasVivasB.get(j).getoPosicion().getX()==x && fichasVivasB.get(j).getoPosicion().getY()==y) {
                            if (x1==0 && fichasVivasB.get(j).getNombre().equals("PEON")) {
                                oPosicion = fichasVivasB.get(j).getoPosicion();
                                oPosicion.setX(x1);
                                oPosicion.setY(y1);
                                oPosicion.setOcupado(true);
                                Nueva = JOptionPane.showInputDialog("NUEVA: ");
                                Tablero[x1][y1] = cambioFicha(fichasVivasB.get(j),Nueva);
                                Tablero[x][y] = new Ficha("VACIO", "   ", new Posicion(x, y, false));
                            }else{
                                Tablero[x1][y1] = fichasVivasB.get(j);
                                oPosicion = fichasVivasB.get(j).getoPosicion();
                                oPosicion.setX(x1);
                                oPosicion.setY(y1);
                                oPosicion.setOcupado(true);
                                Tablero[x][y] = new Ficha("VACIO", "   ", new Posicion(x, y, false));
                            }
                        }
                    }
                }
            }
        }else{
            for (int i = 0; i < listaMovimientosN.size(); i++) {
                mover = ""+listaMovimientosN.get(i).getX();
                mover += listaMovimientosN.get(i).getY();
                mover += listaMovimientosN.get(i).getX1();
                mover += listaMovimientosN.get(i).getY1();
                x = listaMovimientosN.get(i).getX();
                y = listaMovimientosN.get(i).getY();
                x1 = listaMovimientosN.get(i).getX1();
                y1 = listaMovimientosN.get(i).getY1();
                
                if (mover.equals(movimiento)) {
                    System.out.println(mover + ":" +movimiento);
                    for (int j = 0; j < fichasVivasN.size(); j++) {
                        if (fichasVivasN.get(j).getoPosicion().getX()==x && fichasVivasN.get(j).getoPosicion().getY()==y) {
                            if (x1==7 && fichasVivasN.get(j).getNombre().equals("PEON")) {
                                oPosicion = fichasVivasB.get(j).getoPosicion();
                                oPosicion.setX(x1);
                                oPosicion.setY(y1);
                                oPosicion.setOcupado(true);
                                Nueva = JOptionPane.showInputDialog("Nombre:");
                                Tablero[x1][y1] = cambioFicha(fichasVivasN.get(j),Nueva);
                                Tablero[x][y] = new Ficha("VACIO", "   ", new Posicion(x, y, false));
                            }else{
                                Tablero[x1][y1] = fichasVivasN.get(j);
                                oPosicion = fichasVivasB.get(j).getoPosicion();
                                oPosicion.setX(x1);
                                oPosicion.setY(y1);
                                oPosicion.setOcupado(true);
                                Tablero[x][y] = new Ficha("VACIO", "   ", new Posicion(x, y, false));
                            }
                        }
                    }
                }
            }
        }
    }
    
    private Ficha cambioFicha(Ficha oFicha, String Nueva) {
        switch (Nueva) {
            case "REYNA"    : 
                oFicha.setNombre(Nueva);
                oFicha.setAbreviatura("RAB");
                oFicha.setoPosicion(oFicha.getoPosicion());
                oFicha.setColor(oFicha.getColor());
                oFicha.setImagen(null);
                break;
            case "TORRE"    :
                oFicha.setNombre(Nueva);
                oFicha.setAbreviatura("TOB");
                oFicha.setoPosicion(oFicha.getoPosicion());
                oFicha.setColor(oFicha.getColor());
                oFicha.setImagen(null);
                break;
            case "ALFIL"    :
                oFicha.setNombre(Nueva);
                oFicha.setAbreviatura("ALB");
                oFicha.setoPosicion(oFicha.getoPosicion());
                oFicha.setColor(oFicha.getColor());
                oFicha.setImagen(null);
                break;
            case "CABALLO"  :
                oFicha.setNombre(Nueva);
                oFicha.setAbreviatura("CAB");
                oFicha.setoPosicion(oFicha.getoPosicion());
                oFicha.setColor(oFicha.getColor());
                oFicha.setImagen(null);
                break;
            default:
                break;
        }
        return oFicha;
    }
    
    private void mostrarTablero(){
        System.out.println("");
        System.out.println(" ------------  TABLERO DE AJEDREZ  ----------------");
        System.out.println("");
        System.out.println("   __A__ __B__ __C__ __D__ __E__ __F__ __G__ __H__ ");
        
        for (int i = 0; i < 8; i++) {
            System.out.println("");
            System.out.print((i+1) + " | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(Tablero[i][j].getAbreviatura()+ " | ");
            }
            System.out.println("");
            System.out.println("   _____ _____ _____ _____ _____ _____ _____ _____");
        }
        System.out.println("");
    }
}
