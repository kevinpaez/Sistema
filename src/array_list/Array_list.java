/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array_list;

import java.util.ArrayList;

/**
 *
 * @author kenan
 */
public class Array_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ArrayList<String> listaCadena = new ArrayList<>();
//        listaCadena.add("Isacc");
//        listaCadena.add("Kevin");
//        listaCadena.add("Andres");
//        listaCadena.add("juan");
//        listaCadena.remove("Isacc");
//        for (String item:listaCadena) {
//            System.out.println(item);
//        }
    ArrayList<Alumnos> listaAlumnos = new ArrayList<>();
    
    listaAlumnos.add(new Alumnos("kevin","paez",20,10));
    listaAlumnos.add(new Alumnos("Jose","Velez",22,7));
    listaAlumnos.add(new Alumnos("Andres","Cedeño",21,5));
    listaAlumnos.add(new Alumnos("Ricardo","Ramos",26,4));
   
   
    Alumnos MejorAlumno = new Alumnos("","",0,0);
    double MejorNota=0; 
        for (int i = 0; i < 3; i++) {
            double MejorNotaAuxiliar=0;
            for (Alumnos item:listaAlumnos) {
      
            if (item.getPromedio() > MejorNotaAuxiliar && item.getPromedio()<MejorNota)
            {
                MejorAlumno=item;
                MejorNotaAuxiliar=MejorAlumno.getPromedio();
            }            
            }
            MejorNota=MejorNotaAuxiliar;
        }
        System.out.println(MejorAlumno.getNombre());
    }
    
    
}
