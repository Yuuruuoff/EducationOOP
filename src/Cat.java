public class Cat extends Animal {

    // TODO extends = реализовать

    Cat() {

    }

    Cat(String voice) {
        setVoice(voice);
    }

    public void voice() {
        System.out.println("I am Cat");
    }

    @Override
    public String getVoice() {
        return "Voice";
    }
}
