import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        String apiKey = "TU_API_KEY"; // --Reemplazá por tu clave--
        ApiService apiService = new ApiService(apiKey);


        try{
            String json = apiService.obtenerJsonDesdeApi();
            ConversionService conversion = new ConversionService(json);
            List<ConversionRegistro> historial = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);

            boolean continuar = true;
            while(continuar){
                ConversorMenu.mostrarMenu();
                String opcion = scanner.nextLine().trim();

                String origen = "";
                String destino = "";

                switch(opcion){
                    case "1" -> {
                        origen = "USD";
                        destino = "ARS";
                    }
                    case "2" -> {
                        origen = "ARS";
                        destino = "USD";
                    }
                    case "3" -> {
                        origen = "USD";
                        destino = "BRL";
                    }
                    case "4" -> {
                        origen = "BRL";
                        destino = "USD";
                    }
                    case "5" -> {
                        origen = "USD";
                        destino = "COP";
                    }
                    case "6" -> {
                        origen = "COP";
                        destino = "USD";
                    }
                    case "7" -> {
                        System.out.println("Historial de conversiones: ");
                        if (historial.isEmpty()){
                            System.out.println("No hay conversiones registradas aún.");
                        }else{
                            for (ConversionRegistro r: historial){
                                System.out.println(r);
                            }
                        }
                        continue;
                    }
                    case "8" -> {
                        continuar = false;
                        System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                        continue;
                    }
                    default -> {
                        System.out.println("Opcion inválida. Intente nuevamente.");
                        continue;
                    }

                }
                if (!origen.isEmpty() && !destino.isEmpty()){

                    if(conversion.monedaDisponible(origen) && conversion.monedaDisponible(destino)) {
                        System.out.printf("Ingrese el monto en %s: ", origen);
                        double monto = scanner.nextDouble();
                        scanner.nextLine();

                        double resultado = conversion.convertir(monto, origen, destino);
                        historial.add(new ConversionRegistro(origen, destino, monto, resultado));

                        System.out.printf("%.2f %s equivalen a %.2f %s \n\n",
                                monto, origen, resultado, destino);
                    }else {
                        System.out.println("Alguna de las monedas no está disponible.");

                    }

                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

    }
}
