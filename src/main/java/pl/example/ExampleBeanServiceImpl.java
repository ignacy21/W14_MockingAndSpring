package pl.example;

public class ExampleBeanServiceImpl implements ExampleBeanService {

    private InjectedBeanService injectedBeanService;


    @Override
    public String sampleMethod() {
        return injectedBeanService.someOtherMethod() + injectedBeanService.anotherSampleMethod();
    }

    @Override
    public void setInjectedBeanMethod(InjectedBeanService injectedBeanService) {
        this.injectedBeanService = injectedBeanService;
    }
}
