package com.aluracursos.radioalura.pincipal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Potcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Potcast miPotcast = new Potcast();
        miPotcast.setDescripcion("Potcats de prueba");
        miPotcast.setPresentador("Luisa");
        miPotcast.setTitulo("El potcast");

        //cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }
        //potcast
        for (int i = 0; i < 100; i++) {
            miPotcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPotcast.reproduce();
        }

        System.out.println("Total de reproducciones: " +miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta :" +miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miPotcast);
        favoritos.adiciona(miCancion);
    }
}
