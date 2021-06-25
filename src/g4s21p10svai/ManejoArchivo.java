/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21p10svai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ManejoArchivo {
    public void grabar(Datos datos){
    try{
         FileWriter archivo = new FileWriter("datos.txt",true);
         BufferedWriter almacen = new BufferedWriter(archivo); 
         almacen.write(datos.getNombre() + "\n");
         almacen.write(datos.getEdad() + "\n");
         almacen.write(datos.getCorreo() + "\n");
         almacen.close();
       }catch(Exception ex){
       ex.printStackTrace();
       } 
    }
    public List<Datos> leer(){
        List<Datos> listadatos = new ArrayList<>();
        Datos datos;
        try{
        FileReader archivo = new FileReader("datos.txt");
        BufferedReader informacion = new BufferedReader(archivo);
        String lineas;
        
        while((lineas = informacion.readLine()) != null){
            datos = new Datos();
            datos.setNombre(lineas);
            lineas = informacion.readLine();
            datos.setEdad(Integer.parseInt(lineas));
            lineas = informacion.readLine();
            datos.setCorreo(lineas);
            
            listadatos.add(datos);
            
            
        
        }
        }catch (Exception ex){
        ex.printStackTrace();
        }
        return listadatos;
        
        
    }
}
