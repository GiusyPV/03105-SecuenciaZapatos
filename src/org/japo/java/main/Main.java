/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static void main(String[] args) {

        //Constantes Vaca
        final String ANI_VAC = "Vaca";
        final int CANT_VAC = 3;
        final int PAT_VAC = 12;

        //COnstantes Oveja
        final String ANI_OVE = "Oveja";
        final int CANT_OVE = 14;
        final int PAT_OVE = 56;

        //Constantes Burro
        final String ANI_BURR = "Burro";
        final int CANT_BURR = 2;
        final int PAT_BURR = 8;

        //Constantes Gallina
        final String ANI_GALL = "Gallina";
        final int CANT_GALL = 18;
        final int PAT_GALL = 36;

        //Variables
        int totPatas = PAT_VAC + PAT_OVE + PAT_BURR + PAT_GALL;
        int totPares = totPatas / 2;

        //Cabecera
        System.out.println("Secuencia de Patas");
        System.out.println("==================");
        
        //Vaca
        System.out.printf("Animal  ........: %s%n", ANI_VAC);
        System.out.printf("Cantidad .......: %d%n", CANT_VAC);
        System.out.printf("Patas ..........: %d%n", PAT_VAC);
        
        //Separador
        System.out.println("---");
        
        //Oveja
        System.out.printf("Animal  ........: %s%n", ANI_OVE);
        System.out.printf("Cantidad .......: %d%n", CANT_OVE);
        System.out.printf("Patas ..........: %d%n", PAT_OVE);
        
        //Separador
        System.out.println("---");
        
        //Burro
        System.out.printf("Animal  ........: %s%n", ANI_BURR);
        System.out.printf("Cantidad .......: %d%n", CANT_BURR);
        System.out.printf("Patas ..........: %d%n", PAT_BURR);
        
        //Separador
        System.out.println("---");
        
        //Gallina
        System.out.printf("Animal  ........: %s%n", ANI_GALL);
        System.out.printf("Cantidad .......: %d%n", CANT_GALL);
        System.out.printf("Patas ..........: %d%n", PAT_GALL);
        
        //Separador
        System.out.println("---");
        
        System.out.printf("Total de Patas .: %d%n", totPatas);
        System.out.printf("Total de Pares .: %d%n", totPares);
    }
}
