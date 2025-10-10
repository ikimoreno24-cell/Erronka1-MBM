import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testAplikazioa3 {
    @Test
    public void testagurra(){
        String agurra3 = Aplikazioa.agurra3();
        assertEquals("Kaixo ongi etorria Zine Usurbil enpresara, enpresako bigarren kidea naiz, Ierai.", agurra3);
    }
}