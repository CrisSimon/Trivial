# Trivial

## Problema 0

Extraemos el código duplicado a un unico métod "nuevaPosicionJugador".
al que llamamos desde ambos sitios.

Creamos test unitario "si_al_principio_saco_un_1_voy_casilla_1".

## Problema 1

Añadimos un condicional al metodo esJugable para que no de opción de segir si no cumple la condicion de minimo de jugadores.

Acontinuación aplicamos el metodo esJugable en el main para que cumpla su funcion antes de comenzar la partida.

Creamos un test unitario "con_1_jugador_no_hay_partida".

## Problema 2

Añadimos en el metodo esJugable la condicion de ser 6 o menos jugadores.

En el main añadimos un try-cath para solucionar el bug de añadir al sesto jugador.

## Problema 3

En el metodo fueRespuestaCorrecta tras la condicion de que el jugador esta en la carcel y saca una puntuacion en el dado de un numero impar,
cambiamos la variable booleana de enCasillaCastigo[jugadorActual] a false, y de este modo cambiamos la condicion del jugador ahora es libre.

## Problema 4

Primero en el metodo jugadorHaGanado cambiamos la variable para que devulva true,
en el metodo fueRespuestaCorrecta invertimos el return a false,
y en el metodo respuestaIncorrecta actualizamos el retunr para que devuelva ganador.

Por ultimo en la clase main invertimos la variable del while para que mientras Ganador no sea true el juego comtinua.

