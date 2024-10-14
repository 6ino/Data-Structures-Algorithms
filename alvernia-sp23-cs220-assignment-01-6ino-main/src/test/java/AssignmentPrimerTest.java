import edu.alvernia.cs220.primer.AssignmentPrimer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AssignmentPrimerTest {


    /**
     * Validating the default construction of an AssignmentPrimer object.
     */
    @Test
    void assignmentPrimerTest1() {
        AssignmentPrimer primer = new AssignmentPrimer();
        assertNotNull(primer);
    }

    @Test
    void assignmentPrimerTest2() {
        AssignmentPrimer primer = new AssignmentPrimer();
        assertEquals(0, primer.getAssignmentId());
        assertEquals(null, primer.getAssignmentName());
        assertEquals(null, primer.getAssignmentName());
    }

    @Test
    void assignmentPrimerTest3() {
        AssignmentPrimer primer = new AssignmentPrimer(5, "Understanding the assignments");
        assertEquals(5, primer.getAssignmentId());
        assertEquals("Understanding the assignments", primer.getAssignmentName());
        assertEquals(null, primer.getAssignmentSummary());
    }

    @Test
    void assignmentPrimerTest4() {
        AssignmentPrimer primer = new AssignmentPrimer(
                10, "Understanding the assignments",
                "To update the AssignmentPrimer class to return the correct values.");
        assertEquals(10, primer.getAssignmentId());
        assertEquals("Understanding the assignments", primer.getAssignmentName());
        assertEquals("To update the AssignmentPrimer class to return the correct values.", primer.getAssignmentSummary());
    }

}
