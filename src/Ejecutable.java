

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
public class Ejecutable {
    public static void main(String[] args) {
        Funciones f = new Funciones();
        String cedula="1101705141";
        String url="http://200.93.221.203/valores_facturas/direcciona.php?serruc="+cedula+"&criterio=TODAS";
        String texto=f.obtieneDeUrlPorGet(url);
        Document d=Jsoup.parse(texto);
        String dat[]=d.getElementsByTag("datcab").get(1).getElementsByTag("datcab").html().split("\n");
        System.out.println(dat[0].split("</b> ")[1]);
        System.out.println(dat[2].split("</b> ")[1]);
        System.out.println(dat[4].split("</b> ")[1]);
    }
}
