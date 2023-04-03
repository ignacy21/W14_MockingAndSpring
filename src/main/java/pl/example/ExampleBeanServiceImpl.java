package pl.example;

public class ExampleBeanServiceImpl implements ExampleBeanService {

    private InjectedBeanService injectedBeanService;


    @Override
    public void setInjectedBeanMethod(InjectedBeanService injectedBeanService) {
        this.injectedBeanService = injectedBeanService;
    }


    @Override
    public boolean sampleMethod() {
        return injectedBeanService.anotherSampleMethod();
    }
}
