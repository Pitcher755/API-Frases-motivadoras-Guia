package com.motivacion.frasesmotivadoras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ARCHIVO: FrasesMotivadorasApplication.java
 * CLASE PRINCIPAL: El corazón y motor de nuestra aplicación de frases
 * motivadoras
 * 
 * Esta clase es el punto de entrada que hace que Spring Boot cobre vida.
 * Es como el botón de encendido de toda nuestra aplicación.
 * 
 * @author PitcherDev
 * @version 1.0
 * @since 2025
 */
@SpringBootApplication
public class FrasesMotivadorasApplication {
	/**
	 * MÉTODO MAIN: El punto de entrada de nuestra aplicación
	 * 
	 * Este método es el primero que se ejecuta cuando arrancamos la aplicación.
	 * Es como la llave que enciende el motor del coche.
	 * 
	 * ¿Qué hace exactamente?
	 * 1. Carga la configuración de Spring Boot
	 * 2. Escanea nuestro paquete en busca de componentes (@Controller, @Service,
	 * etc.)
	 * 3. Inicia el servidor web embebido (Tomcat)
	 * 4. Prepara la aplicación para recibir peticiones HTTP
	 * 
	 * @param args Argumentos de línea de comandos (opcionales)
	 *             Puedes pasar configuraciones especiales al iniciar la app
	 * 
	 * @implNote SpringApplication.run() es el método que realmente hace la magia
	 */
	public static void main(String[] args) {
		// Mensaje motivador al Inicio
		System.out.println("Iniciando la API de Frases Motivadoras...");
		System.out.println("Próximamente: inspiración para developers");

		// ¡ESTA LÍNEA ES LA QUE PONE TODO EN MARCHA!
		SpringApplication.run(FrasesMotivadorasApplication.class, args);

		// Después de esta línea, nuestra aplicación está viva y escuchando
		// en el puerto 8080 (o el que configuramos en application.properties)

	}
}
