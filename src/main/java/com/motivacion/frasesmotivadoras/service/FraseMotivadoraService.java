package com.motivacion.frasesmotivadoras.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.motivacion.frasesmotivadoras.model.FraseMotivadora;
import com.motivacion.frasesmotivadoras.repository.FraseMotivadoraRepository;

/**
 * ARCHIVO: FraseMotivadoraService.java
 * SERVICE: El "coach digital" que gestiona la lógica de negocio de las frases
 * 
 * Esta clase es el cerebro de nuestra aplicación de frases motivadoras.
 * Contiene toda la lógica de negocio y orquesta las operaciones entre
 * el Controller (que recibe peticiones) y el Repository (que accede a datos).
 * 
 * FUNCIONALIDADES PRINCIPALES:
 * - Gestión inteligente de frases motivadoras
 * - Lógica para recomendar frases según el contexto
 * - Validaciones y reglas de negocio
 * - Transformación y enriquecimiento de datos
 * 
 * LA MAGIA: Spring inyecta automáticamente el Repository (@Autowired)
 * 
 * @author PitcherDev
 * @version 1.0
 * @since 2025
 */
@Service // Marca esta clase como un Service de Spring (¡para que la detecte!)
public class FraseMotivadoraService {

    /**
     * REPOSITORY: Nuestro acceso a la base de datos
     * 
     * Spring Boot inyecta automáticamente una instancia del Respository
     * gracias a la anotación @Autowired.
     * 
     * Esto se llama "Inyección de Dependencias" - Spring nos provee las
     * dependencias que necesitamos sin que tengamos que crearlas manualmente.
     */
    private final FraseMotivadoraRepository fraseRepository;

    /**
     * CONSTRUCTOR CON INYECCIÓN DE DEPENDENCIAS
     * 
     * Esta es la forma moderna y recomendada de hacer inyección de dependencias.
     * Spring detecta automáticamente que necesita pasar el Repository al
     * constructor
     * 
     * @param fraseRepository El repository que Spring nos inyecta automáticamente
     */
    public FraseMotivadoraService(FraseMotivadoraRepository fraseRepository) {
        this.fraseRepository = fraseRepository;
    }

    /**
     * ========================================================
     * OPERACIONES CRUD BÁSICAS (Create, Read, Update, Delete)
     * ========================================================
     */

    /**
     * OBTENER TODAS LAS FRASES
     * 
     * Simple delegación al repository - el service actúa como intermediario.
     * Esto permite añadir lógica adicional en el futuro (caching, filtros, etc.)
     * 
     * @return Lista de todas las frases motivadoras
     */
    public List<FraseMotivadora> obtenerTodasLasFrases() {
        return fraseRepository.findAll();
    }

    /**
     * OBTENER FRASE POR ID
     * 
     * Usamos Optional para manejar elegantemente el caso de que la fase no exista.
     * Optional evita los temidos NullPointerException.
     * 
     * @param id El ID de la frase a buscar
     * @return Optional con la frase si existe, o empty si no
     */
    public Optional<FraseMotivadora> obtenerFrasePorId(Long id) {
        return fraseRepository.findById(id);
    }

    /**
     * GUARDAR NUEVA FRASE
     * 
     * Aquí añadimos lógica de negocio antes de guardar:
     * - Establecemos fechas de creación y actualización
     * - Podríamos añadir validaciones adicionales
     * 
     * @param frase La frase a guardar
     * @return La frase fuardada (con ID generado)
     */
    public FraseMotivadora guardarFrase(FraseMotivadora frase) {
        // Lógica de negocio: establecer fechas automáticamente
        frase.setFechaCreacion(LocalDateTime.now());
        frase.setFechaActualizacion(LocalDateTime.now());

        // Validación adicional: evitar frases vacías
        validarFrase(frase);

        return fraseRepository.save(frase);
    }

