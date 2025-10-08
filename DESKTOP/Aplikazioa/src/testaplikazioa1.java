import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testaplikazioa1 {

    @Test
    public void testagurra(){
         String agurra1 = Aplikazioa.agurra1();
         assertEquals("Kaixo, ongi etorri Zinema Usurbil enpresara, enpresako lehenengo kidea naiz, Iker", agurra1);
         
    }
   
}