
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


/**
 *
 * @author Ing Diego Romero
 * 
 */
public class Funciones {

    /**
     *
     * @param url url para realizar la consulta
     * @return un String con el texto contenido en la url
     */
    public String obtieneDeUrlPorGet(String url) {
        String texto = "", linea;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            while ((linea = in.readLine()) != null) {
                texto += linea + "\n";
            }
        } catch (Exception ex) {
            texto = ex + "";
        }
        return texto.substring(0, texto.length()-1);
    }
}
