package es.ulpgc.eii.strings;
/*  Aitor Ventura Delgado
    16/02/2019 

Crearemos un metodo que devuelva un String que estará formado por la concatenación
de las fechas que recibamos de un parámetro String, sin espacios al principio ni  al final
de la cadena */

public class StringUtils {
    public static String dates(String s1){
        String res = "";    //Variable resultado, una String
        s1 = s1 + " ";      //Añadimos un espacio al final de la cadena que recibimos
        int p = s1.indexOf("/");    //Hallamos el índice de donde se encuentra el carácter '/' (dd/mm/aaaa)
        
        if (p == -1){   //Si el carácter no se encuentra
            return res; //devolver resultado
        }
        
        while (p > -1){ //Si se encuentra
            res += s1.substring(p-2,p+8) + " "; //La cadena resultado añadirá la cadena desde 'dd' hasta 'aaaa'  
            p = s1.indexOf("/", p+8);   //Y buscaremos el siguiente carácter '/' desde el final de 'aaaa'
        }
        
        res = res.substring(0, res.length() - 1);   //Sin embargo, tendremos un espacio final, que quitaremos
        
        return res; //Devolvemos el resultado
    }
}