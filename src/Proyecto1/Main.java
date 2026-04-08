package Proyecto1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudiantes[] estudiantes = new Estudiantes[100];
        int contador = 0;
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Mostrar aprobados y reprobados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    if (contador < estudiantes.length) {
                        System.out.println("\n--- Registro de estudiante ---");

                        System.out.print("Ingrese código: ");
                        String codigo = sc.nextLine();

                        System.out.print("Ingrese nombre del estudiante: ");
                        String nombre = sc.nextLine();

                        System.out.print("Ingrese nombre de la carrera: ");
                        String nombreCarrera = sc.nextLine();

                        System.out.print("Ingrese duración de la carrera (años): ");
                        int duracion = sc.nextInt();

                        System.out.print("Ingrese promedio: ");
                        float promedio = sc.nextFloat();
                        sc.nextLine(); // limpiar buffer

                        Carreras carrera = new Carreras(nombreCarrera, duracion);
                        Estudiantes nuevo = new Estudiantes(codigo, nombre, promedio, carrera);

                        estudiantes[contador] = nuevo;
                        contador++;

                        System.out.println("Estudiante registrado correctamente.");
                    } else {
                        System.out.println("No se pueden registrar más estudiantes.");
                    }
                    break;

                case 2:
                    if (contador == 0) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        System.out.println("\n===== LISTA DE ESTUDIANTES =====");
                        for (int i = 0; i < contador; i++) {
                            System.out.println("\nEstudiante #" + (i + 1));
                            System.out.println("Código: " + estudiantes[i].getCodigo());
                            System.out.println("Nombre: " + estudiantes[i].getNombre());
                            System.out.println("Promedio: " + estudiantes[i].getPromedio());
                            System.out.println("Carrera: " + estudiantes[i].getCarrera().getNombre());
                            System.out.println("Duración: " + estudiantes[i].getCarrera().getDuracion() + " años");

                            if (estudiantes[i].aprobar()) {
                                System.out.println("Estado: Aprobado");
                            } else {
                                System.out.println("Estado: Reprobado");
                            }
                        }
                    }
                    break;

                case 3:
                    if (contador == 0) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        int aprobados = 0;
                        int reprobados = 0;

                        for (int i = 0; i < contador; i++) {
                            if (estudiantes[i].aprobar()) {
                                aprobados++;
                            } else {
                                reprobados++;
                            }
                        }

                        System.out.println("\n===== RESUMEN =====");
                        System.out.println("Cantidad de aprobados: " + aprobados);
                        System.out.println("Cantidad de reprobados: " + reprobados);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}