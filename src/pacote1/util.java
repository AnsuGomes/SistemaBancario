package pacote1;

import java.text.NumberFormat;
import java.text.DecimalFormat;

public class util {
    static NumberFormat formatandovalores = new DecimalFormat("R$ #,##0.00");
    
    public static String doubleToString(Double valor) {
        return formatandovalores.format(valor);
    }    
}
