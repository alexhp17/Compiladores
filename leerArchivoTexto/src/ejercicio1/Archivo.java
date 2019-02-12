/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import jdk.nashorn.internal.runtime.regexp.RegExp;

/**Equipo: María Fernanda Román Hernández.
 *         Luis Alejandro Hinojosa Pérez.
 * Fecha : 30 de Enero del 2019      
 * Materia: Compiladores
 */
public class Archivo {
    public File F;
    public FileReader leearchivo;
    public int cont=0;
    public String nombre;
    public String addcadena = "";
    public String l;
    public int c=0; 
    public String cad = " "+l;
    
    public Archivo()
    { 
        this.nombre= nombre;
         try
           {
                     String cadena;
                     F = new File("saludo.txt");
                     leearchivo = new FileReader(F);
                     BufferedReader br = new BufferedReader (leearchivo);
         
                     while((cadena = br.readLine())!=null) {
                     //System.out.println(cadena);
                      addcadena+=cadena;
                      }
                        br.close();
      
          }catch (IOException e)
            {
              System.out.println("Error");
            }
    }
    public char leer(int cont)
    { 
        return addcadena.charAt((cont));
    }
    
    public String generarCadena(){
        String supercadena = "";
        char cad=leer(cont++);
       
         if((cad>=65 && cad<=90) || (cad>=97 && cad<=122))
         {
            //Esto es para las letra .
            while((cad>=65 && cad<=90) || (cad>=97 && cad<=122))
            {
                  supercadena+=cad;
                  cad=leer(cont++);   
            }
          
            leer(cont--);
            return supercadena;
        }
        else if(cad>=48 && cad<=57 )
        {
            //Esto es para un número
            while(cad>=48 && cad<=57 )
            {
                supercadena+=cad;
                
                cad=leer(cont++);
            }
            if (cad==46)
            {
              cad=leer(cont++);
              if((cad>=48 && cad<=57 ))
              {
                //Esto es para un número
                supercadena += ".";
                
                while(cad>=48 && cad<=57 )
                {
                    supercadena+=cad;
                
                    cad=leer(cont++);
                }  
              }
              else
                { 
                    leer(cont--);
                }
                leer(cont--);
            }
           return supercadena;
        } 
        else 
        {
            supercadena+=cad;
            return supercadena;
        
        }
    }          
}
