/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.colegio;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
      int num; 
        
      float n1=0,n2=0,n3=0,PromM1=0,PromM2=0,PromM3=0;   
      do
      {
        String materia = " ";
        
                
        System.out.println("\nn- Ingrese para ingresar materia\n0- Salir \n");
        Scanner n = new Scanner(System.in);
        num = n.nextInt();
        // Datos del triangulo
        
        if (num !=0)
        {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nIntroduzca Materia: \n");
       
        materia = teclado.nextLine();
        switch (materia)
        {
        
            case "Matemáticas":
                    {   
                        System.out.println("\nMATERIA "+materia);
                        System.out.println("\n Introducir número con , ");
                        boolean Invalid=false;
                        
                        for (int i=1;i<6;i++)
                        {
                         System.out.println("\n"+i+"-Ingrese nota "+i+": ");
                         Scanner N = new Scanner(System.in);
                         n1 = N.nextFloat();
                         if(n1>5 || n1<0)
                         {
                         System.out.println("Nota debe estar entre 0-5");
                         Invalid=true;
                         break;
                         }
                         
                         PromM1+=n1;
                        }
                         
                        
                        PromM1=PromM1/5;
                        if (Invalid ==false)
                        {
                        System.out.println("\nMateria:"+materia+"  Promedio:"+PromM1);}
                        break;
                      
                    }
            case "Español":
                    {
                       int in=1;
                       boolean Invalid=false;
                       System.out.print("\nMATERIA "+materia); 
                       System.out.println("\n Introducir número con , ");
                       
                       while (in<=5)
                       {
                         System.out.println("\n"+in+"-Ingrese nota "+in+": ");
                         Scanner N = new Scanner(System.in);
                         n2 = N.nextFloat();
                         if(n2>5 || n2<0)
                         {
                         System.out.println("Nota debe estar entre 0-5");
                         Invalid=true;
                         break;
                         }
                         PromM2+=n2;
                         in++;
                       }
                       PromM2=PromM2/5;
                       if (Invalid ==false)
                        {
                        System.out.println("\nMateria:"+materia+"  Promedio:"+PromM2);}
                       break;
                       
                    }
            case "Ingles":
                    {   
                        System.out.print("MATERIA "+materia);
                        System.out.println("\n Introducir número con , ");
                        boolean Invalid =false;
                        int ma=1;
                        do
                        {
                         System.out.println("\n"+ma+"-Ingrese nota "+ma+": ");
                         Scanner N = new Scanner(System.in);
                         n3 = N.nextFloat();
                         if(n3>5 || n3<0)
                         {
                         System.out.println("Nota debe estar entre 0-5");
                         Invalid = true;
                         break;
                         }
                         PromM3+=n3;
                         ma++;
                        
                        }while (ma<6);
                        PromM3=PromM3/5;
                        if (Invalid ==false)
                        {
                        System.out.println("\nMateria:"+materia+"  Promedio:"+PromM3);}
                        break;
                
                    }
                    
        
        }

        }
      }while(num!=0);
    
    }
}
