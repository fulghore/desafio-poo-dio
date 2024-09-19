import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAldrin = new Dev();
        devAldrin.setNome("Aldrin");
        devAldrin.increverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos: " + devAldrin.getConteudosInscritos());
        devAldrin.progredir();
        devAldrin.progredir();
        System.out.println("Conteúdos incritos: " + devAldrin.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devAldrin.getConteudosConcluidos());
        System.out.println("Xp: " + devAldrin.calcularXpTotal());

        Dev devEllen = new Dev();
        devEllen.setNome("Ellen");
        devEllen.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devEllen.getConteudosInscritos());
        devEllen.progredir();
        devEllen.progredir();
        devEllen.progredir();
        System.out.println("Conteúdos inscritos: " + devEllen.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devEllen.getConteudosConcluidos());
        System.out.println("Xp: " + devEllen.calcularXpTotal());

//        System.out.println(curso1.toString());
//        System.out.println(curso2.toString());
//        System.out.println(mentoria.toString());

    }
}
