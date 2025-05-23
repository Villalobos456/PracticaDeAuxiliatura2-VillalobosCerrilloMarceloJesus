public class Vehiculo {
    public String marca;
    public String modelo;
    public int año;
    public int precio;

    public Vehiculo(String marca, String modelo, int año, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }
    public String mostrar(){
        return "marca: " + marca + "modelo: " + modelo + "año: " + año + "precio: " + precio;
    }
}
