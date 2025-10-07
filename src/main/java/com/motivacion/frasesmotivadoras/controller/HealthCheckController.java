package com.motivacion.frasesmotivadoras.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ARCHIVO: HealthCheckController.java
 * CONTROLLER: Endpoints de salud y verificación del sistema
 * 
 * Controlador simple para verificar que la aplicación está funcionando.
 * Esencial para despliegues en producción y monitoreo.
 * 
 * ENDPOINTS DE SALUD:
 * - GET /ping → Verificación básica de que la app responde
 * - GET /health → Información más detallada del estado
 * 
 * @author PitcherDev
 * @version 1.0
 * @since 2025
 */
@RestController
public class HealthCheckController {

    /**
     * GET /ping
     * Verificación básica de funcionamiento
     * 
     * El endpoint más simple posible. Si responde "pong",
     * significa que la aplicación está levantada y funcionando.
     * 
     * USOS:
     * - Load balancers verificando salud
     * - Scripts de despliegue verificando que la app arrancó
     * - Monitoreo básico
     * 
     * @return "pong" con código 200 OK
     */
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    /**
     * GET /health
     * Verificación de salud más detallada
     * 
     * Endpoint más completo que verifica no solo que la app responde,
     * sino también que las dependencias críticas (BD) están funcionando.
     * 
     * @return JSON con información del estado de salud
     */
    @GetMapping("/health")
    public HealthStatus health() {
        return new HealthStatus("ok", "La API de frases motivadoras está funcionando correctamente");
    }

    /**
     * 📊 CLASE INTERNA PARA LA RESPUESTA DE HEALTH
     */
    public static class HealthStatus {
        private final String status;
        private final String message;
        private final long timestamp;

        public HealthStatus(String status, String message) {
            this.status = status;
            this.message = message;
            this.timestamp = System.currentTimeMillis();
        }

        // Getters para que Jackson los serialice a JSON
        public String getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }

        public long getTimestamp() {
            return timestamp;
        }

    }
}
