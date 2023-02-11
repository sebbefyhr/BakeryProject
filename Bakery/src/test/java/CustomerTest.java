import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void orderPrincessCake() {

    }

    @Test
    void orderOperaCake() {
    }

    @Test
    void orderChocolateCake() {
    }

    @Test
    void getId() {
        Customer c = new Customer();
        Assertions.assertNotNull(c.getId());
        Assertions.assertTrue(c.getId() != 0);
    }

    @Test
    void setId() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void propertyChange() {
    }
}