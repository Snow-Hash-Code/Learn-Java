package EnumsJava;

//Enum puede ser declarado adentro de la clase o fuera de ella

enum Level{
    LOW, MEDIUM, HIGH;
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumsJava {
    public static void main(String[] args) {
        

        Day d = Day.WEDNESDAY;

        int numLetters = switch(d){
            case MONDAY, FRIDAY, SUNDAY -> {
                yield 6;
            }

            case TUESDAY -> {
                yield 7;
            }

            case THURSDAY, SATURDAY -> {
                yield 8;
            }
            
            case WEDNESDAY -> {
                yield 9;
            }

            default -> {
                throw new IllegalStateException("Invalid day: " + d);
            }
        };

        System.out.println(numLetters);

        Level l = Level.LOW;

        System.out.println(l);

        switch(l){
            case LOW -> System.out.println("Low level");
            case MEDIUM -> System.out.println("Medium level");
            case HIGH -> System.out.println("High level");
            default -> System.out.println("Nivel no reconocido");
        }
    }
}
