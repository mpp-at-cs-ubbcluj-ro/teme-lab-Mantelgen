import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("Teste one")
    public void testOne(){
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest(1, "name", "address", "phone", "model", "date", "description");
        assertEquals(computerRepairRequest.getOwnerName(), "name");
        assertEquals(computerRepairRequest.getOwnerAddress(), "address");
        assertEquals(computerRepairRequest.getPhoneNumber(), "phone");
        assertEquals(computerRepairRequest.getModel(), "model");
    }

    @Test
    @DisplayName("Teste two")
    public void testTwo(){
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest(1, "name", "address", "phone", "model", "date", "description");
        assertEquals(computerRepairRequest.getOwnerName(), "name");
        assertEquals(computerRepairRequest.getOwnerAddress(), "address");
        assertEquals(computerRepairRequest.getPhoneNumber(), "phone");
        assertEquals(computerRepairRequest.getModel(), "model");
        assertEquals(2,2,"Numerele trebe sa fie egale");
    }
}
