public class Singleton {
    static class SingleService{
        private static SingleService instance;
        public static SingleService getInstance(){
            if (instance == null) {
                instance = new SingleService();
            }
            return instance;
        }
        int idCounter;
        public int getId(){
            idCounter++;
            return idCounter;
        }
    }
}
