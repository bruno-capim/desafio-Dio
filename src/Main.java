import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Course Java");
        curso1.setDescricao("Descricao course Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Course JavaScript");
        curso2.setDescricao("Descricao course JavaScript");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descricao Bootcamp Java Dev");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Bruno: "+devBruno.getConteudoInscritos());
        devBruno.progredir();
        System.out.println("Conteudos Concluidos Bruno: "+devBruno.getConteudoConcluido());

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felpie");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Felipe: "+devFelipe.getConteudoInscritos());
        devFelipe.progredir();
        System.out.println("Conteudos Concluidos Felipe: "+devFelipe.getConteudoConcluido());

    }
}
