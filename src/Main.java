import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescriao("descrição 1");
        curso1.setCargahoraria(10);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso JavaScript");
        curso1.setDescriao("descrição 2 ");
        curso1.setCargahoraria(8);

        Mentoria mentoria1=new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescriao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        BootCamp bootCamp=new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        System.out.println("\n----------");
        Dev devFlavio=new Dev();
        devFlavio.setNome("Flavio");
        devFlavio.inscreverBootcamp(bootCamp);

        System.out.println("Conteúdos Inscritos "+ devFlavio.getNome()+devFlavio.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos "+ devFlavio.getNome()+devFlavio.getConteudoConcluidos());
        System.out.println("\n----------");
        devFlavio.progredir();
        System.out.println("Conteúdos Inscritos "+ devFlavio.getNome()+devFlavio.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos "+ devFlavio.getNome()+devFlavio.getConteudoConcluidos());
        System.out.println("XP: "+ devFlavio.calcularTotalXp());

        System.out.println("\n----------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);

        System.out.println("Conteúdos Inscritos "+ devCamila.getNome()+devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos "+ devCamila.getNome()+devCamila.getConteudoConcluidos());
        System.out.println("\n----------");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteúdos Inscritos "+ devCamila.getNome()+devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos "+ devCamila.getNome()+devCamila.getConteudoConcluidos());
        System.out.println("XP: "+ devCamila.calcularTotalXp());

    }
}
