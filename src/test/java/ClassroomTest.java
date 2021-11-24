import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {
    @Test
    void sum() {
        assertEquals(13, Classroom.sum(5,8));
    }

    @Test
    void mult() {
        assertEquals(40, Classroom.mult(5,8));
    }

    @Test
    void div() {
        assertEquals(2.0, Classroom.div(10,5));
    }

    @Test
    void sq() {
        assertEquals(25, Classroom.sq(5));
    }

    @Test
    void cube() {
        assertEquals(27, Classroom.cube(3));
    }
}