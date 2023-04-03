package pl.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExampleBeanServiceImplTest {

    @InjectMocks
    ExampleBeanServiceImpl exampleBeanServiceImpl;
    @Mock
    InjectedBeanService injectedBeanService;

    @Test
    void sampleMethod() {
        // given
        Mockito.when(injectedBeanService.anotherSampleMethod()).thenReturn(true);

        // when
        boolean result = injectedBeanService.anotherSampleMethod();

        // then
        Assertions.assertTrue(result);
    }
}
