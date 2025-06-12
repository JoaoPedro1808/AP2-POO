package control;

import model.*;

public class Programa {
    public static void main(String[] args) {
        Participante participante1 = new Participante("João Pedro", "86684746563", "joaozinho@gmail.com", "Engenharia de software");
        Participante participante2 = new Participante("John", "9946898391", "john@gmail.com", "Engenharia da computação");
        Minicurso minicurso1 = new Minicurso("Minicurso1", "15/09/2025", "3 horas", 100000, "Laboratorio 213", participante2, "computador, monito e tela", 90);
        Minicurso minicurso2 = new Minicurso("Minicurso2", "19/09/2025", "4 horas", 90000, "Laboratorio 210", participante2, "computador, monito e tela", 85);
        Palestra palestra1 = new Palestra("Palestra1", "17/09/2025", "4 horas", 75000, "Auditorio", participante1, "Gabriel", "gabriel@gmail.com", "UFRJ");
        Palestra palestra2 = new Palestra("Palestra2", "21/09/2025", "2 horas", 50000, "Auditorio", participante2, "Rafael", "rafael@gmail.com", "ESPM");
        Seminario seminario1 = new Seminario("Seminario1", "20/09/2025", "1 hora", 30000, "Sala 210", participante2, "tema1", "Daniel", "Jorge");
        Seminario seminario2 = new Seminario("Seminario2", "21/09/2025", "4 horas", 55000, "Sala 209", participante2, "tema2", "Fabricio", "Jorge");
        Instrutor instrutor1 = new Instrutor("0877854674", "10251", "Leonardo", "leonr@gmail.com", "CDIA", "CDIA", minicurso1);
        Instrutor instrutor2 = new Instrutor("84673673", "17808", "Thiago", "thiago@gmail.com", "Engenharia de software", "CDIA", minicurso2);
        Organizador organizador1 = new Organizador("846837684", "902738", "Anderson", "anderson@gmail.com", "Coordenador");
        Organizador organizador2 = new Organizador("757849322", "562290", "Rodrigo", "rodrigo@gmail.com", "Responsável por inscrições");

        participante2.addevento(palestra2);
        participante1.addevento(seminario1);
        participante1.addevento(seminario1);
        participante1.addevento(seminario2);
        minicurso1.addinstrutor(instrutor1);
        minicurso1.addinstrutor(instrutor2);
        minicurso2.addinstrutor(instrutor2);

        System.out.println("Particpantes do minicurso1");
        for (Evento evento : minicurso1.getParticipante().getEventos()) {
            System.out.println(minicurso1.getParticipante().getNome());
        }

        System.out.println("Particpantes do minicurso2");
        for (Evento evento : minicurso2.getParticipante().getEventos()) {
            System.out.println(minicurso2.getParticipante().getNome());
        }

        System.out.println("Participantes da palestra1");
        for (Evento evento : palestra1.getParticipante().getEventos()) {
            System.out.println(palestra1.getParticipante().getNome());
        }

        System.out.println("Participantes da palestra2");
        for (Evento evento : palestra2.getParticipante().getEventos()) {
            System.out.println(palestra2.getParticipante().getNome());
        }
        System.out.println("Particpantes do seminario1");
        for (Evento evento : seminario1.getParticipante().getEventos()) {
            System.out.println(seminario1.getParticipante().getNome());
        }

        System.out.println("Particpantes do seminario2");
        for (Evento evento : seminario2.getParticipante().getEventos()) {
            System.out.println(seminario2.getParticipante().getNome());
        }
    }
}
