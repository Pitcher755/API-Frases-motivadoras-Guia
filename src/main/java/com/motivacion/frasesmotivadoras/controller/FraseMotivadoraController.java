package com.motivacion.frasesmotivadoras.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.motivacion.frasesmotivadoras.model.FraseMotivadora;
import com.motivacion.frasesmotivadoras.service.FraseMotivadoraService;

/**
 * ARCHIVO: FraseMotivadoraController.java
 * CONTROLLER: La "cara pública" de nuestra API de frases motivadoras
 * 
 * Esta clase define los endpoints HTTP que los clientes pueden usar
 * para interactuar con nuestra aplicación de frases motivadoras.
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Mapear URLs a funcionalidades específicas
 * - Recibir y validar parámetros de entrada
 * - Delegar lógica de negocio al Service
 * - Devolver respuestas HTTP apropiadas con códigos de estado
 * - Manejar errores y excepciones elegantemente
 * 
 * ESTRUCTURA DE ENDPOINTS:
 * GET /frases - Todas las frases
 * GET /frases/{id} - Frase específica por ID
 * POST /frases - Crear nueva frase
 * PUT /frases/{id} - Actualizar frase completa
 * PATCH /frases/{id} - Actualizar parcialmente
 * DELETE /frases/{id} - Eliminar frase
 * 
 * ENDPOINTS ESPECIALES MOTIVADORES:
 * GET /frases/aleatoria - Frase aleatoria sorpresa
 * GET /frases/categoria/{categoria} - Frases por categoría
 * GET /frases/momento/{contexto} - Frase para momento específico
 * GET /frases/destacada-del-dia - Frase destacada de día
 * 
 * @author PitcherDev
 * @version 1.0
 * @since 2025
 */
@RestController // Convierte la clase en un Controller REST
@RequestMapping("api/v1/frases") // Prefijo común para todos los endpoints
public class FraseMotivadoraController {

    /**
     * SERVICE: Nuestro coach digital inyectado
     * 
     * Spring automáticamente inyecta una instancia del Service
     * gracias a la anotación @Autowired
     */
    private final FraseMotivadoraService fraseService;

    /**
     * CONSTRUCTOR CON INYECCIÓN DE DEPENDENCIAS
     * 
     * @param fraseService El service que Spring nos inyecta automáticamente
     */
    public FraseMotivadoraController(FraseMotivadoraService fraseService) {
        this.fraseService = fraseService;
    }

    /**
     * ===================================
     * ENDPOINTS DE CONSULTA (GET)
     * ===================================
     */

    /**
     * GET /api/v1/frases
     * Obtener todas las frases motivadoras
     * 
     * Endpoint para listar todas las frases disponibles.
     * Útil para explorar el catálogo completo.
     * 
     * CÓDIGOS DE RESPUESTA:
     * - 200 OK: Siempre devuelve la lista (vacía si no hay frases)
     * 
     * @return Lista de todas las frases con código 200 OK
     */
    @GetMapping
    public ResponseEntity<List<FraseMotivadora>> obtenerTodasLasFrases() {
        List<FraseMotivadora> frases = fraseService.obtenerTodasLasFrases();
        return ResponseEntity.ok(frases); // 200 OK
    }

    /**
     * GET /api/v1/frases/{id}
     * Obtener una frase específica por ID
     * 
     * Endpoint para buscar una frase concreta por su identificador único.
     * 
     * CÓDIGOS DE RESPUESTA:
     * - 200 OK: Si encuentra la frase
     * - 404 Not Found: Si no existe una frase con ese ID
     * 
     * @param id El ID de la frase a buscar
     * @return Frase encontrada (200) o 404 si no existe
     */
    @GetMapping("/{id}")
    public ResponseEntity<FraseMotivadora> obtenerFrasePorId(@PathVariable Long id) {
        Optional<FraseMotivadora> frase = fraseService.obtenerFrasePorId(id);

        return frase.map(ResponseEntity::ok) // 200 OK si existe
                .orElse(ResponseEntity.notFound().build()); // 404 si no existe
    }

    /**
     * GET /api/v1/frases/aleatoria
     * Obtener una frase aleatoria
     * 
     * Uno de los endpoints más útiles: frases sorpresa aleatorias.
     * Perfecto para cuando necesitas inspiración inesperada.
     * 
     * CÓDIGOS DE RESPUESTA:
     * - 200 OK: Si hay frases disponibles
     * - 404 Not Found: Si no hay ninguna frase en la base de datos
     * 
     * @return Frase aleatoria o 404 si no hay frases
     */
    @GetMapping("/aleatoria")
    public ResponseEntity<FraseMotivadora> obtenerFraseAleatoria() {
        Optional<FraseMotivadora> frase = fraseService.obtenerFraseAleatoria();

        return frase.map(ResponseEntity::ok) // 200 OK
                .orElse(ResponseEntity.notFound().build()); // 404
    }

