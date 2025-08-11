package org.ProyectoPoo.Gestion_Medicamentos.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class Gestion_Medicamentos {

	public static void main(String[] args) throws Exception {
		//DBServer.start("Gestion_Medicamentos-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("Gestion_Medicamentos"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
