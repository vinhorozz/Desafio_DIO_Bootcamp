import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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
        mentoria1.setDescriao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}
