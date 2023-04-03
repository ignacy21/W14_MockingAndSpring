package pl.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
public class ExampleBeanServiceImplTest {

    @InjectMocks
    ExampleBeanServiceImpl exampleBeanServiceImpl;
    @Mock
    InjectedBeanService injectedBeanService;

    @Test
    void sampleMethod() {
        // given
        Mockito.when(injectedBeanService.anotherSampleMethod(eq("val2"), anyString()))
                .thenReturn("my value");
//        Mockito.when(injectedBeanService.anotherSampleMethod(ArgumentMatchers.any(), ArgumentMatchers.any()))
//                .thenReturn("my value");

        // when
        String result1 = exampleBeanServiceImpl.sampleMethod("val1");
        String result2 = exampleBeanServiceImpl.sampleMethod("val2");
        String result3 = exampleBeanServiceImpl.sampleMethod("val3");
        String result4 = exampleBeanServiceImpl.sampleMethod("val4");

        // then
        Assertions.assertEquals("my value", result1);
    }
}
