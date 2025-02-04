# Robot_r2d2

Descripción ¿Dónde está R2D2?¶
Calcula dónde estará un robot (sus coordenadas finales) que se encuentra en una cuadrícula representada por los ejes "x" e "y".

El robot comienza en la coordenada (0, 0).
Para indicarle que se mueva, le enviamos un array formado por enteros (positivos o negativos) que indican la secuencia de pasos a dar. Por ejemplo: [10, 5, -2] indica que primero se mueve 10 pasos, se detiene, luego 5, se detiene, y finalmente 2. El resultado en este caso sería (x: -5, y: 12)
Si el número de pasos es negativo, se desplazaría en sentido contrario al que está mirando.
Los primeros pasos los hace en el eje "y". Interpretamos que está mirando hacia la parte positiva del eje "y".
El robot tiene un fallo en su programación: cada vez que finaliza una secuencia de pasos gira 90 grados en el sentido contrario a las agujas del reloj.
No te olvides lo aprendido en las primeras unidades. Estructura condicionales, repetitivas, comentarios, etc.

Tras los siguientes movimientos:

[10, 5, -2]
[0, 0, 0]
[]
[-10, -5, 2]
[-10, -5, 2, 4, -8]
Las salidas son estas:
x: -5, y: 12, direction: POSITIVEX
x: 0, y: 0, direction: POSITIVEX
x: 0, y: 0, direction: POSITIVEY
x: 5, y: -12, direction: POSITIVEX
x: 9, y: -20, direction: NEGATIVEX
