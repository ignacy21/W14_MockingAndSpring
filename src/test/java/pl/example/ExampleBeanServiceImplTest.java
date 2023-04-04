package pl.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.mockito.ArgumentMatchers.eq;

@ExtendWith(MockitoExtension.class)
public class ExampleBeanServiceImplTest {

    @InjectMocks
    ExampleBeanServiceImpl exampleBeanServiceImpl;
    @Mock
    InjectedBeanService injectedBeanService;

    @ParameterizedTest
    @MethodSource
    void sampleMethod(String val1, String val2) {
//         given
        Mockito.when(injectedBeanService.someOtherMethod()).thenReturn(val1);
        Mockito.when(injectedBeanService.anotherSampleMethod()).thenReturn(val2);

        // when
        String result = exampleBeanServiceImpl.sampleMethod();

        // then

        Mockito.verify(injectedBeanService, Mockito.times(1)).someOtherMethod();
    }

    static Stream<Arguments> sampleMethod() {
        return Stream.of(
                Arguments.of("val1", "val2"),
                Arguments.of("val3", "val4"),
                Arguments.of("val5", "val6")
        );
    }
}
