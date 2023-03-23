# Practica2


# Class Tablero
Contiene 3 atributos, uno que guarda las dimensiones de la matriz , el atributo estado actual que es la matriz inicial y un tercer atributo llamado estadosiguiente
que guarda la matriz que surge de realizar los cambios correspondientes mediante el juego de la vida
En esta clase encontramos 4 metodos el primero que trata de leer èl la matriz ya creada en el fichero matriz.txt
En el segundo metodo creamos el estado inicial mediante montecarlo creando nosotros una nueva matriz en el estado inicial diferente a la creada en el fichero.
En el tercero transitamos al estado siguiente sugiendo las reglas del estado de la vida 
Y en el ultimo metodo enseñamos la matriz por pantalla mediante un toString.


# Class Principal
Trata de llamar los metodos de la clase tablero y realiza las dos formas del juego, leyendo la matriz del fichero y en el segundo caso creando esa matriz
de forma aleatoria 

# License
Copyright [2023] [Alejandro Lillo Rodriguez]
        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0
        Unless required by applicable law or agreed to in writing,
        software distributed under the License is distributed on an
        "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
        either express or implied. See the License for the specific
        language governing permissions and limitations under the
        License.
