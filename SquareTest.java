import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    void squaresNumbers() {
        Square square = new Square();
        assertEquals(25, square.square(5));
    }
}
