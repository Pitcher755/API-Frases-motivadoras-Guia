package com.motivacion.frasesmotivadoras.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * ARCHIVO: FraseMotivadora.java
 * ENTIDAD: Representa una frase motivadora en nuestra base de datos
 * 
 * Esta clase es el "molde" o "plantilla" para cada frase que guardemos.
 * Cada instancia de esta clase = una fila en la tabla FRASE_MOTIVADORA de la
 * BD.
 * 
 * CARACTERÍSTICAS DE UNA FRASE:
 * - Contenido inspirador para developers
 * - Autor (famoso o anónimo)
 * - Categoría (aprendizaje, debugging, etc.)
 * - Lenguaje de programación asociado
 * - Nivel de dificultad al que va dirigida
 * - Fecha de creación y última modificación
 * 
 * @author PitcherDev
 * @version 1.0
 * @since 2025
 */
@Entity // ¡Esta anotación convierte la clase en una entidad de BD!
@Table(name = "frase_motivadora") // Opcional: personaliza el nombre de la tabla
public class FraseMotivadora {

    /**
     * IDENTIFICADOR ÚNICO: La "matrícula" de cada frase
     * 
     * Cada frase necesita un identificador único para poder ser encontrada,
     * actualiza o elimina sin confusiones.
     * 
     * Características:
     * - @Id: Marca este campo como la clave primaria
     * - @GeneratedValue: La BD genera automáticamente el valor (auto-increment)
     * - Strategy.IDENTITY: Usa la auto-incrementación de la base de datos
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * CONTENIDO: La frase motivadora en sí
     * 
     * Esta es la parte más importante: el mensaje inspirador
     * que ayudará a otros developers en momentos difíciles.
     * 
     * @Column: Podemos personlaizar cómo se guarda en la BD
     *          - nullable = false: Este campo es OBLIGATORIO
     *          - length = 500: Máximo 500 caracteres (suficiente para una frase)
     */
    @Column(name = "contenido", nullable = false, length = 500)
    private String contenido;

    /**
     * AUTOR: Quién dijo o escribió la frase
     * 
     * Puede ser un developer famoso, un autor famoso,
     * o incluso "Anónimo" si no conocemos el origen.
     * 
     * Ejemplos: "Kent Beck", "Martin Fowler", "Desconocido"
     */
    @Column(name = "autor", length = 100)
    private String autor;

    /**
     * CATEGORÍA: El contexto o situación de la frase
     * 
     * Clasifica la frase según el momento de desarrollo al que va dirigida.
     * Esto nos permitirá después buscar frases por categoría.
     * 
     * Ejemplos:
     * - "aprendizaje" (para cuando estás aprendiendo algo nuevo)
     * - "debugging" (para cuando tienes bugs difíciles)
     * - "deployment" (para cuando haces deploy a producción)
     * - "motivación_general" (frases universales)
     */
    @Column(name = "categoria", length = 50)
    private String categoria;

    /**
     * LENGUAJE: Lenguaje de programación asociado
     * 
     * Algunas frases son específicas para ciertos lenguajes,
     * otras son generales para cualquier developer.
     * 
     * Ejemplos: "java", "javascript", "python", "general"
     */
    @Column(name = "lenguaje", length = 30)
    private String lenguaje;

    /**
     * NIVEL DE DIFICULTAD: A qué nivel de developer va dirigida
     * 
     * Escala del 1 al 5:
     * -1: Principiante total (primeras líneas de código)
     * -2: Junior (primer proyecto)
     * -3: Mid-level (varios proyectos)
     * -4: Senior (experiencia considerable)
     * -5: Experto (architect, lead, etc.)
     */
    @Column(name = "nivel_dificultad")
    private Integer nivelDificultad;

    /**
     * FRASE DESTACADA: Si es una frase especialmente inspiradora
     * 
     * Marcaremos algunas frases como destacadas para poder
     * mostrarlas en lugares especiales de nuestra API.
     */
    @Column(name = "destacada")
    private Boolean destacada = false;

    /**
     * FECHA DE CREACIÓN: Cuándo se añadió la frase al sistema
     * 
     * Se guarda automáticamente cuando creamos una nueva frase.
     * Útil para saber cuándo se añadió cada inspiración
     */
    @Column(name = "fecha_Creacion")
    private LocalDateTime fechaCreacion;

    /**
     * FECHA DE MODIFICACIÓN: Cuándo se actualizó por última vez
     * 
     * Se actualiza automáticamente cuando modificamos la frase.
     */
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    // ================================================
    // CONSTRUCTORES: Diferentes formas de crear frases
    // ================================================

    /**
     * CONSTRUCTOR VACÍO (OBLIGATORIO para JPA)
     * 
     * Spring Boot y JPA necesitan un constructor sin argumentos
     * para poder crear instancias de la entidad.
     * 
     * Aunque no lo uses directamente, DEBE existir
     */
    public FraseMotivadora() {
        // Constructor vacío requerido por JPA
    }

