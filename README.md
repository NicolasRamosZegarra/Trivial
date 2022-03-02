# Trivial

## Problema 0

Extraemos el codigo duplicado a un unico metodo "nuevaPosicionJugador",
al que llamamos desde ambos sitios

Creamos test unitario "si_al_principio_saco_un_1_voy_a_casilla_1"

## Problema 1

Utilizamos el metodo ya creado "esJugable()" e introducimos datos con el que nos pedira como requisito
imprescindible, la existencia de al menos 2 jugadores

Creamos dos test, el primero: "hay_menos_de_2_jugadores_en_la_partida" en el que nos confirma que 
no hay el minimo de jugadores que pedimos y por lo tanto no se puede jugar. El segundo: "hay_mas_de_2_jugadores_en_la_partida"
que nos confirma que si hay mas de dos jugadores y por lo tanto se puede jugar la partida.

## Problema 2

Utilizamos y aprovechamos el mismo metodo que en el problema 1 y añadimos una regla que limita el maximo
de jugadores siendo como maximo 6 por partida.

Creamos dos test, que nos indica, el primero "hay_mas_de_6_jugadores_en_la_partida" que si hay mas
de 6 jugadores la partida no puede empezar, y el segundo "hay_menos_o_igual_de_6_jugadores_en_la_partida" 
nos confirma que si hay menos o igual que 6 jugadores la partida puede comenzar

## Problema 3 

Colocamos un false en el if de en el jugadorActual del if en el metodo "fueRespuestaCorrecta", queriendo decir
que si la respuesta es correcto del player, la posicion de la casillaCastigo es falsa.

Creamos un test, en el que comprobamos en la primera jugadora que tras fallar la pregunta y lanzar el dado, cae par por lo cual no sale de la carcel
sin embargo, vemos que la segunda jugadora falla la pregunta pero cuando tira el dad cae par por lo cual sale de la carcel

## Problema 4
Invertimos el elemento noGanador añadiendo un elemento Ganador, definimos en el metodo que si dados los puntos
fallas la pregunta pierdes y si aciertas ganas

## Problema 5

Extraemos el metodo y los sustituimos donde estaba situado.

## Problema 6

Reducimos el codigo del metodo, eliminando lo repetido. Extraemos un metodo llamado "respuestaCorrectaConteoMonedas" con 
el contenido de repeticion para simplificar.

