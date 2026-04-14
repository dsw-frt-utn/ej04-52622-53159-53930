package domain;

import java.time.LocalDate;

public class VehiculoCombustible extends Vehiculo {
    private double kilometrosPorLitro;
    private double litrosExtra;

    public VehiculoCombustible(String patente, String marca, String modelo, int anio, double capacidadCarga,
                               Sucursal sucursal, double kilometrosPorLitro, double litrosExtra) {
        super(VehiculoTipo.COMBUSTIBLE, patente, marca, modelo, anio, capacidadCarga, sucursal);
        this.kilometrosPorLitro = kilometrosPorLitro;
        this.litrosExtra = litrosExtra;
    }
    
     public double getKilometrosPorLitro() {
        return kilometrosPorLitro;
    }

    public double getLitrosExtra() {
        return litrosExtra;
    }

    @Override
    public double calcularConsumo(double kilometros) {
         double extra = LocalDate.now().getYear() - anio > 5
                ? (kilometros / 15) * litrosExtra
                : 0;

        // Consumo total = consumo normal + consumo extra
        double total = (kilometros / kilometrosPorLitro) + extra;

        return total;
    }
}
