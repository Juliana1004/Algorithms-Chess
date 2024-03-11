# Project-chess

Entrega de medio término del proyecto Chess hecho en Java, se hace el uso de 2 algoritmos de ordenamiento (Bubble Sort, Insertion Sort y Quick Sort) y arrays randoms con el fin de hacer una mejor prueba de los algoritmos.


## Como iniciar

Ejecuta el programa por consola de la siguiente forma
java Main a=ALGORITMO c=TIPO o=COLOR r=CANTIDAD DE FICHAS s=VELOCIDAD

Valores válidos:
* a: b(Bubble Sort) o i(Insertion Sort)
* t: c(Carácter) o n(Entero)
* o: B(Black) o W(White)
* r: 1 || 2 || 4 || 6 || 8 || 10 || 16
* in: r
* s: 100<=s>=1000

Ej: a=i t=n o=b r=8 s=140

## Claes Principales

* Main: Encargada de empezar la ejecución del programa de ordenamiento.
* Validations: Encargada de validar los datos ingresados sean correctos.
* Bubble Sort, Insertion Sort y Quick Sort: Implementan los algoritmos de ordenamiento.
* SortingAlgorithmRunner: Encargada de la ejecución e impresión de los algoritmos.
* CrateArray: Encargada de la creación de los array.

## Diagrama de Clases

![Alt text](image.png)

## Requisitos

- Java version: 17.0.10

