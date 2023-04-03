package pl.example;


public interface ExampleBeanService {

    String sampleMethod(String someValue);

    void setInjectedBeanMethod(InjectedBeanService injectedBeanService);
}
