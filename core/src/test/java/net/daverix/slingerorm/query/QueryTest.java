package net.daverix.slingerorm.query;

import net.daverix.slingerorm.Session;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;

public class QueryTest {
    @Test
    public void testShouldBuildQueryCorrectly() throws Exception {
        Session session = mock(Session.class);
        List<TestClass> list = session.query(TestClass.class)
                .where("Id").moreThan(3).and("Title").equalTo("Hej")
                .orderBy("Title").descending()
                .toList();

        session.query(TestClass.class).where("Status").equalTo("3")
                .and("Title").equalTo("Hej")
                .or("Title").equalTo("Haha")
        .orderBy("Status").descending().toList();
    }

    public class TestClass {
        public int Id;
        public String Title;
        public int Status;
    }
}