    /**
     * GET /api/v1/frases/categoria/{categoria}
     * Obtener frases por categoría
     * 
     * Endpoint para fráses específicas de un contexto particular.
     * Ejemplos de categorías: "debugging", "aprendizaje", "deploy"
     * 
     * CÓDIGOS DE RESPUESTA:
     * - 200 OK: Devuelve la lista (puede estar vacía)
     * 
     * @param categoria La categoría a filtrar
     * @return Lista de frases de esa categoría (200 OK)
     */
    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<FraseMotivadora>> obtenerFrasesPorCategoria(@PathVariable String categoria) {
        List<FraseMotivadora> frases = fraseService.obtenerFrasesPorCategoria(categoria);

        return ResponseEntity.ok(frases); // 200 OK (lista vacía si no hay)
    }

    /**
     * GET /api/v1/frases/categoria/{categoria}/aleatoria
     * Obtener frase aleatoria por categoría
     * 
     * Combina categoría específica con el factor sorpresa aleatorio.
     * Ejemplo: frase aleatoria de debugging cuando tienes bugs.
     * 
     * @param categoria La categoría deseada
     * @return Frase aleatoria de esa categoría o 404
     */
    @GetMapping("/categoria/{categoria}/aleatoria")
    public ResponseEntity<FraseMotivadora> obtenerFraseAleatoriaPorCategoria(@PathVariable String categoria) {
        Optional<FraseMotivadora> frase = fraseService.obtenerFraseAleatoriaPorCategoria(categoria);

        return frase.map(ResponseEntity::ok) // 200 OK
                .orElse(ResponseEntity.notFound().build()); // 404
    }

