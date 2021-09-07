package com.aique.mock;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.aique.MyFinalClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockitoMockFinal {


    @Test
    public void testMockFinal(@Mock MyFinalClass finalMocked)  {
        assertNotNull(finalMocked);
    }

    @Test
    public void testMockFinalViaMockStatic()  {
        MockedStatic<MyFinalClass> mockStatic = Mockito.mockStatic(MyFinalClass.class);
        assertNotNull(mockStatic);
    }
}
