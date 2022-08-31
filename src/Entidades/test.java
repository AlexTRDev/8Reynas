/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEX
 */
public class test {
    
    public static void main(String[] args) {
        
        GameAjedrez oAjedrez = new GameAjedrez("ALEX", "TAMALIN");
        Scanner scan = new Scanner(System.in);
        
        oAjedrez.asignarFichas();
        oAjedrez.Movimientos("ALEX");
        //Tablero oTablero = new Tablero();
        String movimiento="a";
        
        while(!movimiento.equals("SALIR")){
            System.out.print("COORDENADAS A MOVER");
            //movimiento = scan.nextLine();
            movimiento = JOptionPane.showInputDialog("COORDENADAS: ");

            oAjedrez.moverFicha("ALEX", movimiento);
            oAjedrez.Movimientos("ALEX");

            if (JOptionPane.showConfirmDialog(null,"Enroque", "Si o No?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                oAjedrez.hacerEnroque("ALEX");
            }
        }
        
        //oTablero.mostrarTablero();
        
        
//        System.out.println(Arrays.toString(oTablero.getTablero2()));
        
    }
}
