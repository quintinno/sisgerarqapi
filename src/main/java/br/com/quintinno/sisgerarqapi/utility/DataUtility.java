package br.com.quintinno.sisgerarqapi.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtility {
	
	public static final String FORMATO_DATA_DDMMAAAA_HHMMSS = "dd/MM/yyyy HH:mm:ss";
	
	public static String formatarData(Date dataReferencia, String formato) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        return simpleDateFormat.format(dataReferencia);
    }

}
