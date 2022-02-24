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
