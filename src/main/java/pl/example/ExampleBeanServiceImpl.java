package pl.example;

public class ExampleBeanServiceImpl implements ExampleBeanService {

    private InjectedBeanService injectedBeanService;


    @Override
    public String sampleMethod(String someValue) {
        return injectedBeanService.anotherSampleMethod(someValue, someValue);
    }

    @Override
    public void setInjectedBeanMethod(InjectedBeanService injectedBeanService) {
        this.injectedBeanService = injectedBeanService;
    }
}
