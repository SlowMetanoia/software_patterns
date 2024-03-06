public class GettingSetting {

    //Давайте поговорим про POJO
    static class Clazz{
        //Вот у нас есть какой-то оносительно простой класс с констуктором по-умолчанию.
        public Clazz() {
            System.out.println("well, well");
        }
//        И вот у нас появляется поле.
        String description;
//        Чем по вашему хорош и плох прямой вызов полей?
        //Хорошо, а если так? Плюсы, минусы.
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
        //Ну и естественно, было бы неплохо, чтобы само поле было private.
    }
    public static void main(String[] args) {
        Clazz f = new Clazz();
    }
}
