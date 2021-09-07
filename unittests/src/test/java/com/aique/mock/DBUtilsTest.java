package com.aique.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.aique.MyFinalClass;
import com.aique.utils.DBUtility;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class DBUtilsTest {

    @Test
    void shouldMockStaticMethod() {
        MockedStatic<MyFinalClass> mockStatic = Mockito.mockStatic(MyFinalClass.class);
        try (MockedStatic<DBUtility> mockedStatic = Mockito.mockStatic(DBUtility.class)) {

            mockedStatic.when(() -> DBUtility.getDatabaseConnection(Mockito.eq("test"))).thenReturn("testing");
            mockedStatic.when(() -> DBUtility.getDatabaseConnection(Mockito.eq("prod"))).thenReturn("production");

            String result1 = DBUtility.getDatabaseConnection("test");

            assertEquals("testing", result1);
            String result2 = DBUtility.getDatabaseConnection("prod");
            assertEquals("production", result2);

        }

    }
}
