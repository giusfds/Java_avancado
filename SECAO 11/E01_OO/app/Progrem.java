package app;

//para mostarr sem as hoaras
import java.time.LocalDate;
//para mostrar com as horas
import java.time.LocalDateTime;
//para mostarr a GMT (em londres)
import java.time.Instant

public class Progrem {

    public static void main(String[] args) {

//        horario sem as horas
        LocalDate d01 = LocalDate.now();
        System.out.println("d01 = " + d01);

//        horario com as horas
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02 = " + d02);

//        horario com o GMT (em londres)
        Instant d03 = Instant.now();
        System.out.println("d03 = " + d03);

//        gerar um objeto com a data em modo ISO
//        pode ser feito para o time e instant tbm
        LocalDate d04 = LocalDate.parse("2024-01-01");
        System.out.println("d04 = " + d04);

    }

}