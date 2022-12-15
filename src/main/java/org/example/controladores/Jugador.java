package org.example.controladores;
import java.util.Scanner;
public class Jugador {



        Scanner entradaPorTeclado=new Scanner(System.in);

        private int numeroJugador;

        private String nombre;

        private String apellido;

        private String posicion;

        private int edad;

        private String equipo;

        public Jugador() {
        }

        public Jugador(int numeroJugador, String nombre, String apellido, String posicion, int edad, String equipo) {
            this.numeroJugador = numeroJugador;
            this.nombre = nombre;
            this.posicion = posicion;
            this.apellido = apellido;
            this.edad = edad;
            this.equipo = equipo;
        }


        public int getNumeroJugador() {
            return numeroJugador;
        }

        public void setNumeroJugador(int numeroJugador) {
            this.numeroJugador = numeroJugador;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getPosicion() {
            return posicion;
        }

        public void setPosicion(String posicion) {
            this.posicion = posicion;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            while(edad <= 17){
                System.out.print("La edad debe ser igual o mayor de 18 años, ingresa la edad nuevamente: ");
                edad = entradaPorTeclado.nextInt();
            }
            this.edad = edad;
        }

        public String getEquipoJugador() {
            return equipo;
        }

        public void setEquipoJugador(String equipoJugador) {
            this.equipo = equipoJugador;
        }





}
