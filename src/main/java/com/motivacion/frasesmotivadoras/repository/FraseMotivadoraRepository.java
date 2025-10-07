package com.motivacion.frasesmotivadoras.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.motivacion.frasesmotivadoras.model.FraseMotivadora;

/**
 * ARCHIVO: FraseMotivadoraRepository.java
 * REPOSITORY: El "bibliotecario" que gestiona nuestras frases motivadoras
 * 
 * Esta interfaz es nuestro acceso a la base de datos para las frases.
 * Spring Data JPA genera automáticamente la implementación completa.
 * 
 * FUNCIONALIDADES PRINCIPALES:
 * - Guardar nuevas frases motivadoras
 * - Buscar frases por ID, categoría, autor, etc.
 * - Recuperar listas de frases (todas, destacadas, por lenguaje)
 * - Actualizar y eliminar frases
 * - Consultas personalizadas para necesidades específicas
 * 
 * LA MAGIA: Extendemos JpaRepository y obtenemos +20 métodos gratis
 * 
 * @author PitcherDev
 * @version 1.0
 * @since 2025
 */
@Repository // Marca esta interfaz como un componente de acceso a datos
public interface FraseMotivadoraRepository extends JpaRepository<FraseMotivadora, Long> {

        /**
         * ===================================================
         * MÉTODOS AUTOMÁTICOS POR CONVENCIÓN (MAGIA SPRING)
         * ===================================================
         * 
         * Spring Data JPA genera el SQL automáticamente basandose en el nombre del
         * método.
         * Convención: findBy + NombreCampo + (Condiciones)
         */

        /**
         * BUSCAR FRASES POR CATEGORÍA (Ignore Case = sin distinguir mayúsculas)
         * 
         * Ejemplo de uso:
         * - findByCategoria("debugging") -> busca frases de debugging
         * - findByCategoria("aprendizaje") -> frases para aprender
         * 
         * SQL generado automáticamente:
         * SELECT * FROM frase_motivadora WHERE LOWER(categoria) = LOWER(?)
         * 
         * @param categoria La categoría a buscar (ej: "debugging", "aprendizaje")
         * @return Lista de frases que pertenecen a esa categoría
         */
        List<FraseMotivadora> findByCategoriaIgnoreCase(String categoria);

        /**
         * BUSCAR FRASES POR LENGUAJE DE PROGRAMACIÓN
         * 
         * Ejemplo de uso:
         * - findByLenguaje("java") -> frases específicas para Java
         * - findByLenguaje("javascript") -> frases para JavaScript
         * - findByLenguaje("general") -> frases para cualquier lenguaje
         * 
         * @param lenguaje El lenguaje de programación
         * @return Lista de frases para ese lenguaje
         */
        List<FraseMotivadora> findByLenguaje(String lenguaje);

        /**
         * BUSCAR FRASES DESTACADAS
         * 
         * Encuentra todas las frases marcadas como destacadas.
         * Útil para mostrar frases especiales en la página principal.
         * 
         * @return Lista de frases destacadas
         */
        List<FraseMotivadora> findByDestacadaTrue();

        /**
         * BUSCAR FRASES POR NIVEL DE DIFICULTAD
         * 
         * Ejemplo de uso:
         * - findByNivelDificultad(1) -> frases para principiantes absolutos
         * - findByNivelDificultad(5) -> frases para developers expertos
         * 
         * @param nivelDificultad El nivel (1-5)
         * @return Lista de frases para ese nivel
         */
        List<FraseMotivadora> findByNivelDificultad(Integer nivelDificultad);

        /**
         * BUSCAR FRASES POR AUTOR Y CATEGORÍA (combinación)
         * 
         * Ejemplo:
         * - findByAutorAndCategoria("Kent Beck", "tdd")
         * -> Frases de Kent Beck sobre TDD
         * 
         * @param autor     El autor de las frases
         * @param categoria La categoría a filtrar
         * @return Lista de frases que cumplen ambos criterios
         */
        List<FraseMotivadora> findByAutorAndCategoria(String autor, String categoria);

        /**
         * BUSCAR FRASES POR CATEGORÍA Y LENGUAJE (Ejercicio de ampliación 1)
         * 
         * @param categoria La categoría a filtrar
         * @param lenguaje  El lenguaje de programación
         * @return Lista de frases que cumplen ambos criterios
         */
        List<FraseMotivadora> findByCategoriaAndLenguaje(String categoria, String lenguaje);

        /**
         * BUSCAR FRASES POR CONTENIDO (búsqueda parcial)
         * 
         * Busca frases que contengan cierto texto en su contenido.
         * Ejemplo:
         * - findByContenidoContaining("código")
         * -> Frases que contengan la palabra "código"
         * 
         * SQL: SELECT * FROM frase_motivadora WHERE contenido LIKE '%?%'
         * 
         * @param texto El texto a buscar dentro del contenido
         * @return Lista de frases que contienen ese texto
         */
        List<FraseMotivadora> findByContenidoContainingIgnoreCase(String texto);

        /**
         * BUSCAR FRASES POR CONTENIDO QUE EMPIECE POR CIERTO TEXTO (Ejercicio 2)
         * 
         * Busca frases que empiecen por cierto texto en su contenido
         * 
         * SQL: SELECT * FROM frase_motivadora WHERE contenido LIKE '?%'
         * 
         * @param inicio El inicio de la frase
         * @return Lista de frases que comienzan por ese inicio
         */
        List<FraseMotivadora> findByContenidoStartingWithIgnoreCase(String inicio);