    /**
     * ACTUALIZAR FRASE EXISTENTE
     * 
     * Lógica más compleja: verificamos que la frase existe antes de actualizar
     * y actualizamos la fecha de modificación automáticamente.
     * 
     * @param id               El ID de la frase a actualizar
     * @param fraseActualizada Los nuevos datos de la frase
     * @return La frase actualizada, o empty si no existía
     */
    public Optional<FraseMotivadora> actualizarFrase(Long id, FraseMotivadora fraseActualizada) {
        return fraseRepository.findById(id).map(fraseExistente -> {
            // Actualizar solo los campos proporcionados (patch semantics)
            if (fraseActualizada.getContenido() != null) {
                fraseExistente.setContenido(fraseActualizada.getContenido());
            }
            if (fraseActualizada.getAutor() != null) {
                fraseExistente.setAutor(fraseActualizada.getAutor());
            }
            if (fraseActualizada.getCategoria() != null) {
                fraseExistente.setCategoria(fraseActualizada.getCategoria());
            }
            if (fraseActualizada.getLenguaje() != null) {
                fraseExistente.setLenguaje(fraseActualizada.getLenguaje());
            }
            if (fraseActualizada.getNivelDificultad() != null) {
                fraseExistente.setNivelDificultad(fraseActualizada.getNivelDificultad());
            }
            if (fraseActualizada.getDestacada() != null) {
                fraseExistente.setDestacada(fraseActualizada.getDestacada());
            }

            // Actualiar fecha de modificación automáticamente
            fraseExistente.setFechaActualizacion(LocalDateTime.now());

            return fraseRepository.save(fraseExistente);
        });
    }

    /**
     * ELIMINAR FRASE
     * 
     * Verificamos que la frase existe antes de eliminar
     * y devolvemos la frase eliminada para confirmación.
     * 
     * @param id El ID de la frase a eliminar
     * @return La frase eliminada, o empty si no existía
     */
    public Optional<FraseMotivadora> eliminarFrase(Long id) {
        Optional<FraseMotivadora> fraseOptional = fraseRepository.findById(id);
        if (fraseOptional.isPresent()) {
            fraseRepository.deleteById(id);
        }
        return fraseOptional;
    }

    /**
     * ==============================================
     * FUNCIONALIDADES INTELIGENTES DE COACH DIGITAL
     * ==============================================
     */

    /**
     * OBTENER FRASE ALEATORIA
     * 
     * Una de las funcionalidades más útiles: frases aleatorias
     * para cuando alguien necesita inspiración sorpresa.
     * 
     * @return Una frase aleatoria, o empty si no hay frases
     */
    public Optional<FraseMotivadora> obtenerFraseAleatoria() {
        return fraseRepository.findFraseAleatoria();
    }

    /**
     * OBTENER FRASES POR CATEGORÍA
     * 
     * Lista de frases filtrada de una categoría específica.
     * 
     * @param categoria Categoría de la lista de frases
     * @return Lista de frases de una categoría
     */
    public List<FraseMotivadora> obtenerFrasesPorCategoria(String categoria) {
        return fraseRepository.findByCategoriaIgnoreCase(categoria);
    }

    /**
     * OBTENER FRASE ALEATORIA POR CATEGORÍA
     * 
     * Frase aleatoria pero filtrada por categoría específica.
     * Ejemplo: frase aleatoria de "debugging" para cuando tienes bugs.
     * 
     * @param categoria La categoría deseada
     * @return Frase aleatoria de esa categoría, o empty si no hay
     */
    public Optional<FraseMotivadora> obtenerFraseAleatoriaPorCategoria(String categoria) {
        List<FraseMotivadora> frases = fraseRepository.findByCategoriaIgnoreCase(categoria);
        if (frases.isEmpty()) {
            return Optional.empty();
        }

        // Lógica aleatoria simple
        int indiceAleatorio = (int) (Math.random() * frases.size());
        return Optional.of(frases.get(indiceAleatorio));
    }