    /**
     * CONSTRUCTOR CON PARÁMETROS BÁSICOS
     * 
     * Para crear frases rápidamente con los datos esenciales.
     * Los campos opcionales se inicializan con valores por defecto.
     * 
     * @param contenido La frase moticvadora (OBLIGATORIA)
     * @param autor     Quién dijo la frase
     * @param categoria Contexto o situación
     */
    public FraseMotivadora(String contenido, String autor, String categoria) {
        this.contenido = contenido;
        this.autor = autor;
        this.categoria = categoria;
        this.lenguaje = "general"; // Valor por defecto
        this.nivelDificultad = 3; // Nivel medio por defecto
        this.destacada = false;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
    }

    /**
     * CONSTRUCTOR COMPLETO
     * 
     * Para cuando queremos especificar todos los detalles de la frase.
     * 
     * @param contenido       La frase Motivadora
     * @param autor           Autor de la frase
     * @param categoria       Categoría o contexto
     * @param lenguaje        Lenguaje de programación
     * @param nivelDificultad Nivel de developer (1-5)
     * @param destacada       Si es una frase especial
     */
    public FraseMotivadora(String contenido, String autor, String categoria, String lenguaje, int nivelDificultad,
            Boolean destacada) {
        this.contenido = contenido;
        this.autor = autor;
        this.categoria = categoria;
        this.lenguaje = lenguaje;
        this.nivelDificultad = nivelDificultad;
        this.destacada = destacada;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
    }

    // ============================================
    // MÉTODOS DE ACCESO (GETTERS Y SETTERS)
    // ============================================

    /**
     * GETTERS: Métodos para OBTENER los valores de los campos
     * 
     * Siguen el patrón: get + NombreCampo (con primera mayúscula)
     * Ejemplo: getContenido(), getAutor(), etc.
     * 
     * @return
     */
    public Long getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public Integer getNivelDificultad() {
        return nivelDificultad;
    }

    public Boolean getDestacada() {
        return destacada;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * SETTERS: Métodos para MODIFICAR los valores de los campos
     * 
     * Siguen el patrón: set + NombreCampo (con primera mayúscula)
     * Ejemplo: setContenido(), setAutor(), etc.
     * 
     * En los setters de fechas, añadimos lógica adicional
     */
    public void setId(Long id) {
        this.id = id;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
        actualizarFechaModificacion(); // Actualiza la fecha al cambiar contenido
    }

    public void setAutor(String autor) {
        this.autor = autor;
        actualizarFechaModificacion();
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        actualizarFechaModificacion();
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
        actualizarFechaModificacion();
    }

    public void setNivelDificultad(Integer nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
        actualizarFechaModificacion();
    }

    public void setDestacada(Boolean destacada) {
        this.destacada = destacada;
        actualizarFechaModificacion();
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    // ===========================================
    // MÉTODOS AUXILIARES (Lógica de negocio)
    // ===========================================

    /**
     * ACTUALIZAR FECHA DE MODIFICACIÓN
     * 
     * Método privado que se llama automáticamente cuando
     * modificamos cualquier campo de la frase.
     * 
     * Esto asegura que siempre tengamos la fecha actualizada
     */
    private void actualizarFechaModificacion() {
        this.fechaActualizacion = LocalDateTime.now();
    }

    /**
     * MARCAR COMO DESTACADA
     * 
     * Método especial para marcar una frase como destacada.
     * Más leginle que usar setDestacada(true).
     */
    public void marcarComoDestacada() {
        this.destacada = true;
        actualizarFechaModificacion();
    }

    /**
     * DESMARCAR COMO DESTACADA
     * 
     * Método especial para quitar el destacado de una frase.
     */
    public void desmarcarComoDestacada() {
        this.destacada = false;
        actualizarFechaModificacion();
    }

    /**
     * MÉTODO toString() - Representacióin en texto de la frase
     * 
     * Útil para logging y debugging. Nos muestra la frase
     * de forma legible cuando la imprimamos en consola.
     * 
     * @return String con los detalles de la frase
     */
    @Override
    public String toString() {
        return "FraseMotivadora{" +
                "id=" + id +
                ", contenido='" + contenido + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria'" + categoria + '\'' +
                ", lenguaje='" + lenguaje + '\'' +
                ", nivelDificultad=" + nivelDificultad +
                ", destacada=" + destacada +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }

    /**
     * MÉTODO equals() - Comparar si dos frases son iguales
     * 
     * Dos frases se consideran iguales si tienen el mismo ID
     * (que es único en la base de datos).
     * 
     * @param obj El objeto a comparar
     * @return true si son la misma frase, false di no
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        FraseMotivadora that = (FraseMotivadora) obj;
        return id != null && id.equals(that.id);
    }

    /**
     * MÉTODO hashCode() - Código hash para colecciones
     * 
     * Necesario cuado sobrescribimos equals().
     * Usa el ID para generar el código hash.
     * 
     * @return Código hash basado en el ID
     */
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
