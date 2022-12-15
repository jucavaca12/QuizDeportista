package org.example;


import org.example.controladores.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaPorTeclado=new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        int option;
        int contador = 0;

        System.out.println("******BUENAS TARDES LOS CONVOCADOS SON:*************");
        System.out.println("*****************************************************");

        do {
            System.out.println("\n***** ELIJA LA OPCION QUE DESEE *****");
            System.out.println("-------------------------------------------");
            System.out.println  (      "1. Agregar un jugador ");
            System.out.println  (      "2. Buscar un jugador ");
            System.out.println  (      "3. Editar informacion de un jugador");
            System.out.println  (      "4. Ver todos jugadores");
            System.out.println  (      "5. salir. ");
            System.out.println("-------------------------------------------- ");
            System.out.print    (       "Digite una opcion: ");



            option = entradaPorTeclado.nextInt();

            switch (option){
                case 1:
                    Jugador objetoJugador = new Jugador();
                    if( contador == 23){

                        System.out.println("NO CONVOCAR MAS JUGADORES");

                    }else{
                        System.out.println("\nDatos del  Jugador ");
                        System.out.println("Ingrese el numero de la camiseta: ");
                        objetoJugador.setNumeroJugador(entradaPorTeclado.nextInt());
                        System.out.print("-Nombre del jugador: ");
                        objetoJugador.setNombre(entradaPorTeclado.next());
                        System.out.print("-Apellido del jugador: ");
                        objetoJugador.setApellido(entradaPorTeclado.next());
                        System.out.print("-Posición del jugador : ");
                        objetoJugador.setPosicion(entradaPorTeclado.next());
                        System.out.print("-Edad del jugador: ");
                        objetoJugador.setEdad(entradaPorTeclado.nextInt());
                        System.out.print("-Equipo donde juega: ");
                        objetoJugador.setEquipoJugador(entradaPorTeclado.next());

                        jugadores.add(objetoJugador);
                        contador++;
                    }

                    break;
                case 2:
                    int buscarJugador;
                    System.out.println("\nBuscar Jugador");
                    System.out.print("*Ingrese el numero del jugador que desea buscar:");
                    buscarJugador = entradaPorTeclado.nextInt();
                    boolean jugadorNoEncontrado = false;
                    for (Jugador jugador:jugadores) {
                        if(jugador.getNumeroJugador() == buscarJugador){
                            System.out.println("*El numero de la camisa es: " + jugador.getNumeroJugador());
                            System.out.println("*El nombre del jugador es: " + jugador.getNombre());
                            System.out.println("*El apellido del jugador es: " + jugador.getApellido());
                            System.out.println("*La posicion del jugador es: " + jugador.getPosicion());
                            System.out.println("*La edad del jugador es: " + jugador.getEdad());
                            System.out.println("*El equipo donde juega es: " + jugador.getEquipoJugador());
                            jugadorNoEncontrado = false;
                            break;
                        }else{
                            jugadorNoEncontrado = true;
                        }
                    }
                    if(jugadorNoEncontrado){
                        System.out.println("El jugador no fue encontrado.");
                    }else{
                        System.out.println("La busqueda fue exitosa");
                    }
                    break;

                case 3:
                    int editarJugador;
                    System.out.println("\nEditar jugador");
                    System.out.print("-Ingrese el número del jugador que desea editar: ");
                    editarJugador = entradaPorTeclado.nextInt();
                    int optionEditar;

                    for (Jugador jugador:jugadores) {
                        if(jugador.getNumeroJugador() == editarJugador){
                            System.out.println("** El jugador está en la base de datos **");

                            do {
                                System.out.println("\n1. Editar numero de camiseta");
                                System.out.println("2. Editar nombres");
                                System.out.println("3. Editar apellidos");
                                System.out.println("4. Editar posicion del jugador");
                                System.out.println("5. Editar Edad del jugador");
                                System.out.println("6. Editar equipo del jugador");
                                System.out.println("7. Salir de la edición del jugador");
                                System.out.print("Digite una opcion: ");
                                optionEditar = entradaPorTeclado.nextInt();
                                System.out.println("\n");

                                switch (optionEditar){
                                    case 1:
                                        int nuevoNumeroCamiseta;
                                        System.out.print("-Ingrese el nuevo numero de la camiseta del jugador: ");
                                        nuevoNumeroCamiseta = entradaPorTeclado.nextInt();
                                        for (Jugador verificarJugador:jugadores) {
                                            if (verificarJugador.getNumeroJugador() == nuevoNumeroCamiseta){
                                                System.out.println("El numero de camisa ya existe.");
                                            }else{
                                                jugador.setNumeroJugador(nuevoNumeroCamiseta);
                                                System.out.println("Cambio de numero exitoso.");
                                            }
                                        }
                                        break;

                                    case 2:
                                        System.out.println("-Ingrese el nuevo nombre del jugador: ");
                                        jugador.setNombre(entradaPorTeclado.next());
                                        break;

                                    case 3:
                                        System.out.print("-Ingrese el nuevo apellido del jugador");
                                        jugador.setApellido(entradaPorTeclado.next());
                                        break;

                                    case 4:
                                        System.out.print("-Ingrese la nueva posición del jugador");
                                        jugador.setPosicion(entradaPorTeclado.next());
                                        break;

                                    case 5:
                                        System.out.print("-Ingrese la nueva edad del jugador: ");
                                        int nuevaEdad = entradaPorTeclado.nextInt();
                                        jugador.setEdad(nuevaEdad);
                                        break;

                                    case 6:
                                        System.out.print("-Ingrese el nuevo equipo del jugador: ");
                                        jugador.setEquipoJugador(entradaPorTeclado.next());
                                        break;

                                    case 7:
                                        System.out.println("Has elegido salir del editor.");
                                        break;

                                    default:
                                        System.out.println("Opcion no valida.");

                                }// Fin switch editar jugador
                            }while (optionEditar != 7);

                        }else{
                            System.out.println("Jugador no encontrado.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nLista de jugadores");
                    for (Jugador jugador:jugadores) {
                        System.out.println("**************** jugador ****************");
                        System.out.println("-El numero: " + jugador.getNumeroJugador());
                        System.out.println("-El nombre del jugador es: " + jugador.getNombre());
                        System.out.println("-El apellido del jugador es: " + jugador.getApellido());
                        System.out.println("-La posicion del jugador es: "+ jugador.getPosicion());
                        System.out.println("-La edad del jugador es: " + jugador.getEdad());
                        System.out.println("-El equipo del jugador es: " + jugador.getEquipoJugador()+"\n");
                    }
                    break;

                case 5:
                    System.out.println("**** Programa cerrado ****");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }while (option !=5);

    }
}