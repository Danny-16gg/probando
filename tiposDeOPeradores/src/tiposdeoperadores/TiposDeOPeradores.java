
package tiposdeoperadores;
//importamos JOptionoane para poder ingresar datos por ventana
import javax.swing.JOptionPane;


public class TiposDeOPeradores {
 
    public static void main(String[] args) {
        
        //variables 
        float num1,num2,
                total1,total2,total3,total4,total5,total6;
        
        //vamos hacer que el usuio ingrese datos por ventana
        
        num1=Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese numero1: "));
        num2=Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese numero2: "));
        
        //operadores aritmeticos (+,-,*,/ y %)
        System.out.println("operaciones aritmeticas");
        
        total1=num1+num2;//aca sumamos las dos variables pedidas por consola 
        total2=num1-num2;//aca restamos las dos variables por consola
        total3=num1*num2;//aca multiplicamos las dos variablees por consola
        total4=num1/num2;//aca dividimos los dos valores por consola 
        total5=num1%num2;//aca tenemos el residuo de la division por la variable por consola
        
        System.out.println("estos son los resultados de: "+num1+" y "+num2+" suma: "+ total1+" resta: " +total2+" multiplicaicon: "+total3+" division: "+total4+" residuo: "+total5);
        
        //operadores de asignacion (=, +=, -=, *=, /= y %=)
        System.out.println("operaciones de asignacion");
        
        num1 = 2;/*independientemente de cuanto le asignamos el valor antiros por consola a la variable 1, 
        en este ejemplo le decimos que su nuevo valorde asignacion va a empezar por dos*/
        System.out.println(num1+" =");
        num1 += 2;//como la variable le asignamos 2, aca le decimos que le sume otros dos y queda en 4
        System.out.println(num1+" +=");
        num1 -= 2;//como el resultado dio 4 aca le decimos restele otro 2, queda en 2
        System.out.println(num1+" -=");
        num1 *= 2;//como el resultado es 2 aca le decimos multipliquele 2, queda en 4
        System.out.println(num1+ " *=");
        num1 /= 2;//como el resultado es 4 aca le decimos dividalo por 2, queda 2
        System.out.println(num1+" /=");
        num1 %=2;//como el resultado es 2 le decimos que nos de el residuo de 2/2, que daria 0
        System.out.println(num1+" %=");
        
        /*operadores de comparacion o relacionales (==(igual que), !=(diferentes), 
        <(menor que), >(mayor que), <=(menor o igual que), >=(mayor o igual que)*/
        
        System.out.println("operaciones de comparacion ");
        
        //le asignamos nuevo valor a la variable "num1" y "num2" para hacer mas facil el ejercicio
        
        num1= 1;// le asignamos nuevo valor con operaciones de asignacion
        num2 = 10;
        
        System.out.println("¿ "+num1+" == "+num2+" ? "+(num1==num2));
        System.out.println("¿ "+num1+" != "+num2+" ? "+(num1!=num2));
        System.out.println("¿ "+num1+" > "+num2+" ? "+(num1>num2));
        System.out.println("¿ "+num1+" < "+num2+" ? "+(num1<num2));
        System.out.println("¿ "+num1+" >= "+num2+" ? "+(num1>=num2));
        System.out.println("¿ "+num1+" <= "+num2+" ? "+(num1<=num2));
       
        //operadores condiconales con operadores de comparacion con el ejemplo anterios utilizando (if, else)
        
        System.out.println("vamos a verificar si: "+num1+" es igual que: "+num2);
        
        if (num1==num2){
            System.out.println("el numero es igual");
        }else{
            System.out.println("el numero no es igual");
        }
        
        System.out.println("vamos a mirar si: "+num1+" es un numero diferente: "+num2);
        if (num1!=num2){
            System.out.println("el numero es diferente");
        } else {
            System.out.println("el numero no es diferente");
        }
        
        System.out.println("vamos a verificar si: "+num1+" es mayor que: "+num2);
        if (num1>num2){
            System.out.println("el numero es mayor");
        }else{
            System.out.println("el numero no es mayor");
        }
       
        System.out.println("vamos a verificar si: "+num1+" es menor que: "+num2);
        if (num1<num2){
            System.out.println("el numero es menor");
        }else{
            System.out.println("el numero no es menor");
        }
        
        System.out.println("vamos a verificar si: "+num1+" es mayor o igual que: "+num2);
        if (num1>=num2){
            System.out.println("el numero es mayor o igual");
        }else{
            System.out.println("el numero no es mayor o igual");
        }
        
        System.out.println("vamos a verificar si: "+num1+" es menor o igual que: "+num2);
        if (num1<=num2){
            System.out.println("el numero es menor o igual");
        }else{
            System.out.println("el numero no es menor o igual");
        }  
        
        // operadores de incremento
        
        num1 ++;
        num2--;
     hola 
        
        System.out.println("la variable num1 en este ejercicio vale 1 y le incrementamos ++(+1): "+num1+
                " de la misma forma con la variable num2 solo que le vamos a disminuir --(-1): "+num2);
    }
    
}
