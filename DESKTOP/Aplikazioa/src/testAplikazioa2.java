import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testAplikazioa2 {
    @Test
    public void testagurra(){
        String agurra = Aplikazioa.agurra();
        assertEquals("Kaixo ongi etorriakm Zine Usurbil enpresara.", agurra);
    }
}
