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
    public char leer()
    { 
        return addcadena.charAt((cont++));
    }
    public String generarCadena(){
        String supercadena = "";
        char cad=leer();
        if(cad>=48 && cad<=57){
            //Es un numero prro.
            while(cad>=48 && cad<=57){
                supercadena+=cad;
                
                cad=leer();
            }
           return supercadena;
        }
        else if((cad>=65 && cad<=90) || (cad<=122 && cad>=97)){
            //Esto es una letra prro.
            while((cad>=65 && cad<=90) || (cad<=122 && cad>=97)){
                  supercadena+=cad;
                
                cad=leer();
                  
            }
          //  System.out.println("");
            return supercadena;
        } 
        else { 
        //No debe regresa nada
            supercadena+=cad;
            
           //  System.out.println("hola1");
           cad=leer();
           return supercadena+"g";
        }
        
        }
        
    }
        


//    
//public String  identificacionVar()
//{
//        char l=generacionCadena();
//        //l= leer();
//       
//        
//        if(l>64 && 91<l)
//        {
//            return generacionCadena(""+l);
//        }
//        else if(l>96 && 123<l)
//        {
//                return generacionCadena(""+l);
//        }
//        else    
//            { if(l> 47 && 58<l)
//            {
//                return gerenacionNumero(""+l)
//            }
//                     return ""+l;
//                     
//                     } 
//}
//
//
//public String generacionCadena(String l)
//{
//  
//    String cad = " "+l;
//    
//    if((c>47 && 58<c)|| (c>64 && 91<c) || (c>96 && 123 <c))
//    {
//        return  cad += " "+l;
//                 
//    }
//    else{
//   
//        return cad;
//    }
//   
//}
//
//public String generacionNumero(String p)
//{
//    return null;
//}











