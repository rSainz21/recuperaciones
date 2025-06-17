/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package exa08.ejemplocsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

/**
 *
 * @author cic
 */
public class EjemploCSV {

    public static void main(String[] args) {
        /* si existe el fichero departamentos.csv nos muestra la información del fichero */
        File ficDep = new File("Departamentos.csv");
        if (ficDep.exists()) {
            listarDepartamentos(leerDepartamentos(ficDep));
        }
    }

    /* de la lista de objetos departamentos la recorre y nos muestra los valores del departamento*/
    private static void listarDepartamentos(ArrayList<Departamento> lista) {
        for (Departamento departamento : lista) {

            mostrarDepartamento(departamento.datosObjeto());
        }
        System.out.println("Hay " + lista.size() + " departamentos");
    }

    /* lista la información en modo ficha */
    private static void mostrarDepartamento(LinkedHashMap<String, String> datosObjeto) {
        Identificable.modoFicha(datosObjeto);
    }

    /* lee el fihero csv y por cada línea del fichero que es un departamento, lo convierte a objeto departamento y devuelve 
    una lista de los objetos departamentos del fichero.
     */
    private static ArrayList<Departamento> leerDepartamentos(File ficDep) {
        ArrayList<Departamento> lista = new ArrayList();
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(ficDep))) {
            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                while (st.hasMoreTokens()) {
                    Departamento dep = new Departamento(Integer.parseInt(st.nextToken()), st.nextToken(), st.nextToken());
                    lista.add(dep);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        return lista;
    }
}
