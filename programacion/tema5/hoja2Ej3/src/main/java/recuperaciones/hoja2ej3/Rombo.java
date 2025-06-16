/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej3;

/**
 *
 * @author thero
 */
public class Rombo extends Forma {
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(String id, double diagonalMayor, double diagonalMenor) {
        super(id);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public String toString() {
        return "Rombo con diagonales " + diagonalMayor + " y " + diagonalMenor;
    }
}
