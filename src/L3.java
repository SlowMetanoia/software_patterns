public class L3 {
    //Давайте поговорим про POJO
    static class Clazz{
        //Вот у нас есть какой-то оносительно простой класс с констуктором по-умолчанию.
        public Clazz() {
            System.out.println("well, well");
        }
//        И вот у нас появляется поле.
        String description;
//        Чем по вашему хорош и плох прямой вызов полей?

    }
    public static void main(String[] args) {
        Clazz f = new Clazz();
    }
}
