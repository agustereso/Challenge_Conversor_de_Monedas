import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversionRegistro {
    private final String origen;
    private final String destino;
    private final double montoOriginal;
    private final double montoConvertido;
    private final LocalDateTime fechaHora;

    public ConversionRegistro(String origen, String destino, double montoOriginal, double montoConvertido){
        this.origen = origen;
        this.destino = destino;
        this.montoOriginal = montoOriginal;
        this.montoConvertido = montoConvertido;
        this.fechaHora = LocalDateTime.now();

    }
    @Override
    public String toString(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("[%s] %.2f %s -> %.2f %s",
                fechaHora.format(formato), montoOriginal, origen, montoConvertido, destino);

    }
}
