package org.ieslosremedios.daw1.prog.ut3.abstractas.ejercicios.ejercicio3;

/**
 * Clase Comercial
 *
 * Contiene información de un comercial, un tipo de empleado
 *
 * @author Fernando
 * @version 1.0
 */
public class Comercial extends Empleado{

    //Atributos, aunque no indiquemos nada es como si tuviera los atributos del padre

    /**
     * Comision por venta del comercial
     */
    private double comision;

    /**
     * Suma un plus al salario del empleado si el empleado tiene una comision menor que 50
     * @param sueldoPlus
     * @return</pre>
    <ul>
    <ul>*
    <li>true: se suma el plus al sueldo</li>
    </ul>
    </ul>
    &nbsp;
    <ul>
    <ul>*
    <li>false: no se suma el plus al sueldo</li>
    </ul>
    </ul>
    &nbsp;
    <ul>*</ul>
    <pre>
     */
    public boolean plus (double sueldoPlus){

        boolean aumento=false;
        if (comision<50){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }

    /**
     * Constructor por defecto
     */
    public Comercial(){
        super();
        this.comision=0;
    }

    /**
     * Constructor con 5 parametros
     * @param nombre nombre del comercial
     * @param apellido apellido del comercial
     * @param edad edad del comercial
     * @param salario salario del comercial
     * @param comision comision del comercial
     */
    public Comercial(String nombre, String apellido, int edad, double salario, double comision) {
        super(nombre, apellido, edad, salario);
        this.comision=comision;
    }
}
