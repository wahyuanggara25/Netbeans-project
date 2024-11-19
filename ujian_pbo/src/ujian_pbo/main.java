/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian_pbo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class main {
    
    public String format_rupiah(int harga){
        DecimalFormat decimal_format = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols decimal_format_symbols = new DecimalFormatSymbols();
        decimal_format_symbols.setCurrencySymbol("Rp. ");
        decimal_format_symbols.setMonetaryDecimalSeparator(',');
        decimal_format_symbols.setGroupingSeparator('.');
        decimal_format.setDecimalFormatSymbols(decimal_format_symbols);
        return decimal_format.format(harga);
    }
}
