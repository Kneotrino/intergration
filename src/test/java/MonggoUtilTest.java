import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Kneotrino
 * @date 25/09/19
 */
class MonggoUtilTest {

    MongoClient mongoClient;

    @BeforeEach
    void setUp() {
        mongoClient = new MongoClient("localhost", 27017);
    }

    @Test
    void MonggoConnection() {
        MongoDatabase easy_warung_dev = mongoClient.getDatabase("easy_warung_dev");
        assertEquals("easy_warung_dev",easy_warung_dev.getName());
    }
}