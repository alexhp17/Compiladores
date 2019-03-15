/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
    public static ArrayList <String> reservao= new ArrayList<>
            //Se cambiaron estos simbolos porque java no los reconoce "°"->"@" "°°"->"@@" y "¬"->"%" "¬¬"->"%%"
    (Arrays.asList("@","@@", "¬","¬¬","CON","EN","DEC","CAR","CAD","~","^","/","¿",
                   "#","->>","FI","=|","&","//","Y","=>","Block","NF","X","M","S"));
    
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
        if(cad ==' ')
        
        cad=leer(cont++);
            
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
              
               //para concatenar los caracteres especiales 
              else
                { 
                    leer(cont--);
                }
                leer(cont--);
            }
            
            //Verificamos si un número tiene letras, lo cual no es valido
//            if((cad>=65 && cad<=90) || (cad>=97 && cad<=122))
//            {
//                while((cad>=65 && cad<=90) || (cad>=97 && cad<=122))
//                {
//                  supercadena+=cad;
//                  cad=leer(cont++);  
//
//                }
//            
//                leer(cont--);
//                System.out.println("No es valido"); 
//                return supercadena;
//            
//            }
//             
//           return supercadena;
        } 
        else 
        {
            boolean bandera=true;
            supercadena+=cad;
            
            if(bandera==true)
            {
                switch(cad)
                {
                // (//)
                case 47:              
                  cad=leer(cont++);
                    if(cad==47)
                    {
                        supercadena+=cad;
                        cad=leer(cont++);
                        
                    }   
                        leer(cont--);
                        return supercadena;
                
                // %%
                case 37:
                    
                    cad=leer(cont++);
                        
                        if(cad==37)
                        {
                            supercadena+=cad;
                         
                            cad=leer(cont++);
                        }
                    cad=leer(cont--);
                    return supercadena;        
                   
                    // =| o =>
                    case 61:
                        cad=leer(cont++);
                        if(cad==124)
                            {
                                supercadena+=cad;
                                cad=leer(cont++);   
                            }

                        else if(cad== 62)
                            {
                                supercadena+=cad;
                                cad=leer(cont++);
                            }
                            cad=leer(cont--);
                            return supercadena;
                        
                        
                        //->>
                        case 45:
                        cad=leer(cont++);
                        
                        if(cad==62)
                        {
                            supercadena+=cad;
                            cad=leer(cont++);
                            if(cad==62)
                            {
                                supercadena+=cad;
                                cad=leer(cont++);
                            }
                        }
                            cad=leer(cont--);
                            return supercadena;
                        
                        //@@
                        case 64:
                        cad=leer(cont++);
                        if(cad==64)
                        {
                            supercadena+=cad;
                         
                            cad=leer(cont++);
                        }
                        cad=leer(cont--);
                        return supercadena;        
                   
                        
                    }      
            }
        }
         return supercadena;
    }
    
           
    public boolean verificar()
    {
        boolean bandera=false;                
//            if(reservao.contains(caracter))
//            {      
//               System.out.println("Palabra o simbolo reservado"); 
//            }
//            else
//            {   
//                System.out.println("Palabra no encontrada");
//            }
//            return bandera;
            
            while(true){
            if(reservao.contains(generarCadena()))
            {
                System.out.println("Argumento valido");
             return true;   
            }else
            {
                System.out.println("Argumento no valido");
                return false;
            }
            }
            
    }

    
}
