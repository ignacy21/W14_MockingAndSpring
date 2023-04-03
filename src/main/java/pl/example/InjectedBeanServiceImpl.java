package pl.example;

public class InjectedBeanServiceImpl implements InjectedBeanService {

    @Override
    public String anotherSampleMethod(String someValue1, String someValue2) {
        return someValue1 + someValue2;
    }
}