    /**
     * OBTENER FRASE PARA MOMENTO ESPECÍFICO
     * 
     * El coach inteligente: según el contexto, recomienda una frase apropiada.
     * 
     * @param contexto El momento del developer: "aprendizaje", "debugging",
     *                 "deploy", "estres"
     * @param lenguaje Lenguaje de programación (opcional)
     * @return Frase apropiada para el contexto
     */
    public Optional<FraseMotivadora> obtenerFraseParaMomento(String contexto, String lenguaje) {
        // Lógica inteligente de recomendación
        List<FraseMotivadora> frasesCandidatas;

        if (lenguaje != null && !lenguaje.equalsIgnoreCase("general")) {
            // Buscar por contexto y lenguaje específico
            frasesCandidatas = fraseRepository.findByCategoriaAndLenguaje(contexto, lenguaje);
            if (!frasesCandidatas.isEmpty()) {
                return seleccionarFraseAleatoria(frasesCandidatas);
            }
        }

        // Si no hay para el lenguaje específico, buscar solo por contexto
        frasesCandidatas = fraseRepository.findByCategoriaIgnoreCase(contexto);
        if (!frasesCandidatas.isEmpty()) {
            return seleccionarFraseAleatoria(frasesCandidatas);
        }

        // Si no hay para el contexto, frase aleatoria general
        return obtenerFraseAleatoria();
    }

    /**
     * OBTENER FRASE DESTACADA DEL DÍA
     * 
     * Funcionalidad especial: una frase destacada diferente cada día.
     * Usa una lógica determinística basada en la fecha actual.
     * 
     * @return La frase destacada del día
     */
    public Optional<FraseMotivadora> obtenerFraseDestacadaDelDia() {
        List<FraseMotivadora> frasesDestacadas = fraseRepository.findByDestacadaTrue();
        if (frasesDestacadas.isEmpty()) {
            return Optional.empty();
        }

        // Lógica determinística basada en el día del añó
        int diaDelAnio = LocalDateTime.now().getDayOfYear();
        int indiceDelDia = diaDelAnio % frasesDestacadas.size();

        return Optional.of(frasesDestacadas.get(indiceDelDia));
    }

    /**
     * BUSCAR FRASES POR TEXTO
     * 
     * Busqueda inteligente en el contenido de las frases.
     * 
     * @param texto El texto a buscar
     * @return Frases que contienen el texto (case insensitive)
     */
    public List<FraseMotivadora> buscarFrasesPorTexto(String texto) {
        return fraseRepository.findByContenidoContainingIgnoreCase(texto);
    }

    /**
     * OBTENER ESTADÍSTICAS
     * 
     * El coach también proporciona métricas interesantes.
     * 
     * @return String con estadísticas de las frases
     */
    public String obtenerEstadisticas() {
        long totalFrases = fraseRepository.count();
        long frasesDestacadas = fraseRepository.findByDestacadaTrue().size();
        List<String> categorias = fraseRepository.findCategoriasUnicas();

        return String.format("""
                Estadísticas de frases motivadoras:
                * Total de frases: %d
                * Frases destacadas: %d
                * Categorías disponibles: %s
                * Autores únicos: %d""",
                totalFrases,
                frasesDestacadas,
                categorias,
                fraseRepository.findAutoresUnicos().size());
    }

    /**
     * OBTENER CATEGORÍAS DISPONIBLES
     * 
     * Lista todas las categorías únicas disponibles en el sistema.
     * Útil para que los clients sepan qué categorías pueden usar.
     * 
     * @return Lista de categorías únicas
     */
    public List<String> obtenerCategorias() {
        return fraseRepository.findCategoriasUnicas();
    }

    /**
     * MARCAR FRASE COMO DESTACADA
     * 
     * Lógica de negocio para marcar frases especiales.
     * 
     * @param id ID de la frase a destacar
     * @return La frase actualizada, o empty si no existe
     */
    public Optional<FraseMotivadora> marcarFraseComoDestacada(Long id) {
        return fraseRepository.findById(id).map(frase -> {
            frase.marcarComoDestacada();
            return fraseRepository.save(frase);
        });
    }

    /**
     * DESMARCAR FRASE COMO DESTACADA
     * 
     * @param id ID de la frase a desmarcar
     * @return La frase actualizada, o empty si no existe
     */
    public Optional<FraseMotivadora> desmarcarFraseComoDestacada(Long id) {
        return fraseRepository.findById(id).map(frase -> {
            frase.desmarcarComoDestacada();
            return fraseRepository.save(frase);
        });
    }

    /**
     * ===============================
     * MÉTODOS PRIVADOS AUXILIARES
     * ===============================
     */

