-- 📄 ARCHIVO: data.sql
-- 🎯 PROPÓSITO: Poblar la base de datos con frases motivadoras para developers
-- ⚡ Spring Boot ejecuta este archivo automáticamente al iniciar la aplicación
-- 💡 Las frases están categorizadas por momentos específicos del desarrollo

-- ==================================================
-- 🗃️ CONFIGURACIÓN INICIAL (OPCIONAL)
-- ==================================================

-- 🔄 Limpiar tablas existentes (útil para desarrollo)
-- DELETE FROM frase_motivadora;

-- ==================================================
-- 🌟 FRASES MOTIVADORAS - DEBUGGING Y RESOLUCIÓN DE PROBLEMAS
-- ==================================================
-- 💡 Para cuando los bugs parecen imposibles y las horas se acumulan

-- 🐛 Frase 1: Debugging como detective
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El debugging es como ser detective en una película de crimen donde tú también eres el asesino.', 
    'Anónimo', 
    'debugging', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🔍 Frase 2: Persistencia en debugging
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'No importa cuántas veces hayas depurado ese código, siempre hay un bug esperando ser encontrado. La persistencia es clave.', 
    'Linus Torvalds', 
    'debugging', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🎯 Frase 3: Enfoque en debugging
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El mejor debugger del mundo es una buena noche de sueño. A veces la solución aparece cuando dejas de buscar desesperadamente.', 
    'Brian Kernighan', 
    'debugging', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 📚 FRASES MOTIVADORAS - APRENDIZAJE Y CRECIMIENTO
-- ==================================================
-- 💡 Para cuando estás aprendiendo nuevas tecnologías o sintiéndote abrumado

-- 🌱 Frase 4: Sobre el proceso de aprendizaje
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El único programador ''malo'' es el que deja de aprender. Cada error es una lección disfrazada.', 
    'John Johnson', 
    'aprendizaje', 
    'general', 
    2, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🚀 Frase 5: Aprendizaje continuo
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'En el desarrollo de software, el día que dejas de aprender es el día que deberías considerar cambiar de profesión.', 
    'Robert C. Martin', 
    'aprendizaje', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 💫 Frase 6: Sobre la curva de aprendizaje
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'No te preocupes si no entiendes todo al principio. La programación es un viaje, no un destino.', 
    'Ada Lovelace', 
    'aprendizaje', 
    'general', 
    1, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 🚀 FRASES MOTIVADORAS - DEPLOYMENT Y PRODUCCIÓN
-- ==================================================
-- 💡 Para esos momentos de nervios antes de desplegar a producción

-- 🌪️ Frase 7: Sobre el deployment
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Desplegar a producción siempre da miedo, pero recuerda: si no desplegamos, nuestro código no sirve a nadie.', 
    'Martin Fowler', 
    'deployment', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 📦 Frase 8: Deployment continuo
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Un deployment exitoso es como lanzar un cohete: requiere preparación, pruebas y coraje.', 
    'Gene Kim', 
    'deployment', 
    'general', 
    5, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- ⭐ FRASES MOTIVADORAS - MOMENTOS DIFÍCILES Y ESTRÉS
-- ==================================================
-- 💡 Para cuando todo parece salir mal y necesitas un empujón anímico

-- 💪 Frase 9: Sobre la perseverancia
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El código no funciona y no sabes por qué. Respira. Tómate un café. Vuelve con ojos frescos. Tú puedes con esto.', 
    'Anónimo', 
    'estres', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🌈 Frase 10: Sobre los momentos difíciles
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Los mejores desarrolladores no son los que nunca fallan, sino los que nunca se rinden después de fallar.', 
    'Grace Hopper', 
    'estres', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 💻 FRASES ESPECÍFICAS POR LENGUAJE DE PROGRAMACIÓN
-- ==================================================
-- 💡 Para developers que trabajan con tecnologías específicas

-- ☕ Frase 11: Para developers Java
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Java te enseña paciencia y estructura. Aprenderlo bien es como dominar un arte marcial: requiere disciplina pero te hace más fuerte.', 
    'James Gosling', 
    'aprendizaje', 
    'java', 
    3, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🟨 Frase 12: Para developers JavaScript
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'JavaScript puede ser impredecible, pero esa flexibilidad es también su mayor fortaleza. Domínalo y serás imparable.', 
    'Brendan Eich', 
    'aprendizaje', 
    'javascript', 
    3, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🐍 Frase 13: Para developers Python
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Python te permite concentrarte en resolver problemas en lugar de pelearte con la sintaxis. La simplicidad es sofisticación.', 
    'Guido van Rossum', 
    'aprendizaje', 
    'python', 
    2, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 🎯 FRASES PARA DIFERENTES NIVELES DE EXPERIENCIA
-- ==================================================
-- 💡 Desde principiantes hasta expertos

-- 👶 Frase 14: Para principiantes absolutos (Nivel 1)
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    '¡Felicidades por escribir tu primera línea de código! Hoy eres mejor developer que ayer, y mañana serás mejor que hoy.', 
    'Anónimo', 
    'motivacion_general', 
    'general', 
    1, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🧑‍💻 Frase 15: Para developers junior (Nivel 2)
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'No te compares con developers con 10 años de experiencia. Compárate con quien eras hace 6 meses y celebra tu progreso.', 
    'Anónimo', 
    'motivacion_general', 
    'general', 
    2, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 👨‍💼 Frase 16: Para seniors y leads (Nivel 5)
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Tu valor como senior no está en cuánto código escribes, sino en cuánto ayudas a otros a crecer y en las decisiones arquitectónicas que tomas.', 
    'Anónimo', 
    'liderazgo', 
    'general', 
    5, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 🔄 FRASES SOBRE MEJORA CONTINUA Y REFACTORIZACIÓN
-- ==================================================

-- 🏗️ Frase 17: Sobre código legacy y refactorización
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El código legacy no es ''malo código'', es código que tuvo el valor de ser escrito cuando nadie más sabía cómo hacerlo.', 
    'Kent Beck', 
    'refactoring', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ✨ Frase 18: Sobre la mejora continua
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Primero hazlo funcionar, luego hazlo bien, finalmente hazlo rápido. Esta es la danza del desarrollo.', 
    'Kent Beck', 
    'mejora_continua', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 🧠 FRASES SOBRE MENTALIDAD Y ENFOQUE
-- ==================================================

-- 🧘 Frase 19: Sobre la mentalidad de crecimiento
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El mayor enemigo de un developer no es la complejidad técnica, sino la voz interior que dice ''no puedo con esto''.', 
    'Carol Dweck', 
    'mentalidad', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🎯 Frase 20: Sobre el enfoque y productividad
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Una hora de código concentrado vale más que ocho horas de distracciones constantes. Protege tu tiempo de deep work.', 
    'Cal Newport', 
    'productividad', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 🎉 FRASE EXTRA ESPECIAL (La número 21 por si acaso)
-- ==================================================

-- 🌟 Frase 21: Frase motivadora general
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Cada línea de código que escribes es un paso hacia el developer que quieres ser. Sigue codificando, sigue aprendiendo, sigue creciendo.', 
    'Anónimo', 
    'motivacion_general', 
    'general', 
    2, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);