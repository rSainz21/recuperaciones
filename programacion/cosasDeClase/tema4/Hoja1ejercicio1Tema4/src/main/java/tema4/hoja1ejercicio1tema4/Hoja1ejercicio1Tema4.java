/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.hoja1ejercicio1tema4;

/**
 *
 * @author dam1
 */
public class Hoja1ejercicio1Tema4 {

    public static void main(String[] args) {
        int[] nums= {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2};
        int[] nums1=new int[10];
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        for(int i=0;i<nums1.length;i++){
            nums1[i]=(int) Math.floor(Math.random()*(Integer.MAX_VALUE));
            nums[i]=-1;
            System.out.println("");
        }
        
        
        
        
    }
}