    /**
     * SELECCIONAR FRASE ALEATORIA DE UNA LISTA
     * 
     * Método helper para la lógica de selección aleatoria.
     * 
     * @param frases Lista de frases candidatas
     * @return Una frase aleatoria de la lista
     */
    private Optional<FraseMotivadora> seleccionarFraseAleatoria(List<FraseMotivadora> frases) {
        if (frases.isEmpty()) {
            return Optional.empty();
        }
        int indiceAleatorio = (int) (Math.random() * frases.size());
        return Optional.of(frases.get(indiceAleatorio));
    }

    private void validarFrase(FraseMotivadora frase) {
        if (frase.getContenido() == null || frase.getContenido().trim().isEmpty()) {
            throw new IllegalArgumentException("El contenido de la frase no puede estar vacío");
        }

        if (frase.getContenido().length() > 500) {
            throw new IllegalArgumentException("La frase no puede contener más de 500 caracteres");
        }

        if (frase.getNivelDificultad() != null && (frase.getNivelDificultad() < 1 || frase.getNivelDificultad() > 5)) {
            throw new IllegalArgumentException("El nivel de dificultad debe estar entre 1 y5");
        }
    }

    /**
     * ==================================
     * NUEVAS FUNCIONALIDADES AVANZADAS (Ejercicios de ampliación)
     * ==================================
     */

    /**
     * OBTENER FRASES PARA UN NIVEL ESPECÍFICO DE DEVELOPER
     * 
     * Filtra frases según el nivel de experiencia del developer:
     * - Nivel 1: Junior (frases de motivación básica)
     * - Nivel 2-3: Mid-level (frases de perseverancia)
     * - Nivel 4-5: Senior/Expert (frases filosóficas y de legado)
     * 
     * @param nivel Nivel de dificultad (1-5)
     * @return Lista de frases apropiadas para ese nivel
     */
    public List<FraseMotivadora> obtenerFrasesParaNivel(Integer nivel) {
        // Validar que el nivel esté en rango
        if (nivel == null || nivel < 1 || nivel > 5) {
            throw new IllegalArgumentException("El nivel debe ser un número entre 1 y 5");
        }

        // Usar el método existente del Repository - ¡mucho más eficiente!
        return fraseRepository.findByNivelDificultad(nivel);
    }

    /**
     * BUSCAR FRASES DE UN AUTOR ESPECÍFICO
     * 
     * Encuentra todas las frases de un autor particular,
     * útil para fans de ciertos pensadores o referentes.
     * 
     * @param autor Nombre del autor a buscar
     * @return Lista de frases de ese autor (case insensitive)
     */
    public List<FraseMotivadora> obtenerFrasesDeAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío");
        }

        // Usar búsqueda por contenido en el autor - ¡más eficiente que traer todo!
        return fraseRepository.findByContenidoContainingIgnoreCase(autor.trim());
    }

    /**
     * OBTENER UNA FRASE DE "EMERGENCIA" PARA MOMENTOS MUY DIFÍCILES
     * 
     * Frases especiales para cuando todo parece ir mal:
     * - Prioriza frases de nivel 5 (expertos, más profundas)
     * - Luego frases destacadas muy motivadoras
     * - Finalmente cualquier frase aleatoria como último recurso
     * 
     * @return Una frase poderosa para momentos críticos
     */
    public Optional<FraseMotivadora> obtenerFraseDeEmergencia() {
        // 1. Primero intentar con frases de nivel 5 (las más profundas)
        List<FraseMotivadora> frasesNivel5 = fraseRepository.findByNivelDificultad(5);
        if (!frasesNivel5.isEmpty()) {
            return seleccionarFraseAleatoria(frasesNivel5);
        }

        // 2. Si no hay nivel 5, buscar frases destacadas
        List<FraseMotivadora> frasesDestacadas = fraseRepository.findByDestacadaTrue();
        if (!frasesDestacadas.isEmpty()) {
            return seleccionarFraseAleatoria(frasesDestacadas);
        }

        // 3. Como último recurso, frase aleatoria usando el método existente
        return fraseRepository.findFraseAleatoria();
    }

}