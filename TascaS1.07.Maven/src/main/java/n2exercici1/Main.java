package n2exercici1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {

		/*
		 * - Exercici 1
		Crea una anotació personalitzada que ha de permetre serialitzar un objecte Java 
		en un fitxer JSON. L’anotació ha de rebre el directori on es col·locarà el fitxer resultant.
		 */

		Treballador treballador = new Treballador("Fernando","Campos",15.3);
		
		Gson gson = new Gson();
		
		//Serialitzar objecte a json
		String jsonString = gson.toJson(treballador);
		System.out.println(jsonString);
		
		escriureFitxer(jsonString);
		
//		// Deserializar objecte: convertir la string JSON de nuevo en objeto `Treballador`
//        Treballador p = gson.fromJson(jsonString, Treballador.class);
//        System.out.println(p);
           
	}
	
	@Anotacio (rutaDirectorio = "C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio\\", jsonString = "jsonString ") 
	public static void escriureFitxer(String jsonString) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
			fichero = new FileWriter("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio\\"+"prueba.json");
            pw = new PrintWriter(fichero);

            pw.println(jsonString);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}
	


}
