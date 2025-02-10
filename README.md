# Examen Final de Estructura de Datos

EJERCICIO 1   6pts
EJERCICIO 2.1 2pts
EJERCICIO 2.2 2pts


### Ejercicio 1: Ordenar Estudiantes y Agrupar por Notas

**Enunciado:**  
Implementa un programa que cumpla las siguientes tareas:

1. **Ordenar:**  
   Ordena una lista de estudiantes por su calificación en **orden descendente** utilizando el algoritmo de ordenamiento de tu preferencia (por ejemplo, QuickSort, MergeSort, etc.).

2. **Agrupar:**  
   Agrupa a los estudiantes en categorías basadas en su calificación utilizando un `HashMap`. Emplea la siguiente clasificación:
   ```java
    if (calificacion >= 90) {
        return "A";
    } else if (calificacion >= 80) {
        return "B";
    } else if (calificacion >= 70) {
        return "C";
    } else if (calificacion >= 60) {
        return "D";
    } else {
        return "F";
    }
   ```

3. **Preservar Orden :**  
   Toma la lista de estudiantes ya ordenada y almacénala en un `LinkedHashSet` para mantener el orden de inserción.  
   **Importante:**  
   - Este paso asegura que se preserve la secuencia determinada tras el ordenamiento y se eviten duplicados basados en la igualdad definida.

**Desde el `main`:**  
El programa deberá:
- Enviar el listado pre generado 
- Mostrar la lista ordenada de estudiantes (orden descendente).
- Mostrar la agrupación de estudiantes por categorías.
- Mostrar la lista resultante almacenada la implementación de Set Correspondiente

---

### Ejercicio 2: Procesamiento Avanzado de Texto

#### Parte 1: Contar Frecuencia de Palabras 

**Enunciado:**  
Desarrolla un programa que lea un texto y cuente la frecuencia de cada palabra, ignorando diferencias entre mayúsculas y minúsculas y eliminando signos de puntuación. Utiliza un `HashMap` para almacenar cada palabra junto a su frecuencia.

**Ejemplo de entrada:**
```
¡Hola! Hola, ¿cómo estás? Hola, hola, adiós.
```

**Ejemplo de salida:**
```
hola: 4
cómo: 1
estás: 1
adiós: 1
```

#### Parte 2: Determinar si una Cadena Tiene Caracteres Únicos (Considerando Espacios)

**Enunciado:**  
Implementa un programa que determine si una cadena contiene todos sus caracteres únicos, considerando los espacios como caracteres válidos. Utiliza un `HashSet` para verificar la unicidad de cada carácter.

**Ejemplo de entrada:**
```
abc def
```

**Ejemplo de salida:**
```
La cadena tiene todos los caracteres únicos.
```

**Ejemplo de entrada:**
```
test case
```

**Ejemplo de salida:**
```
La cadena no tiene todos los caracteres únicos.
```

Probar desde MAIN los dos ejemplos para el ejercico 2

