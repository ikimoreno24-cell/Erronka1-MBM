import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testaplikazioa1 {

    @Test
    public void testagurra(){
         String agurra = Aplikazioa.agurra();
         assertEquals("Kaixo, ongi etorri Zinema Usurbil enpresara", agurra);
         
    }
   
}