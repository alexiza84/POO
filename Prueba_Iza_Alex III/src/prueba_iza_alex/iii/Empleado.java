/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_iza_alex.iii;

public class Empleado extends Persona {
    
private String ocupacion;
private int numhorastrabaj, valorhora, descuento;
private float salario, valorrecibir;
   
    public Empleado(String nombre, String email, String ocupacion, int numhorastrabaj, int valorhora, int descuento) {
       
        super(nombre, email);
        this.ocupacion = ocupacion;
        this.numhorastrabaj = numhorastrabaj;
        this.valorhora = valorhora;
        this.descuento = descuento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupación(String ocupación) {
        this.ocupacion = ocupación;
    }

    public int getNumhorastrabaj() {
        return numhorastrabaj;
    }

    public void setNumhorastrabaj(int numhorastrabaj) {
        this.numhorastrabaj = numhorastrabaj;
    }

    public int getValorhora() {
        return valorhora;
    }

    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorrecibir() {
        return valorrecibir;
    }

    public void setValorrecibir(float valorrecibir) {
        this.valorrecibir = valorrecibir;
    }

  

    
    public float  calcularSalario(){
        if (numhorastrabaj<=40){
            salario=numhorastrabaj*valorhora;
        }
        else if (numhorastrabaj>=41){
            //2.	Si es mayor a cuarenta, las primeras 40 horas se pagan al valor por hora,
            //            el resto de horas cuestan el 50% más por considerarse horas extras.

            int calculodeHoras=(numhorastrabaj*valorhora);
            int hextras=numhorastrabaj-40;
            float calculohExtra=(hextras*valorhora)*0.5f;
            salario=calculodeHoras+hextras;
        }
    return salario;
    }
    public float valorRecibir(){
        valorrecibir=salario-descuento;
        return valorrecibir;
    }
  }