        /**
         * CONTAR FRASES POR CATEGORÍA
         * 
         * Ejemplo de uso:
         * - countByCategoria("debugging") -> cuántas frases de debuggin tenemos
         * 
         * @param categoria La categoría a contar
         * @return Numero de frases en esa categoría
         */
        Long countByCategoria(String categoria);

        /**
         * CONTAR FRASES POR LENGUAJE (Ejercicio 3)
         * 
         * @param lenguaje EL lenguaje a contar
         * @return Numero de frases en ese lenguaje
         */
        Long countByLenguaje(String lenguaje);

        /**
         * VERIFICAR SI EXISTE UNA FRASE POR AUTOR Y CONTENIDO
         * 
         * Útil para evitar duplicados cuando añadimos nuevas frases.
         * 
         * @param autor     El autor a verificar
         * @param contenido El contenido a verificar
         * @return true si existe, false si no
         */
        Boolean existsByAutorAndContenido(String autor, String contenido);

        /**
         * BUSCAR FRASE POR CONTENIDO EXACTO
         * 
         * Encuentra una frase específica por su contenido exacto.
         * 
         * @param contenido El contenido exacto de la frase
         * @return Optional con la frase si existe
         */
        Optional<FraseMotivadora> findByContenido(String contenido);

        /**
         * ===============================================
         * CONSULTAS PERSONALIZADAS CON @Query (SQL/JPQL)
         * ===============================================
         * 
         * Para consultas más complejas que no podemos expresar por convención de
         * nombres.
         * Usamos JPQL (Java Persistance Query Language) - similar a SQL pero con
         * objetos Java.
         */

        /**
         * BUSCAR FRASES ALEATORIAS (consulta personalizada)
         * 
         * Esta consulta no se puede hacer por convención de nombres,
         * así que escribimos la query manualmente con @Query.
         * 
         * SQL nativo: ORDER BY RAND() LIMIT 1
         * 
         * @return Una frase aleatoria de la base de datos
         */
        @Query(value = "SELECT * FROM frase_motivadora ORDER BY RAND () LIMIT 1", nativeQuery = true)
        Optional<FraseMotivadora> findFraseAleatoria();

        /**
         * BUSCAR FRASES RECIENTES (últimas 10 añadidas)
         * 
         * Encuentra las frases más recientes ordenadas por fecha de creación.
         * 
         * @return Lista de las 10 frases más recientes
         */
        @Query("SELECT f FROM FraseMotivadora f ORDER BY f.fechaCreacion DESC LIMIT 10")
        List<FraseMotivadora> findFrasesRecientes();

        /**
         * BUSCAR FRASES POR RANGO DE FECHAS
         * 
         * Encuentra frases creadas entre dos fechas específicas.
         * 
         * @param fechaInicio Fecha de inicio del rango
         * @param fechaFin    Fecha de fin del rango
         * @return Frases creadas en ese periodo
         */
        @Query("SELECT f FROM FraseMotivadora f WHERE f.fechaCreacion BETWEEN :fechaInicio AND :fechaFin")
        List<FraseMotivadora> findFrasesEntreFechas(@Param("fechaInicio") java.time.LocalDateTime fechaInicio,
                        @Param("fechaFin") java.time.LocalDateTime fechaFin);

        /**
         * BUSCAR FRASES POR MÚLTIPLES CATEGORÍAS
         * 
         * Encuentra frases que pertenezcan a cualquiera de las categorías específicas.
         * 
         * @param categorias Lista de categorías a buscar
         * @return Frases que coinciden con alguna categoría
         */
        @Query("SELECT f FROM FraseMotivadora f WHERE f.categoria IN :categorias")
        List<FraseMotivadora> findFrasesPorCategorias(@Param("categorias") List<String> categorias);

        /**
         * CONTAR FRASES DESTACADAS POR CATEGORÍA
         * 
         * Cuenta cuántas frases destacadas hay en cada categoría.
         * 
         * @param categoria La categoría a contar
         * @return Número de frases destacadas en esa categoría
         */
        @Query("SELECT COUNT(f) FROM FraseMotivadora f WHERE f.destacada = true AND f.categoria = :categoria")
        Long countDestacadasByCategoria(@Param("categoria") String categoria);

        /**
         * BUSCAR FRASES POR NIVEL DE DIFICULTAD Y LENGUAJE
         * 
         * Consulta compleja que combina múltiples criterios.
         * 
         * @param nivelDificultad Nivel de dificultad (1-5)
         * @param lenguaje        Lenguaje de programación
         * @return Frases que cumplen ambos criterios
         */
        @Query("SELECT f FROM FraseMotivadora f WHERE f.nivelDificultad = :nivel AND f.lenguaje = :lenguaje")
        List<FraseMotivadora> findFrasesPorNivelYLenguaje(@Param("nivel") Integer nivelDificultad,
                        @Param("lenguaje") String lenguaje);

        /**
         * BUSCAR AUTORES ÚNICOS (sin duplicados)
         * 
         * Encuentra todos los autores distintos que tenemos en la base de datos.
         * 
         * @return Lista de nombres de autores únicos
         */
        @Query("SELECT DISTINCT f.autor FROM FraseMotivadora f WHERE f.autor IS NOT NULL")
        List<String> findAutoresUnicos();

        /**
         * BUSCAR CATEGORÍAS ÚNICAS
         * 
         * Encuentra todas las categorías distintas que tenemos.countBy
         * 
         * @return Lista de categorías únicas
         */
        @Query("SELECT DISTINCT f.categoria FROM FraseMotivadora f WHERE f.categoria IS NOT NULL")
        List<String> findCategoriasUnicas();

}