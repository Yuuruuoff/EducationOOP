public class Animal implements AnimalInterface {

    private String voice = "I am animal nahoy";

    Animal(){

    }

   public Animal(String s){
        voice = s;
    }


    // TODO костанта
    public final String MY_CONSTAINT = "const";

    // TODO final переменные не изменяются НИКАК, если они однажды объявлены

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
    @Override
    public String toString() {
return "Constaint: " + MY_CONSTAINT + "\n" + "Voice: " + voice;
    }
}
