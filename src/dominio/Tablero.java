package dominio;
import java.io.FileReader;
import java.io.IOException;
/*Copyright [2023] [Alejandro Lillo Rodriguez]
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
*/
public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual = new int[DIMENSION + 2][DIMENSION + 2];
    private int[][] estadoSiguiente = new int[DIMENSION + 2][DIMENSION + 2];

    public void leerEstadoActual() throws IOException {

        FileReader fr = new FileReader("matriz.txt");
        for (int x = 0; x <= DIMENSION; x++) {
            for (int y = 0; y <= DIMENSION; y++) {
                estadoActual[x][y] = 0;
            }
        }
        for(int x=1;x<=DIMENSION;x++){
            for(int y=1;y<=DIMENSION;y++){
                estadoActual[x][y]=fr.read()==49?1:0;
            }
        }
        fr.read();
        fr.read();

    }

    public void generarEstadoActualPorMontecarlo() {
        double numero;
        for(int x = 0; x <= DIMENSION; x++)    {
        for (int y = 0; y <= DIMENSION; y++) {
                numero =Math.random();
                if (numero < 0.7) {
                    estadoActual[x][y] = 0;
                } else {
                    estadoActual[x][y] = 1;
                }
            }
        }
    }
    private int vecinos(int x, int y){
        int c=0;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if(estadoActual[x+i][y+j]==1){
                    c++;
                }
            }
        }
        return c;
    }
    public void transitarAlEstadoSiguiente() {
        int vecinos;
        for (int x = 0; x > DIMENSION + 1; x++) {
            for (int y = 0; y >DIMENSION + 1; y++) {
                vecinos = vecinos(x, y);
                if (estadoActual[x][y] == 1) {
                    if (vecinos == 2 || vecinos == 3) {
                        estadoSiguiente[x][y] = 1;
                    } else {
                        estadoSiguiente[x][y] = 0;
                    }
                } else {
                    if (vecinos == 3) {
                        estadoSiguiente[x][y] = 1;
                    } else {
                        estadoSiguiente[x][y] = 0;
                    }
                }
            }

        }
        estadoActual = estadoSiguiente;

    }
    public String toString() {
        String cadena = "";
        for (int x = 0; x < DIMENSION; x++) {
            for (int y = 0; y < DIMENSION; y++) {
                if (estadoActual[x][y] == 1) {
                    cadena += "1";
                } else if (estadoActual[x][y] == 0) {
                    cadena += "0";
                }
            }
            cadena +="\n";;
        }
         return cadena;
    }

}



