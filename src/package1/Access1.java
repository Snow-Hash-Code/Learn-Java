package package1;
public class Access1 {
    //default, public, private, protected
    //default puede ser llamado desde cualquier clase dentro del mismo paquete pero no en clases de paquetes diferentes
    //public puede ser llamado desde cualquier clase dentro del mismo paquete o en clases de paquetes diferentes
    //private solo puede ser llamado en la misma clase en que se declara
    //protected puede ser llamado desde cualquier clase en el mismo paquete pero no puede ser llamado desde otro paquete
    
    int numero1 = 1;
    public int hours = 3;
    public int minutes = 47;
    private int seconds = 60;
    protected int milisSeconds = 1000;

    //los modificadores de acceso tambien funcionan con metodos

    public int getHours(){
        return hours;
    }

    protected int getMinutes(){
        return minutes;
    }

    private int getSeconds(){
        return seconds;
    }
}
