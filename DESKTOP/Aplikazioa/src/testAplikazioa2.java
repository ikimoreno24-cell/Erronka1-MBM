import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testAplikazioa2 {
    @Test
    public void testagurra(){
        String agurra2 = Aplikazioa.agurra2();
        assertEquals("Kaixo ongi etorria Zine Usurbil enpresara, enpresako bigarren kidea naiz, Urko.", agurra2);
    }
}