    /**
     * GET /api/v1/frases/momento/{contexto}
     * Obtener frasa para momento específico (COACH INTELIGENTE)
     * 
     * Endpoint inteligente que recomienda frase según el contexto.
     * El coach digital elige la frase más apropiada automáticamente.
     * 
     * PARÁMETROS OPCIONALES:
     * - lenguaje: Filtra por lenguaje de programación
     * 
     * @param contexto El momento: "aprendizaje", "debugging", "deploy", etc.
     * @param lenguaje Lenguaje de programación (opcional)
     * @return Frase recomendada para el contexto
     */
    @GetMapping("/momento/{contexto}")
    public ResponseEntity<FraseMotivadora> obtenerFraseParaMomento(@PathVariable String contexto,
            @RequestParam(required = false) String lenguaje) {
        Optional<FraseMotivadora> frase = fraseService.obtenerFraseParaMomento(contexto, lenguaje);

        return frase.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * GET /api/v1/frases/dificultad/{nivel}
     * Obtener frases por nivel de dificultad
     * 
     * Endpoint para developers de diferentes niveles.
     * - Nivel 1: Principiantes absolutos
     * - Nivel 5: Experts, architects,leads
     * 
     * @param nivel Nivel de dificultad (1-5)
     * @return Frases para ese nivel de developer
     */
    @GetMapping("/dificultad/{nivel}")
    public ResponseEntity<List<FraseMotivadora>> obtenerFrasesPorDificultad(@PathVariable Integer nivel) {
        // Validación básica del parámetro
        if (nivel < 1 || nivel > 5) {
            return ResponseEntity.badRequest().build(); // 400 Bad Request
        }

        List<FraseMotivadora> frases = fraseService.obtenerFrasesParaNivel(nivel);
        return ResponseEntity.ok(frases);
    }

    /**
     * GET /api/v1/frases/destacada-del-dia
     * Obtener la frase destacada del día.
     * 
     * Frase especial que cambia cada día.
     * Misma frase para todos los usuarios durante 24 horas.
     * 
     * @return Frase destacada del día o 404 si no hay destacadas
     */
    @GetMapping("/destacada-del-dia")
    public ResponseEntity<FraseMotivadora> obtenerFraseDestacadaDelDia() {
        Optional<FraseMotivadora> frase = fraseService.obtenerFraseDestacadaDelDia();

        return frase.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * GET /api/v1/frases/buscar
     * Buscar frases por texto en el contenido
     * 
     * Búsqueda flexible en el texto de las frases.
     * Ejemplo: /frases/buscar?texto=código
     * 
     * @param texto Texto a buscar en el contenido de las frases
     * @return Frases que contienen el texto
     */
    @GetMapping("/buscar")
    public ResponseEntity<List<FraseMotivadora>> buscarFrasesPorTexto(@RequestParam String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return ResponseEntity.badRequest().build(); // 400 si texto vacío
        }

        List<FraseMotivadora> frases = fraseService.buscarFrasesPorTexto(texto);
        return ResponseEntity.ok(frases);
    }

    /**
     * GET /api/v1/frases/autor/{autor}
     * Obtener frases por autor
     * 
     * Endpoint para fans de developers específicos.
     * Ejemplo: todas las frases de "Kent Beck" o "Martin Fowler"
     * 
     * @param autor Nombre del autor a buscar
     * @return Frases de ese autor
     */
    @GetMapping("/autor/{autor}")
    public ResponseEntity<List<FraseMotivadora>> obtenerFrasesDeAutor(@PathVariable String autor) {
        List<FraseMotivadora> frases = fraseService.obtenerFrasesDeAutor(autor);

        return ResponseEntity.ok(frases);
    }

    /**
     * ==================================================
     * ENDPOINTS DE MODIFICACIÓN (POST, PUT, PATCH, DELETE)
     * ==================================================
     */

    /**
     * POST /api/v1/frases
     * Crear una nueva frase motivadora
     * 
     * Endpoint para añadir nuevas frases a la colección.
     * El cuerpo de la petición debe contener los datos de la frase.
     * 
     * CÓDIGOS DE RESPUESTA:
     * - 201 Created: Frase creada exitosamente
     * - 400 Bad Request: Datos inválidos en la petición
     * 
     * @param nuevaFrase Los datos de la nueva frase (en JSON)
     * @return La frase creada con código 201 Created
     */
    @PostMapping
    public ResponseEntity<FraseMotivadora> crearFrase(@RequestBody FraseMotivadora nuevaFrase) {
        try {
            FraseMotivadora fraseCreada = fraseService.guardarFrase(nuevaFrase);
            return ResponseEntity.status(HttpStatus.CREATED).body(fraseCreada); // 201 Created
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build(); // 400 Bad Request
        }
    }

    /**
     * PUT /api/v1/frases/{id}
     * Actualizar una frase completa
     * 
     * Reemplaza todos los campos de la frase existente.
     * Debes enviar todos los campos en la petición.
     * 
     * CÓDIGOS DE RESPUESTA:
     * - 200 OK: Frase actualizada exitosamente
     * - 404 Not Found: No existe frase con ese ID
     * - 400 Bad Request: Datos inválidos
     * 
     * @param id               ID de la frase a actualizar
     * @param fraseActualizada Nuevos datos completos de la frase
     * @return Frase actualizada o código de error
     */
    @PutMapping("/{id}")
    public ResponseEntity<FraseMotivadora> actualizarFraseCompleta(@PathVariable Long id,
            @RequestBody FraseMotivadora fraseActualizada) {
        try {
            Optional<FraseMotivadora> resultado = fraseService.actualizarFrase(id, fraseActualizada);
            return resultado.map(ResponseEntity::ok) // 200 OK
                    .orElse(ResponseEntity.notFound().build()); // 404
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    /**
     * PATCH /api/v1/frases/{id}/destacada
     * Marcar/desmarcar frase como destacada
     * 
     * Actualización parcial: solo cambia el estado de "destacada".
     * 
     * @param id        ID de la frase
     * @param destacada true para marcar como destacada, false para desmarcar
     * @return Frase actualizada
     */
    @PatchMapping("/{id}/destacada")
    public ResponseEntity<FraseMotivadora> marcarFraseComoDestacada(@PathVariable Long id,
            @RequestParam Boolean destacada) {
        Optional<FraseMotivadora> resultado = destacada ? fraseService.marcarFraseComoDestacada(id)
                : fraseService.desmarcarFraseComoDestacada(id);

        return resultado.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * DELETE /api/v1/frases/{id}
     * Eliminar una frase
     * 
     * Elimina permanentemente una frase de la base de datos.
     * 
     * CÓDIGOS DE RESPUESTA:
     * - 200 OK: Frase eliminada (devuelve la frase eliminada)
     * - 404 Not Found: No existe frase con ese ID
     * 
     * @param id ID de la frase a eliminar
     * @return Frase eliminada o 404
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<FraseMotivadora> eliminarFrase(@PathVariable Long id) {
        Optional<FraseMotivadora> fraseEliminada = fraseService.eliminarFrase(id);

        return fraseEliminada.map(ResponseEntity::ok) // 200 OK con la frase eliminada
                .orElse(ResponseEntity.notFound().build()); // 404
    }

    /**
     * ==================================================
     * ENDPOINTS INFORMATIVOS Y ESTADÍSTICAS
     * ==================================================
     */

    /**
     * GET /api/v1/frases/estadisticas
     * Obtener estadísticas de las frases
     * 
     * Endpoint informativo con métricas interesantes.
     * 
     * @return Texto con estadísticas formateadas
     */
    @GetMapping("/estadisticas")
    public ResponseEntity<String> obtenerEstadisticas() {
        String estadisticas = fraseService.obtenerEstadisticas();
        return ResponseEntity.ok(estadisticas);
    }

    /**
     * 🌐 GET /api/v1/frases/categorias
     * 🏷️ Obtener lista de categorías disponibles
     * 
     * 💡 Útil para que los clients sepan qué categorías pueden usar.
     * 
     * @return Lista de categorías únicas
     */
    @GetMapping("/categorias")
    public ResponseEntity<List<String>> obtenerCategorias() {
        List<String> categorias = fraseService.obtenerCategorias();
        return ResponseEntity.ok(categorias);
    }

    /**
     * ==================================================
     * 🏥 MANEJO DE EXCEPCIONES GLOBAL
     * ==================================================
     */

    /**
     * 🛡️ MANEJADOR DE EXCEPCIONES PARA Argumentos Inválidos
     * 
     * 💡 Captura excepciones de validación y devuelve respuestas HTTP apropiadas.
     * Esto evita que la aplicación crashee con errores 500.
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> manejarArgumentoInvalido(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body("Error: " + ex.getMessage());
    }
}
