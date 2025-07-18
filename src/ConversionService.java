import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversionService {
    private final JsonObject conversionRates;

    public  ConversionService(String json){
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();
        this.conversionRates = root.getAsJsonObject("conversion_rates");
    }
    public boolean monedaDisponible (String codigo){
        return conversionRates.has(codigo);

    }

    public double obtenerTasa(String codigo){
        return conversionRates.get(codigo).getAsDouble();
    }

    public double convertir (double monto, String origen, String destino){
        double tasaOrigen = obtenerTasa(origen);
        double tasaDestino = obtenerTasa(destino);
        return (monto / tasaOrigen) * tasaDestino;

    }

    public void mostrarMonedasDisponibles(){
        System.out.println("""
          -----------------------------
          Monedas disponibles:
          USD - Dólar estadounidense
          ARS - Peso argentino
          BRL - Real brasileño
          COP - Peso colombiano
          -----------------------------
          """);
    }
}
